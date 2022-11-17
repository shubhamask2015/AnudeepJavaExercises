import java.util.Scanner;

class Q1{
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        int n1 = scn.nextInt();
        System.out.print("Enter 2nd Number:");
        int n2 = scn.nextInt();
        int sum = n1+n2;
        System.out.println("The Sum Is: "+sum);
    }
}