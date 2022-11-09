package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button add;

    @FXML
    private Button delete;

    @FXML
    private Button report;

    @FXML
    private Button salary;

    @FXML
    private Button viewAll;

    @FXML
    void onReportButtonClick(ActionEvent event) throws IOException {
        report.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("report.fxml"));

        loader.load();
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }

    @FXML

    public void onViewButtonClick(ActionEvent actionEvent) throws IOException {
        report.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("viewAll.fxml"));

        loader.load();
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML

    public void onSalaryButtonClick(ActionEvent actionEvent) throws IOException {
        salary.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("salary.fxml"));

        loader.load();
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML

    public void onAddButtonClick(ActionEvent actionEvent) throws IOException {
        add.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("add.fxml"));

        loader.load();
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML

    public void onDeleteButtonClick(ActionEvent actionEvent) throws IOException {
        delete.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("delete.fxml"));

        loader.load();
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    void initialize() {
        assert add != null : "fx:id=\"add\" was not injected: check your FXML file 'macb.fxml'.";
        assert delete != null : "fx:id=\"delete\" was not injected: check your FXML file 'macb.fxml'.";
        assert report != null : "fx:id=\"report\" was not injected: check your FXML file 'macb.fxml'.";
        assert salary != null : "fx:id=\"sallary\" was not injected: check your FXML file 'macb.fxml'.";
        assert viewAll != null : "fx:id=\"viewAll\" was not injected: check your FXML file 'macb.fxml'.";

    }
}

