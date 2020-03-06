words = ['aabb', 'abcd', 'bbaa', 'dada']
word = "abba"

def anagrams(word, words):
    result_list = []

    for item in words:
        if (sorted(word) == sorted(item)):
            result_list.append(item)

    return result_list
