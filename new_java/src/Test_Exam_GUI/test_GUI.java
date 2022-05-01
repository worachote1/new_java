package Test_Exam_GUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class test_GUI extends Application {

	   public static void main(String[] args) {
	       launch(args);
	   }
	   
	   @Override
	   public void start(Stage primaryStage) {
		   primaryStage.setTitle("test_GUI");
		// Instantiate a new Grid Pane
	        GridPane gridPane = new GridPane();

	        // Position the pane at the center of the screen, both vertically and horizontally
	        gridPane.setAlignment(Pos.TOP_LEFT);

	        // Set a padding of 20px on each side
	        gridPane.setPadding(new Insets(40, 40, 40, 40));

	        // Set the horizontal gap between columns
	        gridPane.setHgap(10);

	        // Set the vertical gap between rows
	        gridPane.setVgap(10);

	      
	        //Label Section

	        // #1 Add Label
	        Label Annual_Label = new Label("Annual Interest Rate: ");
	        gridPane.add(Annual_Label, 0,1);

	        // #1 Add Text Field
	        TextField Annual_Field = new TextField();
	        Annual_Field.setAlignment(Pos.CENTER_RIGHT);
	        Annual_Field.setPrefWidth(300);
	        gridPane.add(Annual_Field, 1,1);

	        // #2 Add Label
	        Label year_Label = new Label("Number of Years: ");
	        gridPane.add(year_Label, 0, 2);

	        // #2 Add Text Field
	        TextField year_Field = new TextField();
	        year_Field.setAlignment(Pos.CENTER_RIGHT);
	        gridPane.add(year_Field, 1, 2);
	        
	        // #3 Add Label
	        Label loan_Label = new Label("Loan Amount: ");
	        gridPane.add(loan_Label, 0, 3);

	        // #3 Add Text Field
	        TextField loan_Field = new TextField();
	        loan_Field.setAlignment(Pos.CENTER_RIGHT);
	        gridPane.add(loan_Field, 1, 3);
	     
	        // #4 Add Label
	        Label monthly_Label = new Label("Monthly Payment: ");
	        gridPane.add(monthly_Label, 0, 4);

	        // #4 Add Text Field
	        TextField monthly_Field = new TextField();
	        monthly_Field.setAlignment(Pos.CENTER_RIGHT);
	        gridPane.add(monthly_Field, 1, 4);
	        
	        // #5 Add Label
	        Label total_Label = new Label("Total Payment: ");
	        gridPane.add(total_Label, 0, 5);

	        // #5 Add Text Field
	        TextField total_Field = new TextField();
	        total_Field.setAlignment(Pos.CENTER_RIGHT);
	        gridPane.add(total_Field, 1, 5);
	        
	        //Hbox layout which contain all buttons
	        
	        //Set leftHbox
	        HBox left_hbox = new HBox(10);
	        //Left button
	        Button save_btn = new Button("Save");
            left_hbox.getChildren().add(save_btn);
            
            Button load_btn = new Button("Load");
            left_hbox.getChildren().add(load_btn);
            
	        //Set rightHbox
	        HBox right_hbox = new HBox(10);
	        //Right button
	        Button clear_btn = new Button("Clear");
            right_hbox.getChildren().add(clear_btn);
            
            Button calculate_btn = new Button("Calculate");
            right_hbox.getChildren().add(calculate_btn);           
            right_hbox.setAlignment(Pos.BOTTOM_RIGHT);
            //add both Hbox layout to grid layout
            gridPane.add(left_hbox, 0, 8);
            gridPane.add(right_hbox, 1,8);

  
	        gridPane.setAlignment(Pos.TOP_CENTER);
		    primaryStage.setScene(new Scene(gridPane, 604, 444 ));
		    
		    primaryStage.show();
		   
	   }
}
