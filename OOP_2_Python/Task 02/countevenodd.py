# Take a list of integers from the user
numbers = list(map(int, input("Enter integers separated by spaces: ").split()))

even_count = 0
odd_count = 0

# Count the even and odd numbers
for num in numbers:
    if num % 2 == 0:
        even_count += 1
    else:
        odd_count += 1

print("Number of even numbers:", even_count)
print("Number of odd numbers:", odd_count)
