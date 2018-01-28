/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author CODEX
 */
public class Lesson7 extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        
        Group root = new Group();
        
        /*
        Rectangle rect1 = makeRectangle(40, 0, 1); // verical
        Rectangle rect2 = makeRectangle(200, 1, 0); // horizontal
        Rectangle rect3 = makeRectangle(360, .1, .6); // diagonal
     
        root.getChildren().addAll(rect1, rect2, rect3);
        */

        Circle circle1 = makeCircle(80, .25, .75);
        Circle circle2 = makeCircle(200, .5, .5);
        Circle circle3 = makeCircle(320, .75, .25);
        
        root.getChildren().addAll(circle1, circle2, circle3);
        

        Scene scene = new Scene(root, 600, 500, Color.LIGHTGRAY);
        
        stage.setScene(scene);
        stage.setTitle("Lesson 7");
        stage.show();
        
        
    }
    
    private Circle makeCircle(double centerX, double x, double y){
        
        Circle temp = new Circle(40); // radius
        temp.setCenterX(centerX);
        temp.setCenterY(180);
        temp.setFill(doRadialGradient(x,y));
        
        return temp;
        
    }
    
    
    private RadialGradient doRadialGradient(double x, double y){

            
        RadialGradient radialGrad = new RadialGradient(
                0,                      // focusAngle
                0,                      // focusDistance
                x,                      // centerX
                y,                      // CenterY
                .5,                     // rdius
                true,                   // proportional
                CycleMethod.NO_CYCLE,   // cycleMethod
                new Stop(0.0, Color.WHITE), new Stop(1.0, Color.DARKGREEN) // stops
        );

        return radialGrad;
    }
    
    
    
    
    private Rectangle makeRectangle(double y, double scaleX, double scaleY){
        
        Rectangle temp = new Rectangle();
        temp.setX(180);
        temp.setY(y);
        temp.setWidth(220);
        temp.setHeight(100);
        temp.setArcHeight(30);
        temp.setArcWidth(30);
        temp.setFill(doLinearGradient(scaleX, scaleY));
        
        return temp;
    }
    
    private LinearGradient doLinearGradient(double scaleX, double scaleY){
        
        LinearGradient linearGrad = new LinearGradient(
                180,                    // Start X
                40,                     // Start Y
                180 + scaleX * 220,     // end X
                40 + scaleY * 100,      // End y
                false,                  // proportional
                CycleMethod.REFLECT,    // CycleMethod
                new Stop(0.0, Color.ORANGE), new Stop(1.0, Color.BROWN) // stops
        );
        
        return linearGrad;
    }
    
}
