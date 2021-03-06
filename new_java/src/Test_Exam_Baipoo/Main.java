package Test_Exam_Baipoo;

import java.io.File;
import java.util.Observable;

//import java.lang.*;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.FontWeight;
import javafx.util.Duration;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		File file = new File("Saudi_theme.mp4");
		 Media media = new Media(file.toURI().toString());
	        MediaPlayer mediaPlayer = new MediaPlayer(media);
	        MediaView mediaView = new MediaView(mediaPlayer);

	        Button playButton = new Button(">");
	        playButton.setPrefWidth(50);
	        playButton.setOnAction(e -> {
	            if (playButton.getText().equals(">")) {
	                mediaPlayer.play();
	                playButton.setText("||");
	            } else {
	                mediaPlayer.pause();
	                playButton.setText(">");
	            }
	        });

	        Button rewindButton = new Button("<<");
	        rewindButton.setPrefWidth(50);
	        rewindButton.setOnAction(e -> mediaPlayer.seek(Duration.ONE));

	        Slider slVolume = new Slider();
	        slVolume.setPrefWidth(150);
	        slVolume.setMaxWidth(Region.USE_PREF_SIZE);
	        slVolume.setMinWidth(30);
	        slVolume.setValue(50);
	        slVolume.setShowTickLabels(true);
	        mediaPlayer.volumeProperty().bind(slVolume.valueProperty().divide(100));
	        
	        //test 
	        Label label_showVolume = new Label();
	        slVolume.valueProperty().addListener((ObservableValue,oldValue,newValue) -> {
	        	
	        	label_showVolume.setText(" "+String.valueOf(newValue.intValue())+" %");
	        });

	        HBox hBox = new HBox(10);
	        
	        hBox.setAlignment(Pos.CENTER);
	        hBox.getChildren().addAll(playButton, rewindButton,
	                new Label("Volume"), slVolume,label_showVolume);

	        BorderPane pane = new BorderPane();
	        pane.setCenter(mediaView);
	        pane.setBottom(hBox);

	        // Create a scene and place it in the stage
	        Scene scene = new Scene(pane, 1100, 750);
	        primaryStage.setTitle("Exam OOP javaFX"); // Set the stage title
	        primaryStage.setScene(scene); // Place the scene in the stage
	        primaryStage.show(); // Display the stage
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}