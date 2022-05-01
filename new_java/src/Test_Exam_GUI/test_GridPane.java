package Test_Exam_GUI;

import java.awt.Insets;
import java.awt.Label;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class test_GridPane extends Application {

	@Override
	public void start(Stage stage) throws Exception {
	
		  GridPane gridPane = new GridPane();   
		  
		  gridPane.setAlignment(Pos.CENTER);
	      
		  gridPane.setHgap(10);
		  gridPane.setVgap(10);
		  
		  //creating label email 
	      javafx.scene.control.Label text1 = new javafx.scene.control.Label("Email : ");  
	      
	      //creating label password 
	      javafx.scene.control.Label text2 = new javafx.scene.control.Label("Password"); 
		  
	      //Creating Text Filed for email        
	      TextField textField1 = new TextField();       
	      textField1.setPrefWidth(400);
	      
	      //Creating Text Filed for password        
	      TextField textField2 = new TextField();  
	       
	      //Creating Buttons 
	      Button button1 = new Button("Submit"); 
	      Button button2 = new Button("Clear");  
	       
	      //Arranging all the nodes in the grid 
	      gridPane.add(text1, 0, 0); 
	      gridPane.add(textField1, 1, 0); 
	      gridPane.add(text2, 0, 1);       
	      gridPane.add(textField2, 1, 1); 
	      gridPane.add(button1, 0, 2); 
	      gridPane.add(button2, 1, 2);  
	      
	      
	      //Setting title to the Stage 
	      stage.setTitle("Grid Pane Example"); 
	         
	      //Adding scene to the stage 
	      stage.setScene(new Scene(gridPane,600,400)); 
	         
	      //Displaying the contents of the stage 
	      stage.show(); 
	}

	public static void main(String[] args) {
		
		launch(args);
	}

}
