package controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

public class NextWindow {


    public void nextWindow(Button button, String url){

        button.getScene().getWindow().hide();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(url));

        try {
            loader.load();
        }catch (Exception e){
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }
    /*public void UWindow(Button button, String url){

        //button.getScene().getWindow().hide();

        URL url1 = null;
        try {
            url1 = Paths.get(url).toUri().toURL();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Parent root = FXMLLoder.load(url1);

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(url1));

        try {
            loader.load();
        }catch (Exception e){
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }*/



}
