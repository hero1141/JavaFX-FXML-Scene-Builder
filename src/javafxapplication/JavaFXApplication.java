/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
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
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setMinWidth(600);
        grid.setMinHeight(400);
        
        grid.setHgap(20);
        grid.setVgap(5);
        grid.setGridLinesVisible(false);
//        
//        Group g = new Group();
//        Button b1 = new Button("First Button");
//        Button b2 = new Button("Second Button");
//        Button b3 = new Button("Third Button");
//        Button b4 = new Button("Fourth Button");
//        
//        GridPane.setConstraints(b1, 1, 1);
//        GridPane.setConstraints(b2, 2, 1);
//        GridPane.setConstraints(b3, 1, 2);
//        GridPane.setConstraints(b4, 2, 2);
//        
//        BorderPane borderPane = new BorderPane();
//        borderPane.setTop(new Button("Top"));
//        borderPane.setBottom(new Button("Bottom"));
//        borderPane.setLeft(new Button("Left"));
//        borderPane.setRight(new Button("Right"));
//        borderPane.setCenter(new Button("Center"));
        //Label tableArea =  new Label("This is where tasks table will come");
//        tableArea.setMinWidth(600);
//        tableArea.setMinHeight(600);
        
        TableView table = new TableView();
        table.setMinHeight(300);
        table.setMinWidth(550);
        
        TableColumn column1 = new TableColumn("Priority");
        TableColumn column2 = new TableColumn("Description");
        TableColumn column3 = new TableColumn("Progress");
        table.getColumns().addAll(column1, column2, column3);
                
        GridPane.setConstraints(table, 1 , 1, 3 ,1);
        
        TextField taskName = new TextField();
        taskName.setPromptText("Enter task name");
        GridPane.setConstraints(taskName, 2 , 2);
        taskName.setMinWidth(300);
        
       
        ComboBox priority = new ComboBox();
        priority.getItems().addAll("High", "Low", "Medium");
        priority.setPromptText("Enter priority");
        GridPane.setConstraints(priority, 1, 2);
        
        Button addButton = new Button("Add");
        addButton.setMinWidth(100);
        GridPane.setConstraints(addButton, 3, 2);
        
        Button cancelButton = new Button("Cancel");
        cancelButton.setMinWidth(100);
        GridPane.setConstraints(cancelButton, 3, 3);
        
        HBox progressArea = new HBox();
        progressArea.getChildren().addAll(new Label("Progress"),
                                       new Spinner <Integer>(0,100,0),
                                       new CheckBox("Completed"));
        GridPane.setConstraints(progressArea, 1, 3, 2, 1);
        progressArea.setAlignment(Pos.CENTER_RIGHT);
        progressArea.setSpacing(10);
        
        grid.getChildren().addAll(table, taskName, priority, addButton, cancelButton, progressArea);
        
       // g.getChildren().add(new Button("First Button"));
//          g.getChildren().addAll(b1,b2);
//          b1.setLayoutX(50);
//          b1.setLayoutY(150);
          
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
//        
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
        
        Scene scene = new Scene(grid, 800, 600);
        
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
        launch(args);
    }
    
}
