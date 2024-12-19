import java.awt.*;

public class GameController {
    private Dimension scaledSize;
    public GameController() {
        // be smart about using the available device screen size instead of hard-coding like most people do.d
        final int multipleof = 10;
        scaledSize = SwingScreenUtilities.getScaledSize(0.4, multipleof, true);
    }

    public Dimension getScaledSize() { return scaledSize; }
}
