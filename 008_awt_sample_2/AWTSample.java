

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTSample {

    public static void main(String[] args) {

        final Frame f = new Frame("Hello World example of awt application");
        f.setSize(300,100);

        Label label1 = new Label("Hello World", Label.CENTER);
        f.add(label1);

        f.addWindowListener(new SampleWindowAdapter(f));

        f.setVisible(true);
    }


    private static class SampleWindowAdapter extends WindowAdapter {
        private final Frame frame;

        public SampleWindowAdapter(Frame frame) {
            this.frame = frame;
        }

        public void windowClosing(WindowEvent event) {
            frame.dispose();
        }
    }
}
