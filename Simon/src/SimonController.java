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
        /***
         * Prin running se verifica daca jocul se deruleaza. Cand running este 0, jocul trece la valorile initiale si
         * este in stand-by pana ce se apasa butonul start.
         * Se verifica daca butonul apasat este cel ce urmeaza in secventa si se actualizeaza panelul de scor,
         * daca nu, running este 0.
         */
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

        /***
         * Initializarea parametrilor jocului si pornirea acestuia.
         */
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
