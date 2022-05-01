package Test_Exam_GUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class test_Hbox extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub

	
		Button playButton = new Button("Play");
		Button stopButton = new Button("Stop");
		TextField textField = new TextField();
		textField.setPrefWidth(200);
		// Hbox
		HBox hbox = new HBox();
		
		// Set space between the node of a HBox pane
		hbox.setSpacing(10);
		
		// Set the margin to the nodes
		hbox.setMargin(textField, new Insets(20, 20, 20, 20));
		hbox.setMargin(playButton, new Insets(20, 20, 20, 20));
		hbox.setMargin(stopButton, new Insets(20, 20, 20, 20));
		//
		hbox.getChildren().addAll(textField ,playButton,stopButton);
		
		hbox.setAlignment(Pos.CENTER_RIGHT);
		
		//Set Title
		stage.setTitle("Test_Hbox");
		
		//

		stage.setScene(new Scene(hbox,600,400));
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch(args);
	}

}
