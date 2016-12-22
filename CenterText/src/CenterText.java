import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Sokolov Oleg on 022 22.12.16.
 * turgenoid@gmail.com  - - - thegazer.ru
 */
public class CenterText extends Frame {
    final Font f = new Font("SansSerif", Font.BOLD, 12);

    public CenterText() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        Dimension dimension = this.getSize();

        g.setColor(Color.white);
        g.fillRect(0, 0, dimension.width, dimension.height);
        g.setColor(Color.black);
        g.setFont(f);
        drawCenteredString("This is centered String", dimension.width, dimension.height, g);
    }

    public void drawCenteredString(String s, int w, int h, Graphics g) {
        FontMetrics fontMetrics = g.getFontMetrics();
        int x = (w - fontMetrics.stringWidth(s)) / 2;
        int y = (fontMetrics.getAscent() + (h - (fontMetrics.getAscent() + fontMetrics.getDescent()))/ 2);
        g.drawString(s, x, y);
    }

    public static void main(String[] args) {
        CenterText centerText = new CenterText();
        centerText.setSize(new Dimension(200, 100));
        centerText.setTitle("Center Text");
        centerText.setVisible(true);
    }
}
