import java.util.*;
class triangle{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the values of a,b,c:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b&&b==c){
            System.out.println("its a equilateral triangle");
        }
        else if(a==b||b==c||c==a){
            System.out.println("its a isosceles triangle");
        }
        else{
            System.out.println("its a scalene triangle");
        }
        sc.close();
    }
}