package Lesson7;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Lesson8 extends Application{
    
    public static void main(String[] args) {
        
        launch(args);
        
    }

    @Override
    public void start(Stage stage) throws Exception {

        
            Group root = new Group();
            
            /*
            // creating ellipse
            Ellipse ellipse = new Ellipse();
            ellipse.setCenterX(300);
            ellipse.setCenterY(100);
            ellipse.setRadiusX(100);
            ellipse.setRadiusY(100);
            ellipse.setFill(Color.CORAL);
            ellipse.setStroke(Color.BLUE);
            ellipse.setStrokeWidth(2);
            
            root.getChildren().addAll(ellipse);
            */

            
            /*
            // Creaing stop sign using polygon
            Polygon stopSign = new Polygon(
                    new double[]{
                        175.0, 45.0, 225.0, 45.0,
                        265.0, 75, 265, 125,
                        225, 155, 175, 155,
                        135, 125, 135, 75
                    }
            );
            stopSign.setFill(Color.RED);
            stopSign.setStroke(Color.WHITE);
            stopSign.setStrokeWidth(4);
            
            Text stop = new Text(142, 117, "STOP");
            stop.setFont(Font.font("Arial", FontWeight.BOLD, 45));
            stop.setFill(Color.WHITE);
            
            root.getChildren().addAll(stopSign, stop);
            */
            
            Polyline polyline = new Polyline(
                    new double[]{
                        175.0, 45.0, 225.0, 45.0,
                        265.0, 75, 265, 125,
                        225, 155, 175, 155,
                        135, 125, 135, 75
                    }
            );
            polyline.setFill(Color.RED);
            polyline.setStroke(Color.WHITE);
            polyline.setStrokeWidth(4);
            root.getChildren().addAll(polyline);

            Scene scene = new Scene(root, 600, 200, Color.LIGHTGREEN);
            
            stage.setScene(scene);
            stage.setTitle("Lesson 8");
            stage.show();

    }
    
    
    
}
