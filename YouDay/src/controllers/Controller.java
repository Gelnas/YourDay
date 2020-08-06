package controllers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicBoolean;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;

public class Controller {

    @FXML
    private AnchorPane window;

    @FXML
    private Button go;

    @FXML
    private Button dropbox;

    @FXML
    private Button help;

    @FXML
    private ImageView setup1;

    @FXML
    private Button main;

    @FXML
    private Button stop;



    @FXML
    void initialize() {

        main.setOnAction(a -> {
            NextWindow screenWindow = new NextWindow();
            screenWindow.nextWindow(main, "../fxmls/authorization.fxml");

        });

        help.setOnAction(aHelp -> {
            NextWindow helpWindow = new NextWindow();
            helpWindow.nextWindow(help, "../fxmls/help.fxml");

        });

      /*  AtomicBoolean flag = new AtomicBoolean(false);
        go.setOnAction(event -> {
            MyThread thread = new MyThread();
            thread.start();

            if(flag.get()){
                thread.stop();
            }
        });

        dropbox.setOnAction(event3 ->{
            URL url = null;
            try {
                url = new URL("https://www.dropbox.com");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(url);
        });


       stop.setOnAction(event2 -> {
           flag.set(true);
       });*/


    }


}
