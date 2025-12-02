import java.awt.event.*;
import javax.swing.*;
class Demo extends JFrame implements ActionListener
{
    JTextField tf;
    JButton b;
    JLabel l;
    Demo()
    {
        setTitle("MCA II");
        setSize(500, 600);
        setVisible(true);

        tf = new JTextField();
        b = new JButton("Submit");
        l = new JLabel("Hello");


        tf.setBounds(100, 100, 100,50);
        b.setBounds(100, 160, 100, 50);
        l.setBounds(100, 220, 100, 50);

        b.addActionListener(this);


        add(tf);
        add(b);
        add(l);
    }

        public void actionPerformed(ActionEvent e)
        {
            String s = tf.getText().toString();
            l.setText(s);
        }

    
    public static void main(String [] k)
    {
        new Demo();
    }
}