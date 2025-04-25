import java.awt.*;
import java.awt.event.*;

class LargestOfThree extends Frame implements ActionListener {
    TextField t1, t2, t3, result;
    Button findLargest;

    LargestOfThree() {
        setLayout(new FlowLayout());

        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);
        result = new TextField(30);
        findLargest = new Button("Find Largest");

        add(new Label("Number 1:"));
        add(t1);
        add(new Label("Number 2:"));
        add(t2);
        add(new Label("Number 3:"));
        add(t3);
        add(findLargest);
        add(result);

        findLargest.addActionListener(this);

        setSize(900, 700);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int num3 = Integer.parseInt(t3.getText());

        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        result.setText("Largest Number is: " + largest);
    }

    public static void main(String[] args) {
        new LargestOfThree();
    }
}
