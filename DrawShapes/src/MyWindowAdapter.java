import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Sokolov Oleg on 022 22.12.16.
 * turgenoid@gmail.com  - - - thegazer.ru
 */
public class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent windowEvent) {
        System.exit(0);
    }
}
