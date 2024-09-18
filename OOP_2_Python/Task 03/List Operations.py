def manage_customers():
    # Input customer names from user, split by commas, and strip any extra spaces
    customers = [name.strip() for name in input("Enter customer names separated by commas: ").split(",")]

    # a. Access the third customer
    if len(customers) >= 3:
        print("Third customer:", customers[2])
    else:
        print("Not enough customers.")

    # b. Change the name of the second customer
    if len(customers) >= 2:
        new_name = input("Enter new name for the second customer: ")
        customers[1] = new_name
    else:
        print("Not enough customers to update the second name.")

    # c. Add a new customer
    new_customer = input("Enter a new customer name to add: ")
    customers.append(new_customer)

    # d. Remove a customer
    remove_customer = input("Enter the name of the customer you want to remove: ")
    if remove_customer in customers:
        customers.remove(remove_customer)
    else:
        print(f"{remove_customer} not found in the customer list.")

    # e. Sort and print the final list
    customers.sort()
    print("Final customer list:", customers)

manage_customers()
