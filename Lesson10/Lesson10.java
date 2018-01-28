
package Lesson10;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.PathElement;
import javafx.scene.shape.QuadCurveTo;
import javafx.stage.Stage;

public class Lesson10 extends Application{
    
    public static void main(String[] args) {
        
        launch(args);
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        Group root = new Group();
        
        
        // create the start point of white quadCuve
        MoveTo mov1 = new MoveTo(100, 150);
        
        QuadCurveTo quadC = new QuadCurveTo();
        quadC.setX(200);    // the end of quadCuve
        quadC.setY(150);    // the end of quadCuve
        quadC.setControlX(150); // the control of quadCuve
        quadC.setControlY(50);  // the contorl of quadCuve
        
        Path path1 = new Path(
                new PathElement[]{
                    mov1, quadC // create the path through the moveTo and QuadCuve elements
                }
        );
        path1.setFill(Color.WHITE);
        path1.setStrokeWidth(3);
        
        MoveTo mov2 = new MoveTo(200, 150); // the start of MovoTo 
        LineTo line1 = new LineTo(100, 150);    // the first line
        LineTo line2 = new LineTo(150, 275);    // the second line
        LineTo line3 = new LineTo(200, 150);    // the thirth line
      

        Path path2 = new Path(
                new PathElement[]{
                    mov2, line1, line2, line3   // adding all the lines and moveTo
                }
        );
        path2.setFill(Color.GOLDENROD);
        path2.setStrokeWidth(3);
        
        root.getChildren().addAll(path1, path2);
        
        Scene scene = new Scene(root, 300, 400, Color.LIGHTGREEN);
        
        stage.setScene(scene);
        stage.setTitle("Lesson 10");
        stage.show();
        
    }
    
}
