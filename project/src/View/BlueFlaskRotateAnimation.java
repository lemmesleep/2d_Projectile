package View;

import javafx.animation.RotateTransition;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.io.FileNotFoundException;

public class BlueFlaskRotateAnimation extends Pane {

    public BlueFlask flask = new BlueFlask();
    public RotateTransition rt = new RotateTransition(Duration.millis(3000), flask);

    public BlueFlaskRotateAnimation() throws FileNotFoundException {
        super();
        this.getChildren().add(flask);
        Animations.movePivot(flask, 40, 30);
    }

    public void animate(){

        rt.setByAngle(-90);
        rt.setCycleCount(2);
        rt.setAutoReverse(true);
        rt.play();

    }
    public void animateDroplet() throws FileNotFoundException, InterruptedException {
        BlueLiquidAnim bluelq = new BlueLiquidAnim();
        this.getChildren().add(bluelq);
        bluelq.relocate(250,-350);
        bluelq.animatelq();


    }

    public BlueFlask getFlask() {
        return this.flask;
    }

}
