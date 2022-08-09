import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        int a,b;
        System.out.print("Enter Given Two Numbers: ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        for(int i=0;i<10;i++)
        {
            int x=a;
            a=b;
            b=x+a;
            System.out.print(b+" ");
        }
    }
}