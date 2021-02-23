
package View;
import Acid_Base_Neutralisation.Main;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainView extends GridPane {


        AnchorPane pane = new AnchorPane();
        public static Scene scene;
        Button startButton = new Button("start");
        Button resetButton = new Button("reset");
        Label label = new Label("Simulation: Acid-base neutralization");


    public MainView() {
            pane.setPrefSize(300, 300);
            scene = new Scene(pane,1000 , 530);
            Main.firstStage.setScene(scene);

            label.setLayoutX(380);
            label.setLayoutY(50);
            label.setStyle("-fx-font: normal bold 20px 'serif' ;-fx-text-fill: beige;");
            startButton.setTranslateY(200);
            startButton.setTranslateX(150);

            pane.getChildren().add(label);
            pane.getChildren().add(startButton);

            startButton.setOnAction(start);


        }

        EventHandler start = new EventHandler() {
            @Override
            public void handle(Event event) {
                SimulationView sv = new SimulationView();
                Main.firstStage.setScene(sv.simulationScene);
            }
        };
    }

