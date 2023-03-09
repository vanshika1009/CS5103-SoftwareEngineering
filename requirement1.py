def word_count(str):
    # create an empty dictionary
    counts = dict()
    # To split the lines into words
    words = str.split()
    # To iterate over each word in string
    for word in words:
        # To check if word is already present in the dictionary
        if word in counts:
            # To increment count of word by 1
            counts[word] += 1
        else:
            # Add the word to dictionary
            counts[word] = 1
    #returning the count now
    return counts

#here running the first requirement
print("You are running the first requirement of word count now")
val = input("Enter your Words: ")
print(word_count(val))
print("\n")