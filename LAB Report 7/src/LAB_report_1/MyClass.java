package LAB_report_1;

import java.util.ArrayList;

import java.util.Scanner;

class MyClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PhoneBook> friendList = new ArrayList<>();

        int choice;
        do {
            System.out.println("\nPhone Book Options:");
            System.out.println("1. Add a Friend");
            System.out.println("2. Display All Friends");
            System.out.println("3. Search for a Friend");
            System.out.println("4. Edit Friend Information");
            System.out.println("5. Delete a Friend");
            System.out.println("0. Exit");

            System.out.print("Enter your choice (0-5): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addFriend(scanner, friendList);
                    break;
                case 2:
                    displayAllFriends(friendList);
                    break;
                case 3:
                    searchFriend(scanner, friendList);
                    break;
                case 4:
                    editFriend(scanner, friendList);
                    break;
                case 5:
                    deleteFriend(scanner, friendList);
                    break;
                case 0:
                    System.out.println("Exiting Phone Book. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 5.");
            }

        } while (choice != 0);

        // Close the scanner
        scanner.close();
    }

    private static void addFriend(Scanner scanner, ArrayList<PhoneBook> friendList) {
        System.out.print("Enter friend's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter friend's phone number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter friend's email address: ");
        String email = scanner.nextLine();

        friendList.add(new PhoneBook(name, phone, email));
        System.out.println("Friend added successfully.");
    }

    private static void displayAllFriends(ArrayList<PhoneBook> friendList) {
        System.out.println("\nAll Friends:");
        for (PhoneBook friend : friendList) {
            System.out.println("Name: " + friend.getName() + ", Phone: " + friend.getPhone() + ", Email: " + friend.getEmail());
        }
    }

    private static void searchFriend(Scanner scanner, ArrayList<PhoneBook> friendList) {
        System.out.print("Enter the name/phone/email to search: ");
        String searchKey = scanner.nextLine().toLowerCase();

        System.out.println("\nSearch Results:");
        for (PhoneBook friend : friendList) {
            if (friend.getName().toLowerCase().contains(searchKey) || friend.getPhone().contains(searchKey) || friend.getEmail().toLowerCase().contains(searchKey)) {
                System.out.println("Name: " + friend.getName() + ", Phone: " + friend.getPhone() + ", Email: " + friend.getEmail());
            }
        }
    }

    private static void editFriend(Scanner scanner, ArrayList<PhoneBook> friendList) {
        System.out.print("Enter the name of the friend to edit: ");
        String editName = scanner.nextLine();

        for (PhoneBook friend : friendList) {
            if (friend.getName().equalsIgnoreCase(editName)) {
                System.out.print("Enter the new phone number: ");
                String newPhone = scanner.nextLine();
                friend.setPhone(newPhone);

                System.out.print("Enter the new email address: ");
                String newEmail = scanner.nextLine();
                friend.setEmail(newEmail);

                System.out.println("Friend's information updated successfully.");

                // Display the updated information
                System.out.println("Updated Information:");
                System.out.println("Name: " + friend.getName() + ", Phone: " + friend.getPhone() + ", Email: " + friend.getEmail());
                return;
            }
        }

        System.out.println("Friend not found.");
    }

    private static void deleteFriend(Scanner scanner, ArrayList<PhoneBook> friendList) {
        System.out.print("Enter the name of the friend to delete: ");
        String deleteName = scanner.nextLine();

        for (int i = 0; i < friendList.size(); i++) {
            if (friendList.get(i).getName().equalsIgnoreCase(deleteName)) {
                friendList.remove(i);
                System.out.println("Friend deleted successfully.");
                return;
            }
        }

        System.out.println("Friend not found.");
    }
}