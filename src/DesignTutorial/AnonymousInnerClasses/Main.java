package DesignTutorial.AnonymousInnerClasses;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

    private Button button;

    @Override 
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Title of the Window");
        this.button=new Button("Click Me");
        this.button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                System.out.println("InnerClassEventHandler");
            }
        });

        // Lambda Expression Button Click
        // e -> System.out.println("LambdaExpressionButtonClick");

        StackPane layout=new StackPane();
        layout.getChildren().add(this.button);
        
        Scene scene=new Scene(layout,300,250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String [] args){
        launch(args);
    }
}