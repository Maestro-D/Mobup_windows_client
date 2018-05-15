package mobup.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import mobup.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
    private void goToGameSelection(ActionEvent event) throws IOException {
		Main.showGameSelectionView();
    }
}
