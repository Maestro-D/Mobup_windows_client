package mobup;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Main extends Application {
	private static Stage primaryStage;
	private static BorderPane mainLayout;
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Mobup V3.0.1-140518");
		showRootView();
		showMainView();
	}

	public static void showMainView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MainView.fxml"));
		AnchorPane anchorpane = loader.load();
		mainLayout.setCenter(anchorpane);
	}
	
	public static void showInventoryView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/InventoryView.fxml"));
		BorderPane borderpane = loader.load();
		mainLayout.setCenter(borderpane);
	}
	
	public static void showGameSelectionView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/GameSelectionView.fxml"));
		AnchorPane anchorpane = loader.load();
		mainLayout.setCenter(anchorpane);
	}
	
	public static void showMiniMapView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MiniMapView.fxml"));
		BorderPane borderpane = loader.load();
		mainLayout.setCenter(borderpane);
	}
	
	public static void alertPop(String key) throws IOException {
		Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText("Results : ");
        alert.setContentText(key);
 
        alert.showAndWait();
	}
	
	public static void showControlsView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/ControlsView.fxml"));
		BorderPane borderpane = loader.load();
		mainLayout.setCenter(borderpane);
	}
	
	public static void showRootView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/RootView.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static ObservableList<Items> getInventoryItems() {
		ObservableList<Items> items = FXCollections.observableArrayList();
		
		items.add(new Items(1, "Boite de pandorre", 2, "Ne pas ouvrir pls"));
		items.add(new Items(2, "Arc de l'aveugle", 1, "Fermer un oeil pour mieux viser"));
		items.add(new Items(3, "Pokéballs", 144, "Attrapez les tous"));
		
		return items;
	}
	
	public static ObservableList<Items> getInventoryItemsAgain() {
		ObservableList<Items> items = FXCollections.observableArrayList();
		
		items.add(new Items(1, "Boite de pandorre", 2, "Ne pas ouvrir pls"));
		items.add(new Items(2, "Arc de l'aveugle", 1, "Fermer un oeil pour mieux viser"));
		items.add(new Items(3, "Pokéballs", 144, "Attrapez les tous"));
		items.add(new Items(3, "Pokéballs", 144, "Attrapez les tous"));
		items.add(new Items(3, "Pokéballs", 144, "Attrapez les tous"));
		items.add(new Items(3, "Pokéballs", 144, "Attrapez les tous"));
		
		return items;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
