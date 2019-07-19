import javax.swing.*;
public class carWithConstructor {
  String modelName;
    int registationNo;
    boolean secondHand;
    double price;
public void CarWithConstructor(String s,int n,boolean a,double d)
{
    modelName=s;
    registationNo=n;
    secondHand=a;
    price=d;
}
 void printProperties()
{
    JOptionPane.showMessageDialog(null,"Properties of car:"+"\n"+modelName);
    JOptionPane.showMessageDialog(null,"Registration of car:"+"\n"+registationNo);
    JOptionPane.showMessageDialog(null,"Price of car:"+"\n"+price);
    if(secondHand&&price>=500000)
        JOptionPane.showMessageDialog(null, "It is s recondition car but the price is so high");
    else if(secondHand&&price<500000)
            JOptionPane.showMessageDialog(null,"It is a recondition car and price is ok");
    else if(!secondHand&&price>500000)
        JOptionPane.showMessageDialog(null,"Unbelievable!!!!!!!did you steel it???????");
 }
}
 class CarWithConstructorDemo
{
public static void main(String[]args)
{
   carWithConstructor mycar=new carWithConstructor("corrola",1234,true,550000);
   carWithConstructor yourcar=new carWithConstructor("BMW",1794,false,500000);
    mycar.printProperties();
    yourcar.printProperties();
}
}
