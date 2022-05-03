package Test_Exam_GUI;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class TestSlider extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
        // creating group
        //Group root = new Group();
        GridPane root = new GridPane();
	
 
        // set title for the frame
        stage.setTitle("Slider Sample");
 
        // create slider
        Slider slider = new Slider();
        //slider.setValue(60);
        slider.setPrefWidth(150);
       // slider.setMaxWidth(Region.USE_PREF_SIZE);
        //slider.setMinWidth(30);
        slider.setValue(30);
        root.add(slider, 0, 0);
        
        System.out.println("prn = "+slider.getValue());
       
        TextField value_textField = new TextField();
        
        value_textField.setText(String.valueOf(slider.getValue()));
        root.add(value_textField, 1, 0);
        
        slider.setOrientation(Orientation.VERTICAL);
        

       stage.setScene(new Scene(root, 600, 400));
       
        stage.show();
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
