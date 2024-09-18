def manage_courses():
    courses = {}

    while True:
        print("\n--- Main Menu ---")
        print("1. Add a course")
        print("2. Update a course")
        print("3. See course details")
        print("4. Exit")
        
        try:
            option = int(input("Choose an option (1-4): "))
        except ValueError:
            print("Invalid input! Please enter a number between 1 and 4.")
            continue

        if option == 1:
            # Option 1: Add a course
            try:
                n = int(input("How many courses do you want to add? "))
            except ValueError:
                print("Invalid input! Please enter a valid number.")
                continue

            for _ in range(n):
                course_code = input("Enter course code: ").strip()
                if course_code in courses:
                    print(f"Course with code {course_code} already exists! Skipping...")
                    continue
                course_name = input("Enter course name: ").strip()
                try:
                    credits = int(input("Enter number of credits: "))
                except ValueError:
                    print("Invalid input! Please enter a valid number of credits.")
                    continue
                instructor = input("Enter instructor name: ").strip()
                courses[course_code] = {
                    "Course Name": course_name,
                    "Credits": credits,
                    "Instructor": instructor
                }
            print("Courses added successfully!")
        
        elif option == 2:
            # Option 2: Update a course
            course_code = input("Enter course code to update: ").strip()
            if course_code not in courses:
                print(f"No course found with code {course_code}.")
                continue
            
            print("\nWhat do you want to update?")
            print("1. Update course name")
            print("2. Update number of credits")
            print("3. Update instructor")
            try:
                update_option = int(input("Choose an option (1-3): "))
            except ValueError:
                print("Invalid input! Please enter a number between 1 and 3.")
                continue
            
            if update_option == 1:
                new_name = input("Enter new course name: ").strip()
                courses[course_code]["Course Name"] = new_name
                print(f"Course name updated for {course_code}.")
            elif update_option == 2:
                try:
                    new_credits = int(input("Enter new number of credits: "))
                    courses[course_code]["Credits"] = new_credits
                    print(f"Credits updated for {course_code}.")
                except ValueError:
                    print("Invalid input! Please enter a valid number of credits.")
                    continue
            elif update_option == 3:
                new_instructor = input("Enter new instructor name: ").strip()
                courses[course_code]["Instructor"] = new_instructor
                print(f"Instructor updated for {course_code}.")
            else:
                print("Invalid option! Please select a valid update option.")

        elif option == 3:
            # Option 3: See course details
            if not courses:
                print("No courses available to display.")
            else:
                for code, details in courses.items():
                    print(f"{code}: {details}")

        elif option == 4:
            # Option 4: Exit
            print("Nice to business with you, Goodbye!")
            break
        
        else:
            print("Invalid option! Please choose a valid option (1-4).")


# Call the function to run the course management system
manage_courses()
