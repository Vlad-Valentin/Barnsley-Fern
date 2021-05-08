package fern;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Fern extends JPanel {
    private double x;
    private double y;
    private Color color;

    public Fern() {
        this.x = 0.5;
        this.y = 0;

        repaint();
    }

    public void f() {
        double r = randomF();
        double nextX;
        double nextY;

        if (r <= 0.01) {
            nextX = 0.5;
            nextY = 0.16 * y;
            color = Color.GREEN;
        } else if (r <= 0.08) {
            nextX = 0.20 * x - 0.26 * y + 0.400;
            nextY = 0.23 * x + 0.22 * y - 0.045;
            color = Color.RED;
        } else if (r <= 0.15) {
            nextX = -0.15 * x + 0.28 * y + 0.575;
            nextY = 0.26 * x + 0.24 * y - 0.086;
            color = Color.BLUE;
        } else {
            nextX = 0.85 * x + 0.04 * y + 0.075;
            nextY = -0.04 * x + 0.85 * y + 0.180;
            color = Color.BLACK;
        }

        this.x = nextX;
        this.y = nextY;
    }

    public double randomF() {
        Random random = new Random();
        return 0 + (1) * random.nextDouble();
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.translate(100, 0);
        for (int index = 0; index < 100000; ++index) {
            f();
            g.setColor(color);
            g.drawOval((int) (this.x * 800), (int) (this.y * 800), 1, 1);
        }
    }
}