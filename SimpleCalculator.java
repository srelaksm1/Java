import java.awt.*;
import java.awt.event.*;

class SimpleCalculator extends Frame implements ActionListener {
    TextField t1, t2, result;
    Button addButton, subButton, mulButton, divButton, clearButton, equalButton;

    SimpleCalculator() {
        // Setting layout
        setLayout(new FlowLayout());

        // Initializing TextFields and Buttons
        t1 = new TextField(10);
        t2 = new TextField(10);
        result = new TextField(20);
        
        addButton = new Button("+");
        subButton = new Button("-");
        mulButton = new Button("*");
        divButton = new Button("/");
        clearButton = new Button("Clear");
        equalButton = new Button("=");

        // Adding labels and components
        add(new Label("Enter Number 1:"));
        add(t1);
        add(new Label("Enter Number 2:"));
        add(t2);
        add(new Label("Result:"));
        add(result);

        // Adding buttons to the frame
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);
        add(equalButton);
        add(clearButton);

        // Adding ActionListener to buttons
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        equalButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Setting frame properties
        setSize(300, 300);
        setVisible(true);

        // Add window closing listener
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        double num1, num2, res;

        try {
            num1 = Double.parseDouble(t1.getText());
            num2 = Double.parseDouble(t2.getText());
        } catch (NumberFormatException e) {
            result.setText("Invalid input!");
            return;
        }

        switch (command) {
            case "+":
                res = num1 + num2;
                result.setText("Result: " + res);
                break;
            case "-":
                res = num1 - num2;
                result.setText("Result: " + res);
                break;
            case "*":
                res = num1 * num2;
                result.setText("Result: " + res);
                break;
            case "/":
                if (num2 != 0) {
                    res = num1 / num2;
                    result.setText("Result: " + res);
                } else {
                    result.setText("Cannot divide by 0");
                }
                break;
            case "=":
                result.setText("Result: " + result.getText());
                break;
            case "Clear":
                t1.setText("");
                t2.setText("");
                result.setText("");
                break;
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
