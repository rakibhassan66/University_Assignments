def age(n):
    return 100 - n

try:
    n = int(input("Insert your age : "))
    y = age(n)
    print(f"Your age is {n}. You will turn 100 in {y} years.")
except ValueError:
    print("Wrong input")