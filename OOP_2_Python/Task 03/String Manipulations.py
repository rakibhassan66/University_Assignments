def string_operations():
    # Get the sentence from the user
    sentence = input("Enter a sentence: ")

    # a. Extract substring using negative slicing
    start = int(input("Enter the start index for negative slicing: "))
    end = int(input("Enter the end index for negative slicing: "))
    substring = sentence[start:end]
    print("Extracted substring:", substring)

    # b. Replace a word in the sentence
    old_word = input("Enter the word you want to replace: ")
    new_word = input("Enter the new word: ")
    modified_sentence = sentence.replace(old_word, new_word)
    print("Modified sentence:", modified_sentence)

    # c. Insert new phrase after a specific word
    insert_phrase = input("Enter the phrase you want to insert: ")
    words = modified_sentence.split(" ")
    insert_position = words.index(new_word) + 1
    words.insert(insert_position, insert_phrase)
    final_sentence = " ".join(words)

    # d. Capitalize the first letter of each word
    final_sentence = final_sentence.title()
    print("Final Sentence:", final_sentence)

string_operations()
