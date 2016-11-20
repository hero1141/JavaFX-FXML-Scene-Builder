/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableView;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.geometry.Pos;



/**
 *
 * @author mrozu
 */
public class JavaFXApplication extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = FXMLLoader.load(getClass().getResource("ui.fxml"));
        Scene scene = new Scene(grid, 600, 400);
        
        stage.setScene(scene);
        stage.setTitle("Do-It !!!");
        stage.setAlwaysOnTop(true);
        stage.setResizable(false);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaFXApplication.launch(args);
    }
    
}
