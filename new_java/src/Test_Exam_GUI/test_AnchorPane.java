package Test_Exam_GUI;

import java.time.Duration;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class test_AnchorPane extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
//		inserting a rotating cylinder in an anchor pane. At the same time, 
//		we are setting it at a distance of 50 units from the pane 
//		from all directions (Top, Left, Right, Bottom).
		
		 //Drawing a Cylinder 
	      Cylinder cylinder = new Cylinder();        
	      
	      //Setting the properties of the Cylinder 
	      cylinder.setHeight(180.0f); 
	      cylinder.setRadius(100.0f);     
	      
	      //Preparing the phong material of type diffuse color 
	      PhongMaterial material = new PhongMaterial();  
	      material.setDiffuseColor(Color.BLANCHEDALMOND); 
	      
	      //Setting the diffuse color material to Cylinder5 
	      cylinder.setMaterial(material);  
	       
	      //Setting rotation transition for the cylinder 
	      RotateTransition rotateTransition = new RotateTransition(); 
	      
	      //Setting the duration for the transition 
	      rotateTransition.setDuration(javafx.util.Duration.millis(1000)); 
	      
	      //Setting the node for the transition 
	      rotateTransition.setNode(cylinder);       
	      
	      //Setting the axis of the rotation 
	      rotateTransition.setAxis(Rotate.Z_AXIS);  
	      
	      //Setting the angle of the rotation 
	      rotateTransition.setByAngle(360);
	      
	      //Setting the cycle count for the transition 
	      rotateTransition.setCycleCount(RotateTransition.INDEFINITE); 
	      
	      //Setting auto reverse value to false 
	      rotateTransition.setAutoReverse(false); 
	      
	      //playing the animation 
	      rotateTransition.play(); 
	      
	      //Creating an Anchor Pane  
	      AnchorPane anchorPane = new AnchorPane();  
	       
	      //Setting the anchor to the cylinder      
	      AnchorPane.setTopAnchor(cylinder, 50.0); 
	      AnchorPane.setLeftAnchor(cylinder, 50.0); 
	      AnchorPane.setRightAnchor(cylinder, 50.0); 
	      AnchorPane.setBottomAnchor(cylinder, 50.0); 
	       
	      //Retrieving the observable list of the Anchor Pane 
	      ObservableList list = anchorPane.getChildren();  
	      
	      //Adding cylinder to the pane 
	      list.addAll(cylinder);        
	         
	      //Creating a scene object 
	      Scene scene = new Scene(anchorPane);  
	      
	      //Setting title to the Stage 
	      stage.setTitle("Anchor Pane Example"); 
	         
	      //Adding scene to the stage 
	      stage.setScene(scene); 
	          
	      //Displaying the contents of the stage 
	      stage.show(); 		
		
	}
	
	 public static void main(String[] args) {
	       launch(args);
	  }
	
}
