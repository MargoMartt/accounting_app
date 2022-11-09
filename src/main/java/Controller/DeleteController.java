package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.DB.AccountingEntity;
import org.example.DB.AccountingService;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DeleteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button delete;

    @FXML
    private TextField id;

    @FXML
    private Button main;

    @FXML
    void onHelloButtonClick(ActionEvent event) throws IOException {
        main.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("main.fxml"));

        loader.load();
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }
    @FXML
    void onDeleteButtonClick(ActionEvent event) throws IOException {
        AccountingService accountingService = new AccountingService();
        AccountingEntity accounting = accountingService.findEmployee(Integer.parseInt(id.getText()));
        accountingService.deleteEmployee(accounting);
    }

    @FXML
    void initialize() {
        assert delete != null : "fx:id=\"delete\" was not injected: check your FXML file 'delete.fxml'.";
        assert id != null : "fx:id=\"id\" was not injected: check your FXML file 'delete.fxml'.";
        assert main != null : "fx:id=\"main\" was not injected: check your FXML file 'delete.fxml'.";

    }

}
