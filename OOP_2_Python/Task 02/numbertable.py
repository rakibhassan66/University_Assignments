# Ask the user which number they want the multiplication table for
num = int(input("Enter the number for which you want the multiplication table: "))

# Generate the multiplication table
for i in range(1, 11):
    if i == 6:
        continue  # Skip the multiplication at position 6
    elif i == 8:
        break  # Stop after reaching 8
    print(num, 'x', i, '=', num * i)
