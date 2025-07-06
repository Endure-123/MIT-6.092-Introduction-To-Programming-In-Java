import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Oval implements Sprite {
    private int width;
    private int height;
    private Color color;

    public Oval(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw(Graphics surface, int leftX, int topY) {
        surface.setColor(color);
        surface.fillOval(leftX, topY, width, height);
        surface.setColor(Color.BLACK);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
        surface.drawOval(leftX, topY, width, height);
    }

    /** Returns the width of the sprite. */
    public int getWidth() {
        return width;
    }

    /** Returns the height of the sprite. */
    public int getHeight() {
        return height;
    }

}
