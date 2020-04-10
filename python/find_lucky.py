'''
Given an array of integers arr, a lucky integer is an integer which has a frequency equal to its value.
Return a lucky integer from the array. If there are multiple lucky integers then return the largest one. 
If there are no lucky integers then return -1.
'''
import collections

def findLucky(self, arr: List[int]) -> int:
        
        arr.sort(reverse=True)
        counter = collections.Counter(arr)
        
        for a,b in counter.items():
            if a == b:
                return a
            
        return -1




