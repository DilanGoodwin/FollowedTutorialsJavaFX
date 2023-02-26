package DesignTutorial.SwitchingScenes;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

    Stage window;
    Scene scene1,scene2;
    
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;

        // Creating First Scene
        Label labelScene1=new Label("Welcome Scene 1");
        Button buttonScene1=new Button("Go to Scene 2");
        buttonScene1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                window.setScene(scene2);
            }
        });

        // Layout Scene 1
        VBox layoutScene1=new VBox(20);
        layoutScene1.getChildren().addAll(labelScene1,buttonScene1);
        scene1=new Scene(layoutScene1,200,200);

        // Creating Second Scene
        Label labelScene2=new Label("Welcome Scene 2");
        Button buttonScene2=new Button("Go to Scene 1");
        buttonScene2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                window.setScene(scene1);
            }
        });

        // Layout Scene 2
        StackPane layout2=new StackPane(labelScene2,buttonScene2);
        scene2=new Scene(layout2,300,300);

        // Setting Stage
        window.setScene(scene1);
        window.setTitle("Scene Switcher");
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
