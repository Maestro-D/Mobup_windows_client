/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eip_client_windows;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Boutet
 */
public class EIP_Client_Windows extends Application {
    private Parent root;
    private Scene scene;
    
    @Override
    public void start(Stage stage) throws Exception {
        try {
                root = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
                scene = new Scene(root);
                stage.setScene(scene);
                stage.setTitle("Mobup");
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(WelcomeController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
