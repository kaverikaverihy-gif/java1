import java.util.*;
class minm{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int min=(a<b && a<c)?a:(b<c?b:c);
        System.out.println("Minimum:"+min);

    }
}