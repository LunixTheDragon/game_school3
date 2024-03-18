import javax.swing.*;
import java.awt.event.*;

public class Game {
    GameData data;
    public static void main(String[] args) {
        new Game();
    }

    public Game() {
        data = new GameData();
        GameGraphics graphics = new GameGraphics();

        data.initialize();
        graphics.render(data);

        graphics.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int clickX = e.getX();
                int clickY = e.getY();
                int ballX = data.getBall().getX();
                int ballY = data.getBall().getY();
                int ballWidth = data.getBall().getWidth();
                int ballHeight = data.getBall().getHeight();

                int differenceX = clickX - ballX;
                int differenceY = clickY - ballY - graphics.getInsets().top;

                if (differenceX >= 0 && differenceX < ballWidth && differenceY >= 0 && differenceY <ballHeight) {
                    data.getBall().move(20, Direction.RIGHT);

                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        graphics.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    data.getBall().move(50, Direction.LEFT);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        Timer timer = new Timer(100, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                data.update();
                graphics.render(data);
            }
        });

        timer.start();

    }
}
