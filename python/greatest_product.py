'''
Complete the greatestProduct method so that it'll find the greatest product of five consecutive digits in the given string of digits.
'''

def greatest_product(n):

    num_list = list(map(int, n))
    largest_result = 0
    current_result = 1
    i = 0
    while i < len(num_list) - 4:
        for num in num_list[i:i+5]: 
            current_result = current_result * num

        if current_result > largest_result:
            largest_result = current_result
            current_result = 1
        else:
            current_result = 1

        i = i + 1

    return largest_result


