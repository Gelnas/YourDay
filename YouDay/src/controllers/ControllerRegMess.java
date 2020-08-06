package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControllerRegMess {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane window;

    @FXML
    private Button dropbox;

    @FXML
    private Button help;

    @FXML
    private ImageView setup;

    @FXML
    private Button screen;


    @FXML
    private Button login;

    @FXML
    void initialize() {


        screen.setOnAction(a -> {
            NextWindow screenWindow = new NextWindow();
            screenWindow.nextWindow(screen, "../fxmls/sample.fxml");

        });

        help.setOnAction(aHelp -> {
            NextWindow screenWindow = new NextWindow();
            screenWindow.nextWindow(help, "../fxmls/help.fxml");

        });

        login.setOnAction(event -> {
            NextWindow screenWindow = new NextWindow();
            screenWindow.nextWindow(login, "../fxmls/authorization.fxml");

        });


    }


}
