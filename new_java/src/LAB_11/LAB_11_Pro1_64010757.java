package LAB_11;

import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class LAB_11_Pro1_64010757 extends Application {
	   public static void main(String[] args) {
	       launch(args);
	   }
	   
	   @Override
	   public void start(Stage primaryStage) {
		   primaryStage.setTitle("Registration Form JavaFX Application");
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
          
        
            // action event
            
            //save_event
            EventHandler<ActionEvent> save_event = new EventHandler<ActionEvent>() {
                public void handle(ActionEvent e)
                {
                	//System.out.println("test save");
                	
                }
            };
            //load_event
            EventHandler<ActionEvent> load_event = new EventHandler<ActionEvent>() {
                public void handle(ActionEvent e)
                {
                	 //System.out.println("test load");
                	
                }
            };
            //clear_event
            EventHandler<ActionEvent> clear_event = new EventHandler<ActionEvent>() {
                public void handle(ActionEvent e)
                {
                	//System.out.println("test clear");
                	Annual_Field.setText("");
                	year_Field.setText("");
                	loan_Field.setText("");
                	monthly_Field.setText("");
                	total_Field.setText("");
                }
            };
            //calculate_event
            EventHandler<ActionEvent> calculate_event = new EventHandler<ActionEvent>() {
                public void handle(ActionEvent e)
                {
                    //System.out.println("test calculate");
                	double interestRate = Double.parseDouble(Annual_Field.getText());
                	int year = Integer.parseInt(year_Field.getText());
                	double loan = Double.parseDouble(loan_Field.getText());
                	
                	double r = interestRate / 1200;
                	int n = year * 12;
                	
                	double monthlyPayment = (loan * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
                	double totalPayment =  monthlyPayment * 12 * year;
                
                	//display
                	monthly_Field.setText(String.valueOf(String.format("$%.2f", monthlyPayment)));
                	total_Field.setText(String.valueOf(String.format("$%.2f", totalPayment)));
                	
                }
            };
            
            save_btn.setOnAction(save_event);
            load_btn.setOnAction(load_event);
            clear_btn.setOnAction(clear_event);
            calculate_btn.setOnAction(calculate_event);
            
	        gridPane.setAlignment(Pos.TOP_CENTER);
		    primaryStage.setScene(new Scene(gridPane, 600, 400 ));
		        
		  
		    primaryStage.show();
	   }
	}
