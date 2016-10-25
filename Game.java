package Pingpong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import java.awt.Font;

public class Game extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    Ball ball = new Ball(this);
    MainRacquet racquet1 = new Racquet(this);
    MainRacquet racquet2 = new Racquet2(this);
    int speed = 1;
    int score1 = 0;
    int score2 = 0;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Game() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                racquet1.keyReleased(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                racquet1.keyPressed(e);
            }
        });
        setFocusable(true);

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                racquet2.keyReleased(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                racquet2.keyPressed(e);
            }
        });
        setFocusable(true);

    }

    private void move() {
        ball.move();
        racquet1.move();
        racquet2.move();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.BLACK);
        ball.paint(g2);
        Graphics2D g3 = (Graphics2D) g;
        g3.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g3.setColor(Color.BLUE);
        racquet1.paint(g3);
        Graphics2D g4 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.RED);
        racquet2.paint(g4);

        g2.setColor(Color.GRAY);
        g2.setFont(new Font("Verdana", Font.BOLD, 30));
        g2.drawString(String.valueOf(score2), 10, 30);

        g2.setColor(Color.GRAY);
        g2.setFont(new Font("Verdana", Font.BOLD, 30));
        g2.drawString(String.valueOf(score1), 250, 330);
    }

    public void gameOver() {
        if (score1 < score2) {
            int rep = JOptionPane.showConfirmDialog(this, "Player 1 Wins. DO YOU WANT TO RESTART?", "GAME OVER", JOptionPane.YES_NO_OPTION);
            if (rep == JOptionPane.YES_OPTION) {
                restart();
            } else {
                System.exit(0);
            }
        } else {
            int rep = JOptionPane.showConfirmDialog(this, "Player 2 Wins. DO YOU WANT TO RESTART?", "GAME OVER", JOptionPane.YES_NO_OPTION);
            if (rep == JOptionPane.YES_OPTION) {
                restart();
            } else {
                System.exit(0);
            }
        }
    }

    public void nextRound() {
        speed = 1;
        ball.x = 150;
        ball.y = 100;
        ball.xa = 1;
        ball.ya = 1;
        new Game().setVisible(true);
    }

    public void restart() {
        nextRound();
        score1 = 0;
        score2 = 0;
        new Game().setVisible(true);
    }

    @SuppressWarnings("SleepWhileInLoop")
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Ping Pong");
        Game game = new Game();
        frame.add(game);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            game.move();
            game.repaint();
            Thread.sleep(10);
        }

    }

}
