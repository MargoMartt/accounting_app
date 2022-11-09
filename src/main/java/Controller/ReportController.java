package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.example.DB.AccountingEntity;
import org.example.DB.AccountingService;

import java.io.IOException;
import java.util.ArrayList;

public class ReportController {
    private ObservableList<AccountingEntity> salaryList = FXCollections.observableArrayList();
    @FXML
    private TableColumn<AccountingEntity, String> surnameColumn;
    @FXML
    private TableColumn<AccountingEntity, Double> salaryColumn;
    @FXML
    private TableColumn<AccountingEntity, String> nameColumn;
    @FXML
    private TableColumn<AccountingEntity, String> lastnameColumn;
    @FXML
    private Button main;

    @FXML
    private TableView<AccountingEntity> report;

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
        initData();
        surnameColumn.setCellValueFactory(new PropertyValueFactory<AccountingEntity, String>("employeesSurname"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<AccountingEntity, String>("employeesName"));
        lastnameColumn.setCellValueFactory(new PropertyValueFactory<AccountingEntity, String>("employeesLastname"));
        salaryColumn.setCellValueFactory(new PropertyValueFactory<AccountingEntity, Double>("salary"));
        report.setItems(salaryList);

    }

    private void initData() {
        AccountingService accountingService = new AccountingService();
        ArrayList<AccountingEntity> employees = accountingService.findAllEmployees();
        for (int i = 0; i < employees.size(); i++) {
            employees.get(i).setSalary(employees.get(i).getSalaryPerDay() * Double.parseDouble(String.valueOf(employees.get(i).getWorkingDays())));
            salaryList.add(employees.get(i));
        }
    }
}
