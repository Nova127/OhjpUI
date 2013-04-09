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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Harri
 */
public class MainWindowController implements Initializable {
    
    @FXML private MenuBar menuBar;
    @FXML private Pane contentPane;
    
    
   
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Button btn = (Button)(event.getSource());
        
        System.out.println("DEBUG 3");
        System.out.println(btn.getId());
//        MainWindowUI.createDialog();
        //String fxml = "BaseDialog.fxml"; 
        Locale loc = new Locale("fi", "FI");
        BaseDialog pane = new BaseDialog(loc);
        
        Pane myPane = (Pane)FXMLLoader.load(getClass().getResource("addNewArtistDialog.fxml"), ResourceBundle.getBundle("bundles.Bundle", loc));
        pane.setContentPane(myPane);
        
        pane.setPrefWidth(600);
        
        System.out.println("DEBUG 4");
        Stage dialogStage = new Stage();
        dialogStage.initModality(Modality.APPLICATION_MODAL);
        //Pane myPane = (Pane)FXMLLoader.load(getClass().getResource(fxml), ResourceBundle.getBundle("bundles.Bundle", loc));
        dialogStage.setScene(new Scene(pane));
        System.out.println("DEBUG 5");
//        dialogStage.setScene(new Scene(VBoxBuilder.create().
//                children(new Text("Hi"), new Button("Ok.")).
//                alignment(Pos.CENTER).padding(new Insets(5)).build()));
        dialogStage.show();
    }
    @FXML
    private void onClick(ActionEvent event) {
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
