'''
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0
'''

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        max_profit = 0
        
        lowest_price = prices[0]
    
        prices.pop(0)
        
        for stock_price in prices:
            if stock_price - lowest_price > max_profit:
                max_profit = stock_price - lowest_price
            elif stock_price < lowest_price:
                lowest_price = stock_price
                
        return max_profit
