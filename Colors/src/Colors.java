import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Sokolov Oleg on 022 22.12.16.
 * turgenoid@gmail.com  - - - thegazer.ru
 */
public class Colors extends Frame {
    public Colors() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        Color c1 = new Color(255, 100, 100, 200);
        Color c2 = new Color(100, 255, 100, 100);
        Color c3 = new Color(100, 100, 255, 20);

        g.setColor(c1);
        g.drawLine(0, 0, 100, 100);
        g.drawLine(0, 100, 100, 0);

        g.setColor(c2);
        g.drawLine(40, 25, 250, 180);
        g.drawLine(75,90, 400, 400);

        g.setColor(c3);
        g.drawLine(20, 150, 400, 40);
        g.drawLine(5, 290, 80, 19);

        g.setColor(Color.red);
        g.drawOval(10, 10, 50, 50);
        g.fillOval(70, 90, 140, 100);

        g.setColor(Color.blue);
        g.drawOval(190, 10, 90, 30);
        g.drawRect(10, 10, 60, 50);

        g.setColor(Color.cyan);
        g.fillRect(100, 10, 60, 50);
        g.drawRoundRect(190, 10, 60, 50, 15, 15);
    }

    public static void main(String[] args) {
        Colors colors = new Colors();
        colors.setSize(new Dimension(300, 200));
        colors.setTitle("Colors");
        colors.setVisible(true);
    }
}
