package controllers;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import org.w3c.dom.Text;
import controllers.NextWindow;
import sample.BDEnter;
import sample.User;

public class ControllerAuth {

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
    private TextField login;

    @FXML
    private PasswordField password;

    @FXML
    private Button enter;


    @FXML
    private Button reg;

    @FXML
    void initialize() {

        enter.setOnAction(event -> {
            String loginText = login.getText().trim();
            String passText = password.getText().trim();

            if(!loginText.equals("") && !passText.equals("")){
                loginUser(loginText, passText);
            } else {
                System.out.println("Error!");
            }

        });

        reg.setOnAction(actionEvent -> {

            NextWindow regWindow = new NextWindow();
            regWindow.nextWindow(reg, "../fxmls/registration.fxml");

        });

        screen.setOnAction(a -> {
            NextWindow screenWindow = new NextWindow();
            screenWindow.nextWindow(screen, "../fxmls/sample.fxml");

        });

        help.setOnAction(aHelp -> {

            NextWindow helpWindow = new NextWindow();
            helpWindow.nextWindow(help, "../fxmls/help.fxml");

        });

        dropbox.setOnAction(event -> {

        });


    }

    private void loginUser(String loginText, String passText) {
        BDEnter bdEnter = new BDEnter();
        User user = new User();
        user.setUser(loginText);
        user.setPass(passText);
        ResultSet result = bdEnter.getUser(user);

        int counter = 0;

        while (true){
            try {
                if (!result.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            counter++;
        }
        if (counter >= 1){
            System.out.println("Success!");
        }
    }
}
