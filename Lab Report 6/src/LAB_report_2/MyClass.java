package LAB_report_2;

import java.util.ArrayList;
import java.util.Scanner;

class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mobile> mobileList = new ArrayList<>();

        mobileList.add(new Mobile("iPhone 13", 1, 999.99, "Apple"));
        mobileList.add(new Mobile("Galaxy S21", 2, 899.99, "Samsung"));
        mobileList.add(new Mobile("Pixel 6", 3, 799.99, "Google"));

        System.out.println("All Mobiles:");
        for (Mobile mobile : mobileList) {
            mobile.displayRecord();
            System.out.println();
        }

        System.out.print("Enter the name/code/brand to search: ");
        String searchKey = scanner.nextLine();
        System.out.println("\nSearch Results:");
        for (Mobile mobile : mobileList) {
            if (mobile.searchRecord(searchKey)) {
                mobile.displayRecord();
                System.out.println();
            }
        }

        System.out.print("Enter the code of the mobile to delete: ");
        int deleteCode = scanner.nextInt();
        Mobile mobile = new Mobile("", deleteCode, 0.0, ""); // Create a temporary mobile object with the code
        mobile.deleteRecord(mobileList, deleteCode);

    }
}