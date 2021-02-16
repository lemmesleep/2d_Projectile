package View;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class SimulationView {
    Scene simulationScene;
    GridPane simulationPane = new GridPane();
    Button resetButton = new Button("RESET");
    ControlPanelView panelView = new ControlPanelView();

    public SimulationView(){
        resetButton.setOnAction(e->{
            panelView.AcidBox.getSelectionModel().clearSelection();
            panelView.BaseBox.getSelectionModel().clearSelection();
        });
        simulationPane.getChildren().add(panelView);
        simulationPane.add(resetButton,1,1);
        simulationScene = new Scene(simulationPane,700 ,700 );
    }



}
