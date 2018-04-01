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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Boutet
 */
public class WelcomeController implements Initializable {
    
    @FXML
    private TextField w_ip, w_port;
    
    private String s_ip, s_port;
    private int port;
    Parent root;
    Scene scene;
    private Stage mainstage;
    
    @FXML
    private void Connect(ActionEvent event) {
        s_ip = w_ip.getText();
        s_port = w_port.getText();
        
        port = Integer.parseInt(s_port);
        
    }
    
        @FXML
    public void Go_to_Inventory(ActionEvent event){
        System.out.println("wesh");
           try {
                root = FXMLLoader.load(getClass().getResource("Inventory.fxml"));
                scene = new Scene(root);
                mainstage = (Stage)  ((Node)event.getSource()).getScene().getWindow();
                mainstage.setScene(scene);
                mainstage.show();
            } catch (IOException ex) {
                Logger.getLogger(WelcomeController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
        @FXML
    public void Go_to_Camera(ActionEvent event){
        System.out.println("wesh");
           try {
                root = FXMLLoader.load(getClass().getResource("Camera.fxml"));
                scene = new Scene(root);
                mainstage = (Stage)  ((Node)event.getSource()).getScene().getWindow();
                mainstage.setScene(scene);
                mainstage.show();
            } catch (IOException ex) {
                Logger.getLogger(WelcomeController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    @FXML
    public void Go_to_Controller(ActionEvent event){
        System.out.println("wesh");
           try {
                root = FXMLLoader.load(getClass().getResource("Controller.fxml"));
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
