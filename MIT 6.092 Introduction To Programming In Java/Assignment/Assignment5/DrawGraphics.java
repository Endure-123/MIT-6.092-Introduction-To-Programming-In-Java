package Assignment.Assignment5;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    // BouncingBox box;
    ArrayList<BouncingBox> boxes;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        boxes = new ArrayList<>();
        boxes.add(new BouncingBox(200, 50, Color.RED));
        boxes.add(new BouncingBox(100, 100, Color.blue));
        boxes.add(new BouncingBox(150, 150, Color.pink));

        boxes.get(0).setMovementVector(0, 2);
        boxes.get(1).setMovementVector(2, 2);
        boxes.get(2).setMovementVector(2, 0);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        // box.draw(surface);
        for (BouncingBox box : boxes) {
            box.draw(surface);
        }
    }
}
