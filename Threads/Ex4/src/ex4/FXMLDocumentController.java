
package ex4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXML;


/**
 *
 * @author beatr
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private Button ini;
    @FXML
    private Button per1;
    @FXML
    private Button per2;
    @FXML
    private Button per3;
    @FXML
    private Button per4;
    @FXML
    private Button per5;
    @FXML
    private Label linha;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    @FXML
    public void handleButonini() {

        Runnableper runnableper1 = new Runnableper (per1 , "");
        Runnableper runnableper2 = new Runnableper (per2 , "");
        Runnableper runnableper3 = new Runnableper (per3 , "");
        Runnableper runnableper4 = new Runnableper (per4 , "");
        Runnableper runnableper5 = new Runnableper (per5 , "");
        
        Thread threadper1 = new Thread(runnableper1, "1");
        Thread threadper2 = new Thread(runnableper2, "2");
        Thread threadper3 = new Thread(runnableper3, "3");
        Thread threadper4 = new Thread(runnableper4, "4");
        Thread threadper5 = new Thread(runnableper5, "5");
        
        threadper1.start();
        threadper2.start();
        threadper3.start();
        threadper4.start();
        threadper5.start();
    } 

    
}
