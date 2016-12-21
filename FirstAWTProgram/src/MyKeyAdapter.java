import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Sokolov Oleg on 021 21.12.16.
 * turgenoid@gmail.com  - - - thegazer.ru
 */
class MyKeyAdapter extends KeyAdapter {
    AppWindow appWindow;

    public MyKeyAdapter(AppWindow appWindow) {
        this.appWindow = appWindow;
    }

    public void keyTyped(KeyEvent keyEvent) {
        appWindow.keyMsg += keyEvent.getKeyChar();
        appWindow.repaint();
    }
}
