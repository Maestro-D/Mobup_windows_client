package mobup.controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import mobup.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MiniMapController {

	@FXML
    private void goToGameSelection(ActionEvent event) throws IOException {
		Main.showGameSelectionView();
    }
	
	@FXML
    private void goToInventory(ActionEvent event) throws IOException {
		Main.showInventoryView();
    }
	
	@FXML
    private void goToControls(ActionEvent event) throws IOException {
		Main.showControlsView();
    }

}
