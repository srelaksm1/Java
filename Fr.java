import java.awt.*; //
import java.awt.event.*; //interface for doing event driven programming
class Fr extends Frame implements ActionListener	
{
TextField t1,t2,t3;
Button b1,b2;
Fr()
{
setLayout(new FlowLayout());
t1=new TextField(20);
t2=new TextField(10);
t3=new TextField(20);
b1=new Button("click");
b2=new Button("Square value");

add(t1);
add(b1);
add(t2);
add(t3);
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
setVisible(true);
setSize(300,300);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
t1.setText("Good Morning");
if(ae.getSource()==b2)
{
int x=Integer.parseInt(t2.getText());
t3.setText(String.valueOf(x*x));
}
}
public static void main(String args[])
{
Fr obj=new Fr();
obj.show();
}
}