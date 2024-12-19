import javax.swing.*;
import java.awt.*;

public class OuterGrid extends JPanel {
    private GameController gameController;
    public OuterGrid(GameController gameController) {
        this.gameController = gameController;
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            InnerGrid innerGrid = new InnerGrid(gameController);
        }
    }
}
