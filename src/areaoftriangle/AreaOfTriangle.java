/*
 * The purpose of the program is to Calculates the area of a scalene triangle using Herson's formula.
 */
package areaoftriangle;

/**
 *
 * @author Gloria Song
 * Date: 2018/9/9
 */
import javax.swing.*;
public class AreaOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a , b , c;
        double perimeter,area;
        String length1, length2, length3;
        //Above to claim varibales of different types.
        length1 = JOptionPane.showInputDialog(null,"Triangel side length a","Input",JOptionPane.PLAIN_MESSAGE);
        length2 = JOptionPane.showInputDialog(null,"Triangel side length b","Input",JOptionPane.PLAIN_MESSAGE);
        length3 = JOptionPane.showInputDialog(null,"Triangel side length c","Input",JOptionPane.PLAIN_MESSAGE);
        //Input strings by using JOptionPane.showInputDialog.
        a = Double.valueOf(length1);
        b = Double.valueOf(length2);
        c = Double.valueOf(length3);
        //Data type transfering.
        
        if (a+b>c && b+c>a && a+c>b){
            perimeter = a+b+c;
            area = Math.sqrt(perimeter/2*(perimeter/2-a)*(perimeter/2-b)*(perimeter/2-c));
            System.out.println("Area of Triangle is:" + area);
        }
        else {
            System.out.println("Area of Triangle is not availble");
        }
        //To Calculate.
    }
    
}
