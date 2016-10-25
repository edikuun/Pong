package Pingpong;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Ball {

    int x = 150;
    int y = 100;
    int xa = 1;
    int ya = 1;
    public static final int DIAMETER = 30;
    private final Game game;

    public Ball(Game game) {
        this.game = game;
    }

    void move() {
        if (x + xa < 0) /*left border*/ {
            xa = game.speed;
        }
        if (x + xa > game.getWidth() - DIAMETER) /*right border*/ {
            xa = -game.speed;
        }
        if (y + ya < 0) {/*top border*/
            game.racquet1.score();
            if (game.score1 == 3) {
                game.gameOver();
            } else {
                game.nextRound();
            }
        }
        if (y + ya > game.getHeight() - DIAMETER) {
            /*bottom border*/
            game.racquet2.score();
            if (game.score2 == 3) {
                game.gameOver();
            } else {
                game.nextRound();
            }
        }
        if (collisionRacquet1()) {
            ya = -game.speed;
            y = game.racquet1.getTopY() - DIAMETER;
            game.speed++;
        }
        if (collisionRacquet2()) {
            ya = game.speed;
            y = game.racquet2.getTopY() + DIAMETER;
            game.speed++;
        }

        x = x + xa;
        y = y + ya;

    }

    private boolean collisionRacquet2() {
        return game.racquet2.getBounds().intersects(getBounds());
    }

    private boolean collisionRacquet1() {
        return game.racquet1.getBounds().intersects(getBounds());
    }

    public void paint(Graphics2D g) {
        g.fillOval(x, y, 30, 30);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }

}
