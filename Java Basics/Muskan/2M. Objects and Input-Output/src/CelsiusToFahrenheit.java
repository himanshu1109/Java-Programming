import javax.swing.*;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        String input;
        input = JOptionPane.showInputDialog("Enter temperature in celsius");
        double celsius = Double.parseDouble(input);

        double fahrenheit = 1.8*celsius+32;
        JOptionPane.showMessageDialog(null ,"Temperature in fahrenheit is " + fahrenheit);
    }
}
