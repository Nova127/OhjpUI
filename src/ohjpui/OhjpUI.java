/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohjpui;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBoxBuilder;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Harri
 */
public class OhjpUI extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Locale locale = new Locale("en", "EN");
        System.out.println("DEBUG 1");
        //FXMLLoader loader = new FXMLLoader();
        //loader.setResources(ResourceBundle.getBundle("bundles.Bundle", locale));
        //Parent root = loader.load(getClass().getResource("MainWindow.fxml"));
        Parent r = FXMLLoader.load(getClass().getResource("MainWindow.fxml"), ResourceBundle.getBundle("bundles.Bundle", locale));
       
        System.out.println("DEBUG 2");
        //Pane myPane = (Pane)FXMLLoader.load(getClass().getResource("fxml_tableview.fxml"));
        
        Scene scene = new Scene(r);
        stage.setTitle("Kirsikka");
        stage.getIcons().add(new Image("file:kirsikka.png"));
        
        stage.setScene(scene);
        stage.show();
    }
//    public static void createDialog() throws IOException {
//        Stage dialogStage = new Stage();
//        dialogStage.initModality(Modality.WINDOW_MODAL);
//        Pane myPane = (Pane)FXMLLoader.load(getClass().getResource("baseDialog.fxml"));
//        dialogStage.setScene(new Scene(myPane));
////        dialogStage.setScene(new Scene(VBoxBuilder.create().
////                children(new Text("Hi"), new Button("Ok.")).
////                alignment(Pos.CENTER).padding(new Insets(5)).build()));
//        dialogStage.show();
//    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}