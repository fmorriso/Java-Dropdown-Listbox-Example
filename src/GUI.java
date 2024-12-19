import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GUI implements Runnable {

    private final GameController gameController;

    public GUI(String title, GameController gameController) {
        this.gameController = gameController;

    }

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        // be smart about using the available device screen size instead of hard-coding like most people do.d
        Dimension scaledSize = gameController.getScaledSize();

        // Create a frame to display the JComboBox
        JFrame frame = new JFrame("Centered JComboBox Example");


        //===============================
        frame.setLayout(new GridLayout(3, 3));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArrayList<JComboBox> comboBoxes = new ArrayList<>();
        for(int i = 0; i < 9; i++)
            comboBoxes.add(generateCenteredComboBox());

        for(JComboBox comboBox : comboBoxes) {
            frame.add(comboBox);
        }

        frame.setSize(scaledSize);
        frame.setVisible(true);
    }

    private JComboBox generateCenteredComboBox() {
        // Customize the renderer to center align the items
        JComboBox comboBox = new JComboBox(new String[]{"1", "2", "3","4","5","6","7","8","9"});
        Dimension size = gameController.getScaledSize();
        int width = (int) (size.getWidth() * 0.5);
        int height = (int) (size.getHeight() * 0.5);
        comboBox.setSize(width, height);
        comboBox.setRenderer(new CenteredCellRenderer());
        return comboBox;
    }


}
