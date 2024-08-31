y = input("Enter a number: ")

try:
    
    number = float(y)
    
    if number.is_integer():
        number = int(number)
        
    if number % 2 == 0:
        print(f"The input {number} is evenly divisible.")
    else:
        print(f"The input {number} is odd.")
except ValueError:
    print("The input is not a valid number (integer or float).")
