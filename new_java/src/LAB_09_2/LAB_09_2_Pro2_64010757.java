package LAB_09_2;

import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LAB_09_2_Pro2_64010757 extends Application {
	   public static void main(String[] args) {
	       launch(args);
	   }
	   
	   @Override
	   public void start(Stage primaryStage) {
		     primaryStage.setTitle("LAB_09_2_Pro2_64010757");

		        GridPane gp = new GridPane();
		        
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

		        gp.getChildren().addAll(textfield);
		        //gp.setRotate(44);
		        primaryStage.setScene(new Scene(gp, (WIDTH*10), (HEIGHT*10)));
		        
		       // gp.getChildren().clear();
		        primaryStage.show();
	   }
	}
