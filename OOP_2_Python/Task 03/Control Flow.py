def analyze_grades():
    # Ask the user for the format of grades
    format_choice = input("Enter 'cgpa' for CGPA or 'percentage' for percentage: ").strip().lower()
    
    if format_choice == 'cgpa':
        # Input CGPA values as floating-point numbers
        grades = list(map(float, input("Enter student CGPA separated by spaces: ").split()))
        # Convert CGPA to percentage for a 5.0 scale
        grades = [cgpa * 20 for cgpa in grades]
    elif format_choice == 'percentage':
        # Input percentage values as integers
        grades = list(map(int, input("Enter student grades (percentages) separated by spaces: ").split()))
    else:
        print("Invalid format choice.")
        return

    # a. Categorize grades
    for score in grades:
        if score > 80:
            grade = 'A'
        elif 60 < score <= 80:
            grade = 'B'
        elif 40 < score <= 60:
            grade = 'C'
        else:
            grade = 'F'
        print(f"Score: {score} - Grade: {grade}")

    # b. Boost grades by 5%
    boosted_grades = list(map(lambda x: x * 1.05, grades))
    print("Boosted Grades:", boosted_grades)

    # c. Use lambda to find grades above 90
    boosted_above_90 = list(filter(lambda x: x > 90, boosted_grades))
    print("Boosted Grades Above 90:", boosted_above_90)

analyze_grades()
