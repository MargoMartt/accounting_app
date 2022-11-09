package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SalaryController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button calculate;

    @FXML
    private TextField id;

    @FXML
    private Button main;

    @FXML
    private Label salary;

    @FXML
    private Label surname;

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
        assert calculate != null : "fx:id=\"calculate\" was not injected: check your FXML file 'salary.fxml'.";
        assert id != null : "fx:id=\"id\" was not injected: check your FXML file 'salary.fxml'.";
        assert main != null : "fx:id=\"main\" was not injected: check your FXML file 'salary.fxml'.";
        assert salary != null : "fx:id=\"salary\" was not injected: check your FXML file 'salary.fxml'.";
        assert surname != null : "fx:id=\"surname\" was not injected: check your FXML file 'salary.fxml'.";

    }

}
