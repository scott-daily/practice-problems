'''
The marketing team is spending way too much time typing in hashtags.
Let's help them with our own Hashtag Generator!

Here's the deal:

It must start with a hashtag (#).
All words must have their first letter capitalized.
If the final result is longer than 140 chars it must return false.
If the input or the result is an empty string it must return false.
Examples
" Hello there thanks for trying my Kata"  =>  "#HelloThereThanksForTryingMyKata"
"    Hello     World   "                  =>  "#HelloWorld"
""                                        =>  false
'''

def generate_hashtag(s):
    
    if len(s) == 0:
        return False

    words = s.split(" ")
    hashtagged = "#"
    
    for word in words:
        hashtagged += word.capitalize()
    
    if len(hashtagged) > 140:
        return False

    return hashtagged

print(generate_hashtag("cat in the hat"))