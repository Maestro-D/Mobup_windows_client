/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eip_client_windows;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Boutet
 */
public class FeatureController implements Initializable {

    Parent root;
    Scene scene;
    private Stage mainstage;
    /**
     * Initializes the controller class.
     */
    
    @FXML
    public void Go_Home(ActionEvent event){
            try {
                root = FXMLLoader.load(getClass().getResource("Home.fxml"));
                scene = new Scene(root);
                mainstage = (Stage)  ((Node)event.getSource()).getScene().getWindow();
                mainstage.setScene(scene);
                mainstage.show();
            } catch (IOException ex) {
                Logger.getLogger(WelcomeController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
