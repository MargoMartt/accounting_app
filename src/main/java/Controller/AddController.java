package Controller;

import org.example.DB.AccountingEntity;
import org.example.DB.AccountingService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button add;

    @FXML
    private TextField days;

    @FXML
    private TextField lastname;

    @FXML
    private Button main;

    @FXML
    private TextField name;

    @FXML
    private TextField salary;

    @FXML
    private TextField surname;

    @FXML
    public void onAddButtonClick(ActionEvent actionEvent) {
        AccountingService accountingService = new AccountingService();
        AccountingEntity accounting = new AccountingEntity(surname.getText(), name.getText(), lastname.getText(), Double.parseDouble(salary.getText()), Integer.parseInt(days.getText()));
        accountingService.saveEmployee(accounting);
    }

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
    void initialize() {
        assert add != null : "fx:id=\"add\" was not injected: check your FXML file 'add.fxml'.";
        assert days != null : "fx:id=\"days\" was not injected: check your FXML file 'add.fxml'.";
        assert lastname != null : "fx:id=\"lastname\" was not injected: check your FXML file 'add.fxml'.";
        assert main != null : "fx:id=\"main\" was not injected: check your FXML file 'add.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'add.fxml'.";
        assert salary != null : "fx:id=\"salary\" was not injected: check your FXML file 'add.fxml'.";
        assert surname != null : "fx:id=\"surname\" was not injected: check your FXML file 'add.fxml'.";

    }
}
