'''How many numbers between 1 and 100 (inclusive) are divisible by num1 or num2?'''

x = 1

def permutations(num1, num2):
    count = 0
    for x in range(1, 101):
        if x%num1 == 0:
            count = count + 1
        if x%num2 == 0:
            count = count + 1
        if x%num1 == 0 and x%num2 == 0:
            count = count - 1

    return count

print(permutations(4,9))