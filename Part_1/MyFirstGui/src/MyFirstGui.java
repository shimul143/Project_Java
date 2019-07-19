import java.awt.*;
public class MyFirstGui extends Frame
{
    Label theLabel=new Label("I love my Bangladesh",Label.CENTER);
    public static void main(String args[])
    {
        MyFirstGui theApp= new MyFirstGui();
    }
    public MyFirstGui()
    {
        super("My first Gui");
        add(theLabel);
        setSize(500,400);
        setVisible(true);
    }
}
