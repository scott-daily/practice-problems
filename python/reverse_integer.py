'''
Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21
'''
class Solution:
    def reverse(self, x: int) -> int:
        num_string = str(abs(x))

        if x < 0:
            result = -1 * int(num_string[::-1])
        else:
            result = int(num_string[::-1])

        if result not in range((-1 << 31), (1 << 31) -1):
            return 0

        return result


