
package Lesson5;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextShape extends Application{
    
    public static void main(String[] args) {
        
        launch(args);
        
    }

    @Override
    public void start(Stage stage) throws Exception {

        // TO group nodes
        Group root = new Group();
        
        
        // creating scene of page == document in javascript and html
        Scene scene = new Scene(root, 650, 200, Color.LIGHTYELLOW);
        
        // get the full path of css file
        String cssFile = getClass().getResource("lesson5.css").toExternalForm();
        
        // Add the css file into the scene and parse it
        scene.getStylesheets().add(cssFile);
        
        // creating text with margin of 50,100
        Text text = new Text(50, 100, "Here's a Text String");
        
        // setting the id of the text for css purpose
        text.setId("myText");
        
        
        // adding the text into the group
        root.getChildren().add(text);
        
        stage.setTitle("Lesson 5");
        stage.setScene(scene);
        stage.show();
    }
    
}
