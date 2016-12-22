import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Sokolov Oleg on 022 22.12.16.
 * turgenoid@gmail.com  - - - thegazer.ru
 */
public class AppWindow extends Frame {
    final int inc = 25;
    int max = 500;
    int min = 200;
    Dimension d;

    public AppWindow() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int w = (d.width + inc) > max ? min : (d.width + inc);
                int h = (d.height + inc) > max ? min : (d.height + inc);
                setSize(new Dimension(w, h));
            }
        });
    }

    public void paint(Graphics g) {
        d = getSize();
        g.drawLine(0, 0, d.width-1, d.height-1);
        g.drawLine(0, d.height-1, d.width-1, 0);
        g.drawLine(0, 0, d.width-1, d.height-1);
    }

    public static void main(String[] args) {
        AppWindow appWindow = new AppWindow();
        appWindow.setSize(new Dimension(200, 200));
        appWindow.setTitle("Resizing Shapes");
        appWindow.setVisible(true);
    }
}
