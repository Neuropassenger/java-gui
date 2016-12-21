import java.awt.*;

/**
 * Created by Sokolov Oleg on 021 21.12.16.
 * turgenoid@gmail.com  - - - thegazer.ru
 */
public class AppWindow extends Frame {
    String keyMsg = "This is the test.";
    String mouseMsg = "";
    int mouseX = 30, mouseY = 30;

    public AppWindow() {
        addKeyListener(new MyKeyAdapter(this));
        addMouseListener(new MyMouseAdapter(this));
        addWindowListener(new MyWindowAdapter());
    }

    public void paint(Graphics g) {
        g.drawString(keyMsg, 10, 40);
        g.drawString(mouseMsg, mouseX, mouseY);
    }

    // создать окно
    public static void main(String[] args) {
        AppWindow appWindow = new AppWindow();
        appWindow.setSize(new Dimension(300, 200));
        appWindow.setTitle("My first program using AWT");
        appWindow.setVisible(true);
    }
}

