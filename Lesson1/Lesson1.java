package Lesson1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author CODEX
 */
// ----------------------------Application is the class which all these stuffs are inherit 
public class Lesson1 extends Application {
    
    
    // the javaFX starts from here by playing wiith the Stage
    @Override
    public void start(Stage stage) {
        
        
        // 1. Create a group for nodes
        Group root = new Group();
        
        // 2. Create a scene object and pass the root into it with a specifi with and height and color
        Scene scene = new Scene(root, 500, 250, Color.LIGHTGREEN);
        
       
        // setting the properies of stage and showing it 
        stage.setTitle("My First Program");
        stage.setScene(scene);
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // start of JavaFX from here
        launch(args);
    }
    
}
