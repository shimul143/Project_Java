import javax.swing.*;
public class car {
    String modelName;
    int registationNo;
    boolean secondHand;
    double price;
public void setProperties(String s,int n,boolean a,double d)
{
    modelName=s;
    registationNo=n;
    secondHand=a;
    price=d;
}
public void printProperties()
{
    JOptionPane.showMessageDialog(null,"Properties of car:"+"\n"+modelName);
    JOptionPane.showMessageDialog(null,"Registration of car:"+"\n"+registationNo);
    JOptionPane.showMessageDialog(null,"Price of car:"+"\n"+price);
    JOptionPane.showMessageDialog(null,"I the car secondhand"+"\n"+secondHand);
    
}
}
 class CarDemo{
  public static void main(String[] args)
    {
        car mycar=new car();
        mycar.setProperties("BMW",1234,true,2500000.00);
    }
}
