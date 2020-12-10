import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.plaf.basic.ComboPopup;
import java.awt.*;

public class Convertor {

    public static void main(String[] args) {
        ConvertorModel model=new ConvertorModel();
        ConvertorView view = new ConvertorView(model);
        ConvertorController controller=new ConvertorController(model,view);
        view.setVisible(true);
    }
}
