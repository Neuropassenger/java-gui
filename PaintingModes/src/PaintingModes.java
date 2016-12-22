import java.awt.*;
import java.awt.event.*;

/**
 * Created by Sokolov Oleg on 022 22.12.16.
 * turgenoid@gmail.com  - - - thegazer.ru
 */
public class PaintingModes extends Frame {
    int chsX = 100, chsY = 100;

    public PaintingModes() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                chsX = x - 10;
                chsY = y - 10;

                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        g.drawLine(0, 0, 100, 100);
        g.drawLine(0, 100, 100, 0);
        g.setColor(Color.blue);
        g.drawLine(20, 25, 250, 180);
        g.drawLine(75, 90, 400, 400);
        g.setColor(Color.green);
        g.drawRect(10, 10, 60, 50);
        g.fillRect(100, 10, 60, 50);
        g.setColor(Color.red);
        g.drawRoundRect(190, 10, 60, 60,15, 15);
        g.fillRoundRect(70, 90, 140, 100, 30, 40);
        g.setColor(Color.cyan);
        g.drawLine(20, 150, 400, 40);
        g.drawLine(5, 290, 80, 19);

        // Объединить точки перекрестия по XOR
        g.setXORMode(Color.black);
        g.drawLine(chsX-10, chsY, chsX+10, chsY);
        g.drawLine(chsX, chsY-10, chsX, chsY+10);
        g.setPaintMode();
    }

    public static void main(String[] args) {
        PaintingModes window = new PaintingModes();
        window.setSize(new Dimension(400, 200));
        window.setTitle("Painting Modes");
        window.setVisible(true);
    }
}
