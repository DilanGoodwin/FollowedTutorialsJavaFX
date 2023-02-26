package DesignTutorial.CreatingAlertBoxes;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    
    Stage window;
    Button button;

    @Override
    public void start(Stage primaryStage){
        window=primaryStage;
        window.setTitle("Creating Alerts");

        button=new Button("Click Me");
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                AlertBox.display("AlertBox","CreatedAlert");
            }
        });

        StackPane layout=new StackPane(button);
        Scene scene=new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
