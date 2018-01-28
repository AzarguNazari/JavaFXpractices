/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.QuadCurve;
import javafx.stage.Stage;

/**
 *
 * @author CODEX
 */
public class Lesson9 extends Application{
    
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group(); 
        
        /*
        // 3 Arcs with 3 different types
        Arc arc1 = createArc(ArcType.ROUND, 80);
        Arc arc2 = createArc(ArcType.CHORD, 200);
        Arc arc3 = createArc(ArcType.OPEN, 320);
        
        root.getChildren().addAll(arc1, arc2, arc3);
        */
        
        
        QuadCurve quadCurve = new QuadCurve();
        quadCurve.setStartX(100);
        quadCurve.setStartY(125);
        quadCurve.setEndX(200);
        quadCurve.setEndY(125);
        quadCurve.setControlX(150);
        quadCurve.setControlY(25);
        quadCurve.setFill(Color.CORAL);
        quadCurve.setStroke(Color.BLUE);
        
        
        CubicCurve cubicCurve = new CubicCurve();
        cubicCurve.setStartX(300);
        cubicCurve.setStartY(125);
        cubicCurve.setControlX1(325);
        cubicCurve.setControlY1(-25);
        cubicCurve.setControlX2(420);
        cubicCurve.setControlY2(275);
        cubicCurve.setEndX(475);
        cubicCurve.setEndY(125);
        cubicCurve.setFill(Color.CORAL);
        cubicCurve.setStroke(Color.BLUE);
        
        
        
        root.getChildren().addAll(quadCurve, cubicCurve);
        
        
        Scene scene = new Scene(root, 400, 200, Color.LIGHTGREEN);
        
        stage.setScene(scene);
        stage.setTitle("Lesson 9");
        stage.show();

    }
    
    private static Arc createArc(ArcType arcType, double x){
        
        Arc temp = new Arc();
        temp.setCenterX(x);
        temp.setCenterY(100);
        temp.setRadiusX(40);
        temp.setRadiusY(40);
        temp.setStartAngle(45);
        temp.setLength(270);
        temp.setFill(Color.CORAL);
        temp.setStroke(Color.BLUE);
        temp.setType(arcType);
        return temp;
    }
    
}
