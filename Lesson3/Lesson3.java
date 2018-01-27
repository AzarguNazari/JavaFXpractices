
package Lesson3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Lesson3 extends Application {
    
    
    
    public static void main(String[] args) {
        
        launch(args);
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        // Load component from FXML file
        Parent root = FXMLLoader.load(getClass().getResource("Lesson3.fxml"));
        
        
        // Create Scene with background Color
        Scene scene = new Scene(root, 700, 350, Color.LIGHTYELLOW);
     
        // set scene on stage with title
        stage.setTitle("Lesson 3 FXML");
        stage.setScene(scene);
        stage.show();
    }
    
}
