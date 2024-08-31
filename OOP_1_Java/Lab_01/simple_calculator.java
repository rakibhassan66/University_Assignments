import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args) {
        double num1,num2,result;
        System.out.println("Welcome User,\nPlease chose your options.\nPress 1 to Calculate Summation\nPress 2 to Calculate Substraction\nPress 3 to Calculate Multiplication\nPress 4 to Calculate Divition\n");
        try (Scanner del = new Scanner(System.in)){
            System.out.println("Select   : ");
            int sel = del.nextInt();
            if (sel==1){
            System.out.println("Please inter your digit to 1 st number");
            num1 = del.nextDouble();

            System.out.println("Please inter your digit to 2 nd number");
            num2 = del.nextInt();

            result = num1 + num2;
            System.out.println("Total result is  "+result);
            }
            else if(sel==2){
                System.out.println("Please inter your digit to 1 st number");
            num1 = del.nextDouble();

            System.out.println("Please inter your digit to 2 nd number");
            num2 = del.nextInt();

            result = num1 - num2;
            System.out.println("Total result is  "+result);
            }
            else if(sel==3){
                System.out.println("Please inter your digit to 1 st number");
            num1 = del.nextDouble();

            System.out.println("Please inter your digit to 2 nd number");
            num2 = del.nextInt();

            result = num1 * num2;
            System.out.println("Total result is  "+result);
            }
            else if(sel==4){
                System.out.println("Please inter your digit to 1 st number");
            num1 = del.nextDouble();

            System.out.println("Please inter your digit to 2 nd number");
            num2 = del.nextInt();

            result = num1 / num2;
            System.out.println("Total result is  "+result);
            }
            else{
                System.out.println("Yoy have insetered wrong imput ");
            }
            
        }
    }
}
