package DesignTutorial.HandleUserEvents;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent>{

    private Button button;

    @Override 
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Title of the Window");
        this.button=new Button("Click Me");
        this.button.setOnAction(this);

        StackPane layout=new StackPane();
        layout.getChildren().add(this.button);
        
        Scene scene=new Scene(layout,300,250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @Override
    public void handle(ActionEvent event){
        if(event.getSource()==this.button){
            System.out.println("ButtonClicked");
        }
    }

    public static void main(String [] args){
        launch(args);
    }
}