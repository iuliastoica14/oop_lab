import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertorController {

    private ConvertorModel model;
    private  ConvertorView view;

    ConvertorController(ConvertorModel model,ConvertorView view){
        this.model=model;
        this.view=view;

        view.addConvertListener(new ConvertListener());
    }

    class ConvertListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String userInput="";
            String currency1="";
            String currency2="";
            try{
                userInput=view.getUserInput();
                currency1=view.getCurrency1();
                currency2=view.getCurrency2();
                model.suma=Double.parseDouble(userInput);
                model.convert(currency1,currency2);
                view.rez(model.rezultat);
            }
            catch (NumberFormatException nfex) {
                view.showError("Bad input: '" + userInput + "'");
            }
        }
    }
}
