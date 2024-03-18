import java.awt.*;

public class GameData {
    private Ball ball;
    private Ball ballEnemy;

    public void update() {
        ball.move(5, Direction.RIGHT);
        if (!(ballEnemy == null)) {
            ballEnemy.move(5, Direction.LEFT);
            if (ball.isCollided(ballEnemy.getBallRectangle())){
                ballEnemy=null;
            }
        }

    }
    public void initialize() {
        ball = new Ball(20, 20, 50, 50, Color.RED);
        ballEnemy=new Ball(300, 20, 50, 50, Color.BLUE);
    }

    public Ball getBall() {
        return ball;
    }
    public Ball getBallEnemy(){
        return ballEnemy;
    }
}
