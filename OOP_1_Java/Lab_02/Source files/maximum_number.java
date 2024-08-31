import java.util.Scanner;

public class maximum_number {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        System.out.println("Insert your first number :");
        int a=dd.nextInt();
        System.out.println("Insert your Second number :");
        int b=dd.nextInt();
        System.out.println("Insert your third number :");
        int c=dd.nextInt();
        if(a>b && a>c){
            System.out.println("Maximum  number is "+a);
        }
        else if(b>a && b>c){
            System.out.println("Maximum  number is "+b);
        }
        else if(c>a && c>b){
            System.out.println("Maximum  number is "+c);
        }
        else{
            System.out.println("Wrong input ");
        };
    }
}
