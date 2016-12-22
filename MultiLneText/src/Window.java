import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Sokolov Oleg on 022 22.12.16.
 * turgenoid@gmail.com  - - - thegazer.ru
 */
public class Window extends Frame {
    int curX = 10, curY = 30; // текущая позиция

    public Window() {
        Font f = new Font("SansSerif", Font.PLAIN, 12);
        setFont(f);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        nextLine("This is on line one", g);
        nextLine("This is on line two", g);
        sameLine("This is on same line", g);
        sameLine("This is too", g);
        nextLine("This is on line three", g);

        // установка координат в исходное положение после перерисовки
        curX = 10;
        curY = 30;
    }

    // перейти на следующую строку
    void nextLine(String s, Graphics g) {
        FontMetrics fontMetrics = g.getFontMetrics();
        curY += fontMetrics.getHeight(); // перейти на следующую строку
        curX = 10;
        g.drawString(s, curX, curY);
        curX = fontMetrics.stringWidth(s + 10); // перейти в конец строки
    }

    // остаться на прежней
    void sameLine(String s, Graphics g) {
        FontMetrics fontMetrics = g.getFontMetrics();
        g.drawString(s, curX, curY);
        curX += fontMetrics.stringWidth(s); // перейти в конец строки
    }

    public static void main(String[] args) {
        Window window = new Window();
        window.setSize(new Dimension(300, 100));
        window.setTitle("Multiline text");
        window.setVisible(true);
    }
}
