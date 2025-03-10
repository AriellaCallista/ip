package sana;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * A GUI for Duke using FXML.
 */
public class Main extends Application {

    private Sana sana = new Sana("data/SanaTasks.txt");

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane ap = fxmlLoader.load();
            Scene scene = new Scene(ap);
            stage.setTitle("Sana: Your Task Manager");
            stage.setScene(scene);
            fxmlLoader.<MainWindow>getController().setSana(sana);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
