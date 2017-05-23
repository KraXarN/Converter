package home;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.image.Image;

import javafx.scene.web.*;
import javafx.scene.layout.*;

public class Main extends Application
{
    Parent root;
    public static Stage mainWindow;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        mainWindow = primaryStage;
        root = FXMLLoader.load(getClass().getResource("home.fxml"));
        mainWindow.setTitle("FFGUI - GUI for FFmpeg");
        mainWindow.setScene(new Scene(root));
        mainWindow.setResizable(false);

        /*
        WebView browser = new WebView();
        WebEngine engine = browser.getEngine();
        engine.load("https://duckduckgo.com");
        StackPane layout = new StackPane();
        layout.getChildren().add(browser);
        mainWindow.setScene(new Scene(layout, 1280, 800));
        */

        mainWindow.show();
    }
}
