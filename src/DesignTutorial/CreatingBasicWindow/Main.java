package DesignTutorial.CreatingBasicWindow;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

    @Override 
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Title of the Window");
        Button button=new Button("Click Me");

        StackPane layout=new StackPane();
        layout.getChildren().add(button);
        
        Scene scene=new Scene(layout,300,250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String [] args){
        launch(args);
    }
}