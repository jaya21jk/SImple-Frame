
import javax.swing.*;
import java.awt.*;

public class Main {

    JFrame window ;
    Main() {
        window = new JFrame();
        window.setVisible(true);
    }

    public static void main(String[] args) {

//        Main main = new Main();

        JFrame frame = new JFrame("Simple frame");
        frame.setLayout(null);
        frame.setBackground(Color.green);
        frame.setSize(500,500);
        JButton jaya = new JButton("jaya");
        jaya.setBackground(Color.green);
        jaya.setBounds(100,0,100,20);
        frame.add(jaya);
        frame.setVisible(true);

    }
}