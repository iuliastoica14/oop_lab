import java.awt.*;
import java.awt.event.*;
import java.awt.image.ColorModel;
import java.math.RoundingMode;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.Graphics;

public class SimonPanel  extends JFrame implements ActionListener{

    JButton red;
    JButton green;
    JButton blue;
    JButton yellow;

    SimonPanel() {
        JFrame frame = new JFrame ("Simon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 710);


        JPanel details=new JPanel();
        JPanel detailsarr=new JPanel();
        JPanel colors = new JPanel();
        JPanel gamebuttons = new JPanel();

        JLabel txtscore=new JLabel("Score : ");
        txtscore.setForeground(Color.white);
        JLabel score=new JLabel();
        score.setForeground(Color.red);
        JLabel txtlevel=new JLabel("Level : ");
        txtlevel.setForeground(Color.white);
        JLabel level=new JLabel();
        level.setForeground(Color.red);
        JLabel t=new JLabel();
        details.add(txtscore);
        details.add(score);
        details.add(txtlevel);
        details.add(level);
        details.add(t);
        details.setLayout(new GridLayout(2,2));
        details.setBackground(Color.black);
        detailsarr.add(details,BorderLayout.CENTER);
        detailsarr.setBackground(Color.black);
        detailsarr.setBorder(BorderFactory.createLineBorder(Color.black,30));


        JButton green = new JButton();
        green.setBackground(Color.GREEN.darker().darker());
        green.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                green.setBackground(Color.green);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                green.setBackground(Color.GREEN.darker().darker());
            }
        });
        green.addActionListener(this);
        green.setBorder(BorderFactory.createLineBorder(Color.black,30));

        JButton red = new JButton();
        red.setBackground(Color.red.darker().darker());
        red.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                red.setBackground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                red.setBackground(Color.red.darker().darker());
            }
        });
        red.addActionListener(this);
        red.setBorder(BorderFactory.createLineBorder(Color.black,30));

        JButton yellow = new JButton();
        yellow.setBackground(Color.yellow.darker().darker());
        yellow.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                yellow.setBackground(Color.yellow);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                yellow.setBackground(Color.yellow.darker().darker());
            }
        });
        yellow.addActionListener(this);
        yellow.setBorder(BorderFactory.createLineBorder(Color.black,30) );

        JButton blue = new JButton();
        blue.setBackground(Color.blue.darker().darker());
        blue.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                blue.setBackground(Color.blue);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                blue.setBackground(Color.blue.darker().darker());
            }
        });
        blue.addActionListener(this);
        blue.setBorder(BorderFactory.createLineBorder(Color.black,30));

        colors.add(green);
        colors.add(red);
        colors.add(yellow);
        colors.add(blue);
        colors.setLayout(new GridLayout(2,2));
        colors.setBackground(Color.black);
        colors.setBorder(BorderFactory.createEmptyBorder(30,30,0,30));



        JButton start = new JButton("START");
        start.setBackground(Color.black);
        start.setForeground(Color.MAGENTA);
        gamebuttons.add(start);
        gamebuttons.setBackground(Color.black);
        gamebuttons.setBorder(BorderFactory.createEmptyBorder(30,30,60,30));


        Container contentPane = frame.getContentPane();
        BorderLayout layout=new BorderLayout(5,5);
        frame.getContentPane().setLayout(layout);
        contentPane.add(detailsarr, layout.PAGE_START);
        colors.setPreferredSize(new Dimension(600,600));
        contentPane.add(colors, layout.CENTER);
        contentPane.add(gamebuttons, layout.PAGE_END);
        frame.setContentPane(contentPane);
        frame.getContentPane().setBackground(Color.black);
        blue.setBackground(Color.blue.darker());
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
