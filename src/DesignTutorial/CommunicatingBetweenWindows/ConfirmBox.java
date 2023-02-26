package DesignTutorial.CommunicatingBetweenWindows;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox {

    static Boolean answer;

    public static boolean display(String title,String message){
        Stage window=new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setWidth(250);

        Label label=new Label(message);
        
        // Creating Buttons
        Button confirmButton=new Button("Confirm");
        Button cancelButton=new Button("Cancel");

        // Assigning Button Actions
        confirmButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                answer=true;
                window.close();
            }
        });
        cancelButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                answer=false;
                window.close();
            }
        });

        VBox layout=new VBox(10);
        layout.getChildren().addAll(label,confirmButton,cancelButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene=new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

        return answer;
    }
}
