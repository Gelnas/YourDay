package controllers;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControllerHelp {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane window;

    @FXML
    private Button dropbox;

    @FXML
    private Button screen;

    @FXML
    private Button main;

    @FXML
    void initialize() {
        screen.setOnAction(as -> {
            NextWindow screenWindow = new NextWindow();
            screenWindow.nextWindow(screen, "../fxmls/sample.fxml");
        });
        main.setOnAction(a -> {
            NextWindow screenWindow = new NextWindow();
            screenWindow.nextWindow(main, "../fxmls/authorization.fxml");

        });


    }
}
