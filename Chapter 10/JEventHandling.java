import java.awt.*;
import java.awt.event.*;
class JEventHandling extends Frame implements ActionListener{
TextField tf;
JEventHandling(){

//create components
tf=new TextField();
tf.setBounds(60,50,170,20);
Button b=new Button("click me");
b.setBounds(100,120,80,30);

//register listener
b.addActionListener(this);//passing current instance

//add components and set size, layout and visibility
add(b);add(tf);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e){
tf.setText("This is an event");
}
public static void main(String args[]){
new JEventHandling();
}
}