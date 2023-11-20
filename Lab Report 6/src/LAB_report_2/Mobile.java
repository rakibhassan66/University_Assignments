package LAB_report_2;

import java.util.ArrayList;

class Mobile {

    private String name;
    private int code;
    private double price;
    private String brand;

    public Mobile(String name, int code, double price, String brand) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.brand = brand;
    }

    public void displayRecord() {
        System.out.println("Mobile Record:");
        System.out.println("Name: " + name);
        System.out.println("Code: " + code);
        System.out.println("Price: $" + price);
        System.out.println("Brand: " + brand);
    }

    public boolean searchRecord(String searchKey) {
        return name.equalsIgnoreCase(searchKey) || String.valueOf(code).equals(searchKey) || brand.equalsIgnoreCase(searchKey);
    }


    public void deleteRecord(ArrayList<Mobile> mobileList, int code) {
        for (int i = 0; i < mobileList.size(); i++) {
            if (mobileList.get(i).code == code) {
                mobileList.remove(i);
                System.out.println("Mobile record with code " + code + " deleted successfully.");
                return;
            }
        }
        System.out.println("Mobile record with code " + code + " not found.");
    }
}