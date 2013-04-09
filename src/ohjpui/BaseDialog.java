/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohjpui;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.*;

/**
 *
 * @author Harri
 */
public class BaseDialog extends BorderPane
{
    public BaseDialog(final Locale locale)
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BaseDialog.fxml"), ResourceBundle.getBundle("bundles.Bundle", locale));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch(IOException | NullPointerException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    public void setContentPane(Pane contents)
    {
        this.setCenter(contents);
    }
    
    @FXML protected void accept(ActionEvent ae)
    {
        System.out.println("OK button pressed!");
    }
    
    @FXML protected void reject(ActionEvent ae)
    {
        System.out.println("Cancel button pressed!");
    }


}
