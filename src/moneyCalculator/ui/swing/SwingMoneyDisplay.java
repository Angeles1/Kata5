package moneyCalculator.ui.swing;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneyCalculator.model.*;
import moneyCalculator.ui.MoneyDisplay;

public class SwingMoneyDisplay extends JPanel implements MoneyDisplay{
    
    public SwingMoneyDisplay(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(amount());
        add(currency());
    }

    private JLabel amount() {
        return new JLabel("$");
    }

    private JLabel currency() {
        return new JLabel("500");
    }

    public void display(Money money) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
