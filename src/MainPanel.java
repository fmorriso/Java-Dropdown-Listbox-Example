import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private GameController gameController;

    private MainPanel() {/* prevent uninitialized instances */}

    public MainPanel(GameController gameController) {
        this.gameController = gameController;
        this.setLayout(new GridLayout(2, 1));
        generateOuterGrid();
        generateControlArea();
    }

    private void generateControlArea() {
    }

    private void generateOuterGrid() {
    }
}
