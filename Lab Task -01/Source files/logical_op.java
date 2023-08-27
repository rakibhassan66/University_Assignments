import java.util.Scanner;

public class logical_op {
    public static void main(String[] args) {
        int a,b,c;
        Scanner cod = new Scanner(System.in);
        int as = cod.nextInt();
        if(as==1||as==2||as==3){
            System.out.println("Yes you made it");
        }
        else if(as>=4 && as<=10){
            System.out.println("You got another level up");
        }
        else{
            System.out.println("Wrong input ,\nPlease try in 1- 10 int number ");
        }
    }
}
