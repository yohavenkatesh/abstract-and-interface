/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
    abstract class marks
    {
        abstract void getpercentage();
    }
    class A extends marks
    {
        int m1,m2,m3,a;
        A(int a1,int a2,int a3)
        {
            m1=a1;
            m2=a2;
            m3=a3;
        }
        
        void display()
        {
            System.out.println("student 1 marks:");
            System.out.println("mark 1="+m1+"\t"+"mark 2="+m2+"\t"+"marks 3="+m3);
           
        }
        void getpercentage()
        {
            
            a=(m1+m2+m3)/3;
            System.out.println("percentage of student 1 is:"+a);
        }
        
       
        
    }
    class B extends marks
    {
        int ma1,ma2,ma3,ma4,b;
        
        B(int b1,int b2,int b3,int b4)
        {
            ma1=b1;
            ma2=b2;
            ma3=b3;
            ma4=b4;
        }
        
        void display()
        {
         
            System.out.println("student 2 marks:");
            
            System.out.println("mark 1="+ma1+"\t"+"mark 2="+ma2+"\t"+"marks 3="+ma3+"\t"+"marks 4="+ma4);
            
        }
        void getpercentage()
        {
           
            b=(ma1+ma2+ma3+ma4)/4;
            System.out.println("percentage of student 2 is:"+b);
        }
        
    }
public class Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner o=new Scanner(System.in);
        int a[],b[];
        a=new int[3];
        b=new int[4];
        System.out.println("enter marks for student 1:");
        for(int i=0;i<3;i++)
        {
            a[i]=o.nextInt();
        }
       System.out.println("enter marks for student 2:");
        for(int i=0;i<4;i++)
        {
            b[i]=o.nextInt();
        }
       
        A obj1=new A(a[0],a[1],a[2]);
        
        B obj=new B(b[0],b[1],b[2],b[3]);
        
        obj1.display();
        obj1.getpercentage();
        obj.display();
        obj.getpercentage();
    }
    
}
