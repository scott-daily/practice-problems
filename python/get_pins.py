'''
We watched someone put in the combination on the below keypad, but couldn't make out if the number was the number we thought we saw,
or was any adjacent number (excluding diagonals). For example, given PIN = [1357], the '1' could have been 1, 2, or 4.
Return all possible combinations.

Example PIN = 12
Result list should = [12, 11, 15, 13, 22, 21, 25, 23, 42, 41, 45, 43]

┌───┬───┬───┐
│ 1 │ 2 │ 3 │
├───┼───┼───┤
│ 4 │ 5 │ 6 │
├───┼───┼───┤
│ 7 │ 8 │ 9 │
└───┼───┼───┘
    │ 0 │
    └───┘
'''
from itertools import permutations
from itertools import product
import itertools

def get_pins(observed):

    number_dict = {
        '0': ['0','8'],
        '1': ['1','2','4'],
        '2': ['2','1','5','3'],
        '3': ['3','2','6'],
        '4': ['4','1','5','7'],
        '5': ['5','2','6','8','4'],
        '6': ['6','3','5','9'],
        '7': ['7','4','8'],
        '8': ['8','5','7','9','0'],
        '9': ['9','8','6']
    }

    combo_list = []

    for digit in observed: 
        combo_list.append(number_dict[digit])

    result_list = []

    for element in itertools.product(*combo_list):
        result_list.append(''.join(element))

    print(*result_list)
    return result_list

observed = '12'
get_pins(observed)