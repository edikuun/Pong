package Pingpong;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;

public interface MainRacquet {

    public void score();

    public void move();

    public void paint(Graphics2D g);

    public void keyReleased(KeyEvent e);

    public void keyPressed(KeyEvent e);

    public Rectangle getBounds();

    public int getTopY();

}
