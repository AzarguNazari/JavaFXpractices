package Lesson2;


import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Shadow;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CODEX
 */
public class Lesson2 extends Application{

    @Override
    public void start(Stage stage){
        
        
        // Stackpane is like div in HTML
        StackPane root = new StackPane();
        
        // To drop shadow on the rectangular 
        // shadow {
        //     box-shadow: 3px 0 grey;
        // }
        DropShadow shadow = new DropShadow();
        shadow.setColor(Color.GRAY);
        shadow.setOffsetY(3.0);
        
        
        // Rectangular for containing the text
        Rectangle rectangle = new Rectangle(500, 60, Color.LIGHTSKYBLUE);
        rectangle.setArcHeight(20);
        rectangle.setArcWidth(20);
        // Applying the shadow effect on the rectangular
        rectangle.setEffect(shadow);

        
        Text text = new Text("This is Azargul Nazari, Fuckers!");
        text.setFill(Color.DARKSLATEGREY);
        text.setFont(Font.font(null, FontWeight.BOLD, 32));
        text.setEffect(shadow);
        
        
        // Creating the FadeTransition for fading in and fading out the text
        FadeTransition fade = new FadeTransition(Duration.seconds(1.5), text);
        fade.setFromValue(1.0);
        fade.setToValue(0);
        fade.setCycleCount(Animation.INDEFINITE);
        fade.setAutoReverse(true);
        fade.play();
        
        
        
        // adding the children nodes into the StackPane container
        root.getChildren().addAll(rectangle, text);
        
        
        // Creating the scene for the window
        Scene scene = new Scene(root, 600, 250, Color.LIGHTYELLOW);
        
        stage.setTitle("Second Lesson");
        stage.setScene(scene);
        stage.show();
        
    }
    
    public static void main(String[] args){
    
        launch(args);
        
    }
    
}
