/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
interface perimeter
{
   void getdata();
   void calculate();
}
class circle implements perimeter
{
    double a;
    public void getdata()
    {
        System.out.println("Enter the radius of a circle to calculate perimeter:");
        Scanner s=new Scanner(System.in);
        a=s.nextDouble();
        System.out.println("The entered value is"+a);
    }
    public void calculate()
    {
        double c;
        c=2*3.17*a;
        System.out.println("The perimeter of a circle:"+c);
    }
}
class rectangle implements perimeter
{
    double l,w;
    public void getdata()
    {
        System.out.println("Enter the length and breadth of a rectangle to calculate perimeter:");
        Scanner s=new Scanner(System.in);
        l=s.nextDouble();
        w=s.nextDouble();
        System.out.println("The entered values are :"+l+"\t"+w);
    }
    public void calculate()
    {
        double d;
        d=2*(l+w);
        System.out.println("the perimeter of rectangle:"+d);
    }
}
public class Inter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        circle obj=new circle();
        rectangle obj1=new rectangle();
        obj.getdata();
        obj.calculate();
        obj1.getdata();
        obj1.calculate();
    }
    
}
