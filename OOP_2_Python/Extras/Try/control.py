
user_input = input("Enter any value: ")
try:
    int_value = int(user_input)
    print(f"The input '{user_input}' is an integer.")
except ValueError:
    try:
        float_value = float(user_input)
        print(f"The input '{user_input}' is a float.")
    except ValueError:
        if user_input.lower() in ['true', 'false']:
            print(f"The input '{user_input}' is a boolean.")
        else:
            print(f"The input '{user_input}' is a string.")