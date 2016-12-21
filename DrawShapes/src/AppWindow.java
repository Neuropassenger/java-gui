import java.awt.*;
import java.awt.event.WindowAdapter;

/**
 * Created by Sokolov Oleg on 022 22.12.16.
 * turgenoid@gmail.com  - - - thegazer.ru
 */
public class AppWindow extends Frame {
    public AppWindow() {
        addWindowListener(new MyWindowAdapter());
    }

    public void paint(Graphics g) {
        // Рисование линий
        g.drawLine(0, 0, 100, 90);
        g.drawLine(0, 90, 100, 10);
        g.drawLine(40, 25, 250, 80);

        // Рисование прямоугольников
        g.drawRect(10, 150, 60, 50);
        g.fillRect(100, 150, 60, 50);
        g.drawRoundRect(190, 150, 60, 50, 15, 15);
        g.fillRoundRect(280, 150, 60, 50, 30, 40);

        // Рисование элипсов и окружностей
        g.drawOval(10, 250, 50, 50);
        g.fillOval(90, 250, 75, 50);
        g.drawOval(190, 260, 100, 40);

        // Рисование дуг
        g.drawArc(10, 350, 70, 70, 0, 180);
        g.fillArc(60, 350, 70, 70, 0, 75);

        // Рисование многоугольника
        int xPoints[] = {10, 200, 10, 200, 10};
        int yPoints[] = {450, 450, 650, 650, 450};
        int num = 5;

        g.drawPolygon(xPoints, yPoints, num);
    }

    public static void main(String[] args) {
        AppWindow appWindow = new AppWindow();
        appWindow.setSize(new Dimension(350, 700));
        appWindow.setTitle("Drawing Shapes with AWT");
        appWindow.setVisible(true);
    }
}
