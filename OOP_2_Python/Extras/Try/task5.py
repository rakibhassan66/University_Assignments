# Step 1: Lambda function to calculate the cube
cube = lambda x: x**3

# Step 2: Use map to apply the cube function to a list
numbers = [1, 2, 3, 4]
cubes = list(map(cube, numbers))
print(cubes)  # Output: [1, 8, 27, 64]

# Step 3: Use filter to filter out odd numbers
evens = list(filter(lambda x: x % 2 == 0, numbers))
print(evens)  # Output: [2, 4]

# Step 4: Use reduce to find the product of all numbers
from functools import reduce
product = reduce(lambda x, y: x * y, numbers)
print(product)  # Output: 24
