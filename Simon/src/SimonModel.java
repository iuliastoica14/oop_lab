import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimonModel {
    int sequenceLength = 1;
    private List<JButton> sequenceColors;
    int score;
    int level=1;
    boolean isGameOver = false;
    private SimonPanel simon;

    public SimonModel(SimonPanel simon)
    {
        this.simon=simon;
        sequenceColors = new ArrayList<JButton>();

    }


    /***
     * Adaugarea unei noi culori secventei jocului printr-un numar.
     * @param nr
     */
    private void addColor(int nr)
    {
        if(nr ==  0)
            sequenceColors.add(simon.getGreen());
        else if(nr ==  1)
            sequenceColors.add(simon.getRed());
        else if(nr ==  2 )
            sequenceColors.add(simon.getYellow());
        else if(nr ==  3 )
            sequenceColors.add(simon.getBlue());

    }

    /***
     * Generarea unui numar random intre 0 si 3 si adaugarea culorii respective in secventa .
     */
    void play() {

            int nr = new Random().nextInt() % 4;
            if (nr < 0)
                nr = nr * -1;
            //System.out.println(nr+1);
            addColor(nr);


    }


    /***
     * Funtia de flash a butonul ce urmeaza in secventa.
     * Pentru fiecare buton din secventa culoarea se face mai inchisa si normala.
     * De 2 ori culoarea e inchisa pentru a distinge 2 culori identice consecutive.
     */
    public void flash(){
        for(JButton button:sequenceColors)
        {
            Color color = null;
            if(button== simon.getBlue())
                color=Color.blue;
            if(button== simon.getRed())
                color=Color.red;
            if(button== simon.getGreen())
                color=Color.green;
            if(button== simon.getYellow())
                color=Color.yellow;
            button.setBackground(color.darker().darker());
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            button.setBackground(color);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            button.setBackground(color.darker().darker());
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public void nextflashing()
    {
        Thread thread = new Thread("New Thread")
        {
            public void run()
            {
                flash();
            }
        };
        thread.start();
    }

    /***
     * Se compara butoanele apasate cu cele generate de joc.
     * Daca s-au apasat toate butoanele se trece la nivelul urmator, adugandu-se o culoare noua.
     * @param userInput -- butoanele pe care apasa user-ul
     */
    public void checkUserInput(List<JButton> userInput)
    {
        if(compareUserInput(userInput))
        {
            score = score + 1;
            sequenceLength=sequenceColors.size();
            if( userInput.size()==sequenceColors.size()) {
                score*=level;
                level++;
                play();
                nextflashing();
            }
        }
        else
            gameOver();
    }


    private boolean compareUserInput(List<JButton> userInput)
    {
        boolean result = true;
        for(int i=0;i<userInput.size();i++)
            if(userInput.get(i)!=sequenceColors.get(i))
            {
                result = false;
            }

        return result;
    }


    public void gameOver()
    {
        simon.sendError("You lose!\nYour score was: "+score);
        score = 0;
        isGameOver = true;
        sequenceColors.clear();
        sequenceLength=1;
        level=1;
    }

    public void start()
    {
        score = 0;
        isGameOver = false;
        sequenceColors.clear();
        sequenceLength=1;
        level=1;
        play();
        nextflashing();
    }

}
