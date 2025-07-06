import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    // Bouncer movingSprite;

    // ArrayList<Bouncer> movingSprite;
    // ArrayList<StraightMover> straightMovers;
    ArrayList<Mover> movers;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        Oval boxOval = new Oval(15, 20, Color.BLUE);

        movers = new ArrayList<>();
        movers.add(new Bouncer(100, 170, box));
        movers.add(new Bouncer(150, 200, boxOval));

        movers.get(0).setMovementVector(3, 1);
        movers.get(1).setMovementVector(3, 1);
        // movingSprite = new Bouncer(100, 170, box);
        // movingSprite.setMovementVector(3, 1);

        // straightMovers = new ArrayList<>();
        movers.add(new StraightMover(30, 50, box));
        movers.add(new StraightMover(60, 100, boxOval));

        movers.get(2).setMovementVector(3, 1);
        movers.get(3).setMovementVector(3, 1);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        // movingSprite.draw(surface);
        for (Mover mover : movers) {
            mover.draw(surface);
        }

        /*
         * for (StraightMover straightMover : straightMovers) {
         * straightMover.draw(surface);
         * }
         */
    }
}
