'''
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. 
Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

Example 1:
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
'''

class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        
        max_wealth = 0
        
        for customer_row in accounts:
            cust_wealth = 0
            for cust_account_value in customer_row:
                cust_wealth += cust_account_value
            
            if cust_wealth > max_wealth:
                max_wealth = cust_wealth
            
        return max_wealth
