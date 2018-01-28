/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.stage.Stage;

/**
 *
 * @author CODEX
 */
public class Lesson6 extends Application{
    
    public static void main(String[] args) {
        
        Application.launch(args);
        
    }

    @Override
    public void start(Stage stage) throws Exception {

        
        // to create a group of nodes
        Group root = new Group();
        
        
        // line 1 with a simple stroke of 5px and gree
        Line line1 = new Line(20, 50, 400, 50);
        line1.setStroke(Color.GREEN);
        line1.setStrokeWidth(10);
        
        // line 2 with blue color, 5px stroke but the stroke is rounded at the end point
        Line line2 = new Line(20, 80, 400, 80);
        line2.setStroke(Color.BLUE);
        line2.setStrokeWidth(10);
        line2.setStrokeLineCap(StrokeLineCap.ROUND);
        
        // line 3 with red color, dashed format and each dashed has 10d white space 
        Line line3 = new Line(20, 110, 400, 110);
        line3.setStroke(Color.RED);
        // it can have only one argument like 20d 
        line3.getStrokeDashArray().addAll(20d, 10d);
        line3.setStrokeWidth(5);
        
         // adding all the elements into group
        //root.getChildren().addAll(line1, line2, line3);
        
        
        //---------------------------- Circle section ----------
        int radius = 40;
        int strokeWidth = 3;
        Color strokeColor = Color.BROWN;
        
        
        Circle circle1 = new Circle(120, 100, radius, Color.CORAL);
        circle1.setStroke(strokeColor);
        circle1.setStrokeWidth(strokeWidth);
        
        Circle circle2 = new Circle(220, 100, radius, Color.YELLOW);
        circle2.setStroke(strokeColor);
        circle2.setStrokeWidth(strokeWidth);
        
        
        //root.getChildren().addAll(circle1, circle2);  
        
        
        
        //------------------------ Rectangle Shape --------------
       
        int recStroke = 3;
        int arcWidth = 30;
        int arcHeight = 30;
        
        Rectangle square = new Rectangle(40, 40, 80, 80);
        square.setFill(Color.LIGHTGRAY);
        square.setStroke(strokeColor);
        square.setStrokeWidth(recStroke);
        
        Rectangle rounded = new Rectangle(180, 40, 220, 100);
        rounded.setArcHeight(arcHeight);
        rounded.setArcWidth(arcWidth);
        rounded.setFill(Color.CYAN);
        rounded.setStroke(strokeColor);
        rounded.getStrokeDashArray().addAll(10d, 8d);
        
        root.getChildren().addAll(square, rounded);
        
        
        // creating scene with width of 450 and height of 300 yellow
        Scene scene = new Scene(root, 450, 200, Color.LIGHTYELLOW);
        
        
        // setting the stage of line
        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();


    }
    
    
    
}
