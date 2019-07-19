import javax.swing.*;
public class Compute_tax {
    double taxCalculator(int s,double income)
    {
    switch(s)
    {
        case 1:
            JOptionPane.showMessageDiolog(null, "cat1:Doctor\nEngineer\nTeacher\nB.w");
            return(income*.06);
            break;
        case 2:
            JOptionPane.showMessageDiolog(null,"cat2:Service Holdera");
            return(income*.03);
            break;
        case 3:
            JOptionPane.showMessageDoilog(null, "cat3:Work so on");
            return(income*.01);
            break;
    }
    }

}
