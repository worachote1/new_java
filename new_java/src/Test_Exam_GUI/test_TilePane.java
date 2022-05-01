package Test_Exam_GUI;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class test_TilePane extends Application {

	@Override
	public void start(Stage stage) throws Exception {

//		If we use this pane in our application,
//		all the nodes added to it 
//		are arranged in the form of uniformly sized tiles.
		
//		The following program is an example of the tile pane layout. 
//		In this, we are creating a tile pane which holds 7 buttons.
		
	      //Creating an array of Buttons 
	      Button[] buttons = new Button[] { 
	         new Button("SunDay"), 
	         new Button("MonDay"), 
	         new Button("TuesDay"), 
	         new Button("WednesDay"), 
	         new Button("ThursDay"), 
	         new Button("FriDay"), 
	         new Button("SaturDay")  
	      };   
	      //Creating a Tile Pane 
	      TilePane tilePane = new TilePane();   
	      
	      tilePane.setHgap(10);
	      tilePane.setVgap(10);
	      
	      //Setting the orientation for the Tile Pane 
	      tilePane.setOrientation(Orientation.HORIZONTAL); 
	       
	      //Setting the alignment for the Tile Pane 
	      tilePane.setTileAlignment(Pos.CENTER_LEFT); 
	       
	      //Setting the preferred columns for the Tile Pane 
	      //tilePane.setPrefRows(4);  
	      
	      //Retrieving the observable list of the Tile Pane 
	      ObservableList list = tilePane.getChildren(); 
	       
	      //Adding the array of buttons to the pane 
	      list.addAll(buttons);
		   
	      
	      //Setting title to the Stage 
	      stage.setTitle("Tile Pane Example44"); 
	         
	      //Adding scene to the stage 
	      stage.setScene(new Scene(tilePane,700,400)); 
	         
	      //Displaying the contents of the stage 
	      stage.show(); 
		   
		
	}

	public static void main(String[] args) {
		
		launch(args);
	}

}
