import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Sokolov Oleg on 022 22.12.16.
 * turgenoid@gmail.com  - - - thegazer.ru
 */
public class SampleFonts extends Frame {
    int next = 0;
    Font f;
    String msg;

    public SampleFonts() {
        f = new Font("Dialog", Font.PLAIN, 12);
        msg = "Dialog";
        setFont(f);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        addMouseListener(new MyMouseAdapter(this));
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawString(msg, 10, 40);
    }

    public static void main(String[] args) {
        SampleFonts sampleFonts = new SampleFonts();
        sampleFonts.setSize(new Dimension(200, 100));
        sampleFonts.setTitle("Sample Fonts");
        sampleFonts.setVisible(true);
    }
}
