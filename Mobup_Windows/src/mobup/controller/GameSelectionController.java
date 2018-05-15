package mobup.controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import mobup.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class GameSelectionController {

	@FXML
    private void goToInventory(ActionEvent event) throws IOException {
		Main.showInventoryView();
    }
	
	@FXML
    private void goToMiniMap(ActionEvent event) throws IOException {
		Main.showMiniMapView();
    }
	
	@FXML
    private void goToControls(ActionEvent event) throws IOException {
		Main.showControlsView();
    }

}
