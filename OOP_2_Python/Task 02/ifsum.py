def add_numbers(a, b):
    if isinstance(a, (int, float)) and isinstance(b, (int, float)):
        return a + b
    else:
        return "Both inputs must be numbers"

# Example usage
result = add_numbers(3, 5)
print(result)
