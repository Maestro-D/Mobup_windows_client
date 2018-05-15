package mobup.controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import mobup.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class ControlsController {

	@FXML
    private void goToGameSelection(ActionEvent event) throws IOException {
		Main.showGameSelectionView();
    }
	
	@FXML
    private void goToInventory(ActionEvent event) throws IOException {
		Main.showInventoryView();
    }
	
	@FXML
    private void goToMiniMap(ActionEvent event) throws IOException {
		Main.showMiniMapView();
    }
	
	@FXML
    private void showPressedKey(KeyEvent event) throws IOException {

		switch (event.getCode())
		{
		  case ENTER:
			  Main.alertPop("Enter");
		    break;  
		  case Z:
			  Main.alertPop("Forward");
		    break;
		  case Q:
			  Main.alertPop("Left");
		    break;
		  case D:
			  Main.alertPop("Right");
		    break;
		  case S:
			  Main.alertPop("Backward");
		    break;
		  case T:
			  Main.alertPop("Switch character");
		    break;
		  default:
			  Main.alertPop("Key Pressed");
		}
	       
    }

}
