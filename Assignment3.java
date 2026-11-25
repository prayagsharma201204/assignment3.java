import java.util.Scanner;
public class Assignment3{
    void withString(int n){
        String s = "";
        int i = n ;
        while(i >= 1){
            s = (i % 2 == 0 )?s + String.valueOf(i):String.valueOf(i) + s;
            i--;
        }
        System.out.println("with String -- " + Integer.valueOf(s));
    }
    void withInteger(int n){
        int i = n , num = 0 , p = 1;
        while(i >= 1){
            if(i % 2 == 0){
                num = (num * 10) + i;
            }else{
                num = (p * i) + num;
            }
            p = p * 10;
            i--;
        }
        System.out.println("with Integer -- " + num);
    }
    public static void main(String args[]){
        Assignment3 a3 = new Assignment3();
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a Number -- ");
        int n = x.nextInt();
        a3.withInteger(n);
        a3.withString(n);
    }
}