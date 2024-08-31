def sq(num):
    return [x**2 for x in num]
def ev(num):
    return [x for x in num if x%2==0]
def esq(num):
    return [x**2 for x in num if x%2==0]

while True:
    print("\nChoose Options...")
    print("1. Square of numbers")
    print("2. even numbers")
    print("3. Square of even numbers")
    print("4. Exit")
    
    ch = input("Enter you choice: ")
    
    if ch in ["1", "2", "3"]:
        n = input("Enter a list of numbers separated by spaces: ")
        num = list(map(int, n.split()))
        
        if ch == "1":
            sq_result = sq(num)
            print(f"The square of numbers are {sq_result}")
        elif ch == "2":
            ev_result = ev(num)
            print(f"The numbers are {ev_result}")
        elif ch == "3":
            esq_result = esq(num)
            print(f"The square of even numbers are {esq_result}")
    elif ch == "4":
        print("TAKE CARE")
        break
    else:
        print("Invalid choice")