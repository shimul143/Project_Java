
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shimul
 */
public class CricleNew {

    
public static double function(double r)
    {
        double area;
        area = 3.1416*r*r;
        return area;
    }
    public static void main(String []args)
    {

        double r;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of r:");
        r=input.nextDouble();
        
        double area=function(r);
        System.out.println("the value oF R="+r+"\n The value of area="+area);


        
        
    }
    

}
