package Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.DB.AccountingEntity;
import org.example.DB.AccountingService;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

       Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("main.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Accounting!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
//        AccountingService accountingService = new AccountingService();
//        AccountingEntity accounting = new AccountingEntity("Martinkevich", "Margatira", "Dmitrievna", 150, 25);
//        accountingService.saveEmployee(accounting);
        launch();
    }
}