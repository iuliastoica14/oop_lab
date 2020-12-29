import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SimonController{
    SimonPanel simonPanel;
    SimonModel simonModel;
    List<JButton> userInput = new ArrayList<JButton>();
    int running=1;
    int count=0;

    SimonController(SimonModel simonModel,SimonPanel panel)
    {
        this.simonPanel=panel;
        this.simonModel=simonModel;
        panel.addStartListener(new StartListener());
        panel.addColorListener(new ColorListener());

    }


    class ColorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (running == 1) {
                userInput.add((JButton)e.getSource());
                count++;
                simonModel.checkUserInput(userInput);
                simonPanel.setT(count," / ",simonModel.level);
                if(userInput.size() == simonModel.sequenceLength) {
                    userInput.clear();
                    count = 0;
                    simonPanel.setT(count," / ",simonModel.level);
                }
                if(simonModel.isGameOver) {
                    count = 0;
                    simonPanel.setT(count," / ",simonModel.level);
                    running = 0;
                }
                simonPanel.setLevel(simonModel.level);
                simonPanel.setScore(simonModel.score);
            }
        }
    }

    class StartListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            simonModel.start();
            userInput.clear();
            count = 0;
            running=1;
            simonPanel.setLevel(simonModel.level);
            simonPanel.setScore(simonModel.score);
            simonPanel.setT(count," / ",simonModel.level);
        }
    }


}
