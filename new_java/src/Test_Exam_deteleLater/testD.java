package Test_Exam_deteleLater;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class testD extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		GridPane  gp = new GridPane();
		gp.setHgap(10);
		gp.setVgap(10);
		gp.setPadding(new Insets(20,20,20,20));
		gp.setAlignment(Pos.CENTER);
		
		Label email_label = new Label("Email : "); 
		
		Label password_label = new Label("Password : "); 
		password_label.setPrefWidth(100);
		
		TextField email_textfield = new TextField(); email_textfield.setPrefWidth(350);
		TextField password_textField = new PasswordField(); password_textField.setPrefWidth(350);
		
		Button submit_btn = new Button("Submit");
		Button clear_btn = new Button("Clear");
		
		// .add(column , row)
		gp.add(email_label, 0, 0);
		gp.add(email_textfield, 1, 0);
		
		gp.add(password_label, 0, 1);
		gp.add(password_textField, 1, 1);
		
		gp.add(submit_btn, 0, 2);
		gp.add(clear_btn, 1, 2);
		
	      //Styling nodes  
	      submit_btn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
	      clear_btn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
	       
	      email_label.setStyle("-fx-font: normal bold 20px 'serif' "); 
	      password_label.setStyle("-fx-font: normal bold 20px 'serif' ");  
	      gp.setStyle("-fx-background-color: BEIGE;"); 
		
		stage.setTitle("Test GridPane");
		stage.setScene(new Scene(gp,600,400));
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
