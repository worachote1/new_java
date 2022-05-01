package Test_Exam_GUI;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class test_BorderPane extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		BorderPane bPane = new BorderPane();
		
		TextField top = new TextField();
		TextField left = new TextField();
		TextField center = new TextField();
		TextField right = new TextField();
		TextField bottom = new TextField();
		
		bPane.setTop(top);
		bPane.setLeft(left);
		bPane.setCenter(center);
		bPane.setRight(right);
		bPane.setBottom(bottom);
		
		bottom.setPrefWidth(100);
		
		stage.setTitle("Test_BorderPlane");
		
		stage.setScene(new Scene(bPane,600,400));
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
