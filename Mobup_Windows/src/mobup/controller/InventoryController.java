package mobup.controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import mobup.Items;
import mobup.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableView;
import javafx.fxml.FXML;

public class InventoryController {
	
	@FXML
    private TableView<Items> ItemTab;
	
	@FXML
    private TableColumn<Items, Integer> idCol;

    @FXML
    private TableColumn<Items, String> nameCol;

    @FXML
    private TableColumn<Items, Integer> quantityCol;
    
    @FXML
    private TableColumn<Items, String> detailCol;

	@FXML
    private void goToGameSelection(ActionEvent event) throws IOException {
		Main.showGameSelectionView();
    }
	
	@FXML
    private void goToMiniMap(ActionEvent event) throws IOException {
		Main.showMiniMapView();
    }
	
	@FXML
    private void goToControls(ActionEvent event) throws IOException {
		Main.showControlsView();
    }
	
	@FXML
	private void updateInventory(ActionEvent event) throws IOException {
		idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
		detailCol.setCellValueFactory(new PropertyValueFactory<>("detail"));
		ItemTab.setItems(Main.getInventoryItems());
	}
	
	@FXML
	private void updateInventoryAgain(ActionEvent event) throws IOException {
		ItemTab.setItems(Main.getInventoryItemsAgain());
	}
}
