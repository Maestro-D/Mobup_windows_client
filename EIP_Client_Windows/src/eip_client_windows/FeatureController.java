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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Popup;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.Window;
/**
 * FXML Controller class
 *
 * @author Boutet
 */
public class FeatureController implements Initializable {

    Parent root;
    Scene scene;
    Stage mainstage;  
    Window test;
    
    @FXML
    private ScrollPane scrollPane;
    public Button left, right;
    public GridPane gridpane;
    public VBox box;
    public Label item_label;
    
    
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
    
    @FXML
    public void Go_Back(ActionEvent event){
            try {
                root = FXMLLoader.load(getClass().getResource("Inventory.fxml"));
                scene = new Scene(root);
                mainstage = (Stage)  ((Node)event.getSource()).getScene().getWindow();
                mainstage.setScene(scene);
                mainstage.show();
            } catch (IOException ex) {
                Logger.getLogger(FeatureController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
        private void viewItem(String id){
            System.out.println("Je suis dans ViewItem pour l'item" + id);
        }

        private void Inventory(){
            Popup popup = new Popup();
            String a[] = {"Potion", "Epee", "Bouclier", "Cube"}; // remplacer par liste d'objets reçus
            int item_size = a.length; // remplacer par la taille de la liste d'objets reçus
            
            for (int i = 0; i < item_size ; i++)
                {
                    System.out.println(a[i] + " et item_size vaut " + item_size);
                    Button item = new Button(a[i]);
                    item.setId(Integer.toString(i)); //remplacer paramètre par id de l'item en cours
                    item.setOnAction((ActionEvent e) -> {
                        System.out.println("Je suis dans mon eventhandler ! " + item.getId());
                        try {
                            System.out.println("EventHandler: etape 1");
                            root = FXMLLoader.load(getClass().getResource("Item.fxml"));
                            System.out.println("EventHandler: etape 2");
                            scene = new Scene(root);
                            System.out.println("EventHandler: etape 3");
                            mainstage = (Stage) ((Node)e.getSource()).getScene().getWindow();
                            System.out.println("EventHandler: etape 4");
                            mainstage.setScene(scene);
                            mainstage.show();
                            System.out.println("EventHandler: etape 5");
                        } catch (IOException ex) {
                            Logger.getLogger(FeatureController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        viewItem(item.getId());
                    });
                    box.getChildren().add(item);
                }
            System.out.println("for fini !");
        }
    
        @Override
        public void initialize(URL url, ResourceBundle rb) {
            this.Inventory();
    }    
}
