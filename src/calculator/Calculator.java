package calculator;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author ahmed
 */
public class Calculator extends Frame implements ActionListener
{
    
int x=0;
int y=1;

int action=0;

TextField txt=new TextField(40);

Button seven=new Button("7");
Button eight=new Button("8");
Button nine=new Button("9");
Button four=new Button("4");
Button five=new Button("5");
Button six=new Button("6");
Button one=new Button("1");
Button two=new Button("2");
Button three=new Button("3");

Button zero=new Button("0");

Button del=new Button("Delete");

Button plus=new Button("+");
Button minus=new Button("-");
Button division=new Button("/");
Button multiply=new Button("*");

Button Equal=new Button("=");

Label C_Right=new Label("Created By Ahmed-Raaof ♥_♥");

Calculator(){
setLayout(null);
setBounds(519,274,650,500);
setBackground(Color.darkGray);

txt.setBounds(40,35,500,40);

seven.setBounds(20,120,100,50);
seven.setBackground(Color.LIGHT_GRAY);
eight.setBounds(135,120,100,50);
eight.setBackground(Color.LIGHT_GRAY);
nine.setBounds(250,120,100,50);
nine.setBackground(Color.LIGHT_GRAY);
four.setBounds(20,185,100,50);
four.setBackground(Color.LIGHT_GRAY);
five.setBounds(135,185,100,50);
five.setBackground(Color.LIGHT_GRAY);
six.setBounds(250,185,100,50);
six.setBackground(Color.LIGHT_GRAY);
one.setBounds(20, 250, 100, 50);
one.setBackground(Color.LIGHT_GRAY);
two.setBounds(135,250,100,50);
two.setBackground(Color.LIGHT_GRAY);
three.setBounds(250,250,100,50);
three.setBackground(Color.LIGHT_GRAY);

zero.setBounds(145,320,80,80);
zero.setBackground(Color.lightGray);

del.setBounds(550,35,90,40);
del.setBackground(Color.white);

plus.setBounds(380,100,75,75);
plus.setBackground(Color.gray);
minus.setBounds(380,220,75,75);
minus.setBackground(Color.gray);
division.setBounds(500,100,75,75);
division.setBackground(Color.gray);
multiply.setBounds(500,220,75,75);
multiply.setBackground(Color.gray);

Equal.setBounds(350,320,250,80);
Equal.setBackground(Color.white);

C_Right.setBounds(20,450,200,60);

add(txt);

add(seven);
add(eight);
add(nine);
add(four);
add(five);
add(six);
add(one);
add(two);
add(three);

add(zero);

add(del);

add(plus);
add(minus);
add(division);
add(multiply);

add(Equal);

add(C_Right);

txt.addActionListener(this);

//seven.addActionListener(this);
eight.addActionListener(this);
nine .addActionListener(this);
four.addActionListener (this);
five.addActionListener (this);
six.addActionListener (this);
one.addActionListener (this);
two.addActionListener (this);
three.addActionListener (this);

zero.addActionListener(this);

del.addActionListener(this);

plus.addActionListener(this);
minus.addActionListener(this);
division.addActionListener(this);
multiply.addActionListener(this);

Equal.addActionListener(this);

setVisible(true);
}
    public static void main(String[] args) 
    {
       Calculator c=new Calculator();
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==seven)
        {
            txt.setText( txt.getText()+"7");   
        }
        if(e.getSource()==eight)
        {
            txt.setText( txt.getText()+"8");
        }
        if(e.getSource()==nine)
        {
            txt.setText( txt.getText()+"9");    
        }
        if(e.getSource()==four)
        {
            txt.setText( txt.getText()+"4");
        }
        if(e.getSource()==five)
        {
            txt.setText( txt.getText()+"5");
        }
        if(e.getSource()==six)
        {
            txt.setText( txt.getText()+"6");
        }
        if(e.getSource()==one)
        {
            txt.setText( "1");
        }
        if(e.getSource()==two)
        {
            txt.setText( txt.getText()+"2");
        }
        if(e.getSource()==three)
        {
            txt.setText( txt.getText()+"3");
        }
        if(e.getSource()==zero)
        {
            txt.setText( txt.getText()+"0");   
        }
        
        if(e.getSource()==del)
        {
            x=0;
            y=1;
            action=0;
            txt.setText("");
        } 
        if(e.getSource()==plus)
        {
            action=1;
            x= x+Integer.parseInt(txt.getText());
            txt.setText("");  
        } 
        if(e.getSource()==minus)
        {
            action=2;
            x= Integer.parseInt(txt.getText())-x;
            txt.setText("");  ;        
        } 
        if(e.getSource()==division)
        {
            action=3;
            y= Integer.parseInt(txt.getText())/y;
            txt.setText("");        
        }
        if(e.getSource()==multiply)
        {
            action=4;
            y= y*Integer.parseInt(txt.getText());
            txt.setText("");        
        }
        if(e.getSource()==Equal)
        {
            if(action==1)
            {
                x= x+Integer.parseInt(txt.getText());
                txt.setText(String.valueOf(x));
            }
            else if(action==2){
                x= x-Integer.parseInt(txt.getText());
                txt.setText(String.valueOf(x));
            }
            else if(action==3)
            {
                y=y/Integer.parseInt(txt.getText());
                txt.setText(String.valueOf(y));
            }
            else if(action==4)
            {
                y= y*Integer.parseInt(txt.getText());
                txt.setText(String.valueOf(y));
            }
        }
    }
}
