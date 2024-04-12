package edu.westga.comp4420.shopping_list.view.codebehind;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MainWindow {
    @FXML private Button addItemButton;
    @FXML private TableColumn<?, ?> itemNameTableColumn;
    @FXML private TextField itemNameTextField;
    @FXML private TableColumn<?, ?> quantityTableCoulumn;
    @FXML private Button removeItemButton;
    @FXML private TableView<?> shoppingListTableView;
    @FXML private Button updateQuantityButton;

    @FXML
    void initialize() {
        assert addItemButton != null : "fx:id=\"addItemButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert itemNameTableColumn != null : "fx:id=\"itemNameTableColumn\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert itemNameTextField != null : "fx:id=\"itemNameTextField\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert quantityTableCoulumn != null : "fx:id=\"quantityTableCoulumn\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert removeItemButton != null : "fx:id=\"removeItemButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert shoppingListTableView != null : "fx:id=\"shoppingListTableView\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert updateQuantityButton != null : "fx:id=\"updateQuantityButton\" was not injected: check your FXML file 'MainWindow.fxml'.";

    }

}
