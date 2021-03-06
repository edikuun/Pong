package Pingpong;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Racquet2 implements MainRacquet {

    int x = 0;
    int xa = 0;
    private static final int Y = 30;
    private static final int WIDTH = 60;
    private static final int HEIGHT = 10;

    private final Game game;

    public Racquet2(Game game) {
        this.game = game;
    }

    @Override
    public void move() {
        if (x + xa > 0 && x + xa < game.getWidth() - WIDTH) {
            x = x + xa;
        }

    }

    @Override
    public void paint(Graphics2D g) {
        g.fillRect(x, Y, WIDTH, HEIGHT);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        xa = 0;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            xa = -game.speed;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            xa = game.speed;
        }
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, Y, WIDTH, HEIGHT);
    }

    @Override
    public int getTopY() {
        return Y + HEIGHT;
    }

    @Override
    public void score() {
        ++game.score2;
    }

}
