/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FreeExercise;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author CODEX
 */
public class FreeExercise extends Application{
    
    public static void main(String[] args) {
        
        launch(args);
        
    }

    @Override
    public void start(Stage stage) throws Exception {
  
        Group root = new Group();
        
        
        String cssFile = getClass().getResource("freeexercise.css").toExternalForm();
        
        
        // Create Scene with background Color
        Scene scene = new Scene(root, 700, 350, Color.LIGHTYELLOW);
     
        scene.getStylesheets().add(cssFile);
        
        Text text = new Text(50, 100, "Hello world");
        text.setId("text");
        
        Button button = new Button("Hello world");
        button.setId("button");
        
        root.getChildren().addAll(text, button);
        
        // set scene on stage with title
        stage.setTitle("Lesson 3 FXML");
        stage.setScene(scene);
        stage.show();
        
    }
    
}
