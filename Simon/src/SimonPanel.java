import java.awt.*;
import java.awt.event.*;
import java.awt.image.ColorModel;
import java.math.RoundingMode;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.Graphics;

public class SimonPanel  extends JFrame {

    private JButton red= new JButton();
    private JButton green= new JButton();
    private JButton blue= new JButton();
    private JButton yellow= new JButton();

    private JLabel score=new JLabel();
    private JLabel level=new JLabel();
    private JLabel t=new JLabel();

    private JButton start = new JButton("START");

    SimonPanel() {
        JFrame frame = new JFrame ("Simon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 710);


        JPanel details=new JPanel(new GridLayout(1,2));
        JPanel detailsarr=new JPanel(new BorderLayout());
        JPanel colors = new JPanel();
        JPanel gamebuttons = new JPanel();

        JLabel txtscore=new JLabel("Score : ");
        txtscore.setForeground(Color.white);
        score.setForeground(Color.red);
        level.setForeground(Color.red);

        JLabel txtlevel=new JLabel("Level : ");
        txtlevel.setForeground(Color.white);

        JPanel scorePanel=new JPanel(new FlowLayout());
        scorePanel.add(txtscore);
        scorePanel.add(score);
        scorePanel.setBackground(Color.black);

        JPanel lvlPanel=new JPanel(new FlowLayout());
        lvlPanel.add(txtlevel);
        lvlPanel.add(level);
        lvlPanel.setBackground(Color.black);

        JPanel help=new JPanel();
        help.add(t);
        help.setBackground(Color.black);
        help.setBorder(new EmptyBorder(30,0,0,0));

        details.add(scorePanel);
        details.add(lvlPanel);
        details.setBackground(Color.black);
        detailsarr.add(details,BorderLayout.NORTH);
        detailsarr.add(help,BorderLayout.SOUTH);
        detailsarr.setBackground(Color.black);
        detailsarr.setBorder(new EmptyBorder(30,30,10,30));


        green = new JButton();
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

        green.setBorder(BorderFactory.createLineBorder(Color.black,30));

        red = new JButton();
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

        red.setBorder(BorderFactory.createLineBorder(Color.black,30));

        yellow = new JButton();
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

        yellow.setBorder(BorderFactory.createLineBorder(Color.black,30) );

        blue = new JButton();
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

        blue.setBorder(BorderFactory.createLineBorder(Color.black,30));

        colors.add(green);
        colors.add(red);
        colors.add(yellow);
        colors.add(blue);
        colors.setLayout(new GridLayout(2,2));
        colors.setBackground(Color.black);
        colors.setBorder(BorderFactory.createEmptyBorder(30,30,0,30));


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

    public JButton getBlue() {
        return blue;
    }

    public JButton getGreen() {
        return green;
    }

    public JButton getRed() {
        return red;
    }

    public JButton getYellow() {
        return yellow;
    }

    public void setLevel(int level) {
        this.level.setText(String.valueOf(level));
    }

    public void setScore(int score) {
        this.score.setText(String.valueOf(score));
    }

    public void setT(int count,String txt,int lvl) {
        this.t.setText(count+txt+lvl);
    }

    public void sendError(String message) {
        JOptionPane.showMessageDialog(this, message, "Game Over!", JOptionPane.ERROR_MESSAGE);
    }

    public void addColorListener(ActionListener actionListener) {
        red.addActionListener(actionListener);
        yellow.addActionListener(actionListener);
        blue.addActionListener(actionListener);
        green.addActionListener(actionListener);
    }

    public void addStartListener(ActionListener actionListener) {
        start.addActionListener(actionListener);
    }
}
