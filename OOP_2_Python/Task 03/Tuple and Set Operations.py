def manage_books_and_tags():
    # Initial tuple and set
    books = (
        ("To Kill a Mockingbird", "Harper Lee", 1960),
        ("1984", "George Orwell", 1949),
        ("The Great Gatsby", "F. Scott Fitzgerald", 1925)
    )
    tags = {"classic", "dystopian", "novel", "literature"}

    # a. Access the second book's author
    print("Author of second book:", books[1][1])

    # b. Add a new book (tuple is immutable, so we recreate it)
    new_book = input("Enter a new book title, author, and year separated by commas: ").split(", ")
    books = books + ((new_book[0], new_book[1], int(new_book[2])),)
    print("Updated books tuple:", books)

    # c. Unpack the third book
    title, author, year = books[2]
    print(f"Third book - Title: {title}, Author: {author}, Year: {year}")

    # d. Print all book titles
    for book in books:
        print("Book Title:", book[0])

    # e. Add a new tag
    new_tag = input("Enter a new tag: ")
    tags.add(new_tag)
    print("Updated tags set:", tags)

    # f. Remove a tag
    remove_tag = input("Enter a tag to remove: ")
    tags.discard(remove_tag)
    print("Updated tags set:", tags)

manage_books_and_tags()
