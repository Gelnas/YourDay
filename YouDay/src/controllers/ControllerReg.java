package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.BDEnter;
import sample.User;


public class ControllerReg {
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
    private TextField login;

    @FXML
    private PasswordField password;

    @FXML
    private Button reg;

    @FXML
    private TextField name;

    @FXML
    private PasswordField token;

    @FXML
    void initialize() {

        reg.setOnAction(event -> {

            createNewUser();

        });


        screen.setOnAction(a -> {

            NextWindow screenWindow = new NextWindow();
            screenWindow.nextWindow(screen, "../fxmls/sample.fxml");

        });

        help.setOnAction(aHelp -> {

            NextWindow helpWindow = new NextWindow();
            helpWindow.nextWindow(help, "../fxmls/help.fxml");

        });


    }

    private void createNewUser() {

        BDEnter bdEnter = new BDEnter();

        String Uname = name.getText();
        String Uuser = login.getText();
        String Upass = password.getText();
        String Utoken = token.getText();

        User user = new User(Uname, Uuser, Upass, Utoken);

        bdEnter.signUpUser(user);

        name.setText("");
        login.setText("");
        password.setText("");
        token.setText("");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        NextWindow screenWindow = new NextWindow();
        screenWindow.nextWindow(reg, "../fxmls/registrationMess.fxml");

    }
}
