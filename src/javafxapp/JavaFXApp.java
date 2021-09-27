/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author usuario
 */
public class JavaFXApp extends Application {
    @Override
    public void init(){
        System.out.println("Inicio init");
        
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        Button btn = new Button();
        Button btn2 = new Button();
        
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
    
        
        StackPane root = new StackPane();
        root.getChildren().addAll(btn,btn2);
        
        
        Scene scene = new Scene(root, 500, 450);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        btn2.setText("boton2'");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
                abreOtraStage(scene);
            }
        });
        
    }
    public void abreOtraStage(Scene scene){
        Button btn2 = new Button("Grabar");
        Scene scena2 = new Scene(btn2,200,200);
        Stage stage2 = new Stage(StageStyle.UTILITY);
        stage2.setTitle("hello world");
        stage2.setScene(scena2);
        stage2.show();
    }
    @Override
    public void stop(){
        System.out.println("Inicio stop");
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
