/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohjpui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;

/**
 * FXML Controller class
 *
 * @author Harri
 */
public class BaseDialogController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML private void handleButton(ActionEvent event){
        Node n = (Node)event.getSource();
        System.out.println(n.getId());
    }
}
