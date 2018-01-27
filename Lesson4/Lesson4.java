package Lesson4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Lesson1.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author CODEX
 */
// ----------------------------Application is the class which all these stuffs are inherit 
public class Lesson4 extends Application {
    
    
    // the javaFX starts from here by playing wiith the Stage
    @Override
    public void start(Stage stage) {
        
        
        // 1. Create a group for nodes
        Group root = new Group();
        
        // 2. Create a scene object and pass the root into it with a specifi with and height and color
        Scene scene = new Scene(root, 500, 250, Color.LIGHTGREEN);
        
        Text text = new Text(20, 20, "Hello This is a text shape");
        text.setFont(Font.font(70));
        
        // to set the color, it can be color or grediant
        text.setFill(Color.GREEN);
        
        // to make it smooth looking
        text.setSmooth(true);
        
        // to show the border as stroke 
        text.setStroke(Color.BLUE);
        
        // set the width of stroke and default value is 1
        text.setStrokeWidth(20);
        
        // index into dash array for the beginning of the dash 
        text.setStrokeDashOffset(2);
        
        text.setStrokeLineJoin(StrokeLineJoin.MITER);
        
        text.setStrokeLineCap(StrokeLineCap.SQUARE);
        
  
        
        //Createing colors
        Color green = Color.GREEN;
        Color red = new Color(1,0,0,1.0);
        Color blue = Color.color(0, 0, 1);
        Color green2 = Color.rgb(0, 255, 0);
        
        // Creating Font
        Font font = new Font(12);
        
        Font.font("Arial", FontWeight.BOLD, 15);
       
        
        
        
        root.getChildren().addAll(text);
        
        
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
