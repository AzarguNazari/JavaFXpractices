
package Lesson3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author CODEX
 */
public class Lesson3Controller implements Initializable {

    // Annotation is important to get control to FXML elements
    @FXML
    private Rectangle rectangle; // name should be same as FXML id
    
    @FXML
    private Text text;  // name should be same as FXML id
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        // Creating a fade Transition
        
        FadeTransition fade = new FadeTransition(Duration.seconds(1.5), text);
        fade.setFromValue(1.0);
        fade.setToValue(0);
        fade.setCycleCount(Animation.INDEFINITE);
        fade.setAutoReverse(true);
        fade.play();
    }    
    
}
