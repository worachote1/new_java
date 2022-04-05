package FirstTimeJavaFX;

import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class firstTime extends Application {
	   public static void main(String[] args) {
	       launch(args);
	   }
	   
	   @Override
	   public void start(Stage primaryStage) {
		     primaryStage.setTitle("Pro_2_64010757");

		        GridPane root = new GridPane();
		        
		        TextField[] textfield = new TextField[100];
		        final int WIDTH = 50;
		        final int HEIGHT = 50;
		        for (int i = 0; i < 10; i++) {
		            for (int j = 0; j < 10; j++) {

		                TextField tf = new TextField();
		                tf.setPrefWidth(WIDTH);
		                tf.setPrefHeight(HEIGHT);
		                tf.setAlignment(Pos.CENTER);

		                Random rd = new Random();
		                tf.setText(String.valueOf(rd.nextInt(2)));
		                
		               
		                int index_of_textField = i * 10 + j;
		                textfield[index_of_textField] = tf;

		                int row_index = i,column_index = j;
		                
		                GridPane.setConstraints(textfield[index_of_textField], column_index, row_index);

		            }
		        }

		        root.getChildren().addAll(textfield);

		        primaryStage.setScene(new Scene(root, (WIDTH*10), (HEIGHT*10)));
		        primaryStage.show();
	   }
	}
