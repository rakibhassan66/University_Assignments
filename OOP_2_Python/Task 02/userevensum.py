# Take a list of integers from the user
numbers = list(map(int, input("Enter integers separated by spaces: ").split()))

# Find the sum of even numbers
even_sum = sum(num for num in numbers if num % 2 == 0)

print("The sum of the even numbers is:", even_sum)
