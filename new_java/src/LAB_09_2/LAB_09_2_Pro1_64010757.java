package LAB_09_2;

import javafx.application.Application;
import javafx.stage.Stage;


import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LAB_09_2_Pro1_64010757 extends Application {


    ImageView[] imgView = new ImageView[4];

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Program # 1");
        GridPane gp = new GridPane();
         
        String list_img[] = {
        	"england","canada","vietnam","usa"	
        };
        
        for (int i = 0; i < 4; i++) {
            imgView[i] = new ImageView(getClass().getResource(list_img[i]+ ".png").toExternalForm());
        }

        int count_img = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                GridPane.setConstraints(imgView[(2 * i) + j], j, i);
                imgView[count_img].setFitWidth(300);
                imgView[count_img].setFitHeight(300);
                
                count_img++;
            }
        }
        gp.getChildren().addAll(imgView);

        primaryStage.setScene(new Scene(gp, 600, 600));
        primaryStage.show();
    }
	}