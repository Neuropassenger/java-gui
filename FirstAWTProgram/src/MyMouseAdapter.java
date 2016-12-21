import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Sokolov Oleg on 021 21.12.16.
 * turgenoid@gmail.com  - - - thegazer.ru
 */
class MyMouseAdapter extends MouseAdapter {
    AppWindow appWindow;
    public MyMouseAdapter(AppWindow appWindow) {
        this.appWindow = appWindow;
    }

    public void mousePressed(MouseEvent mouseEvent) {
        appWindow.mouseX = mouseEvent.getX();
        appWindow.mouseY = mouseEvent.getY();
        appWindow.mouseMsg = "Mouse down at " + appWindow.mouseX + ", " + appWindow.mouseY;
        appWindow.repaint();
    }
}
