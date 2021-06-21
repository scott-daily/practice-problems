package main

import (
	"fmt"
)

/*
Given an integer array nums, return true if any value appears at least twice in the array,
return false if every element is distinct.
*/
func containsDuplicate(nums []int) bool {
	dupeMap := make(map[int]int)

	for _, num := range nums {
		dupeMap[num] += 1

		if dupeMap[num] > 1 {
			return true
		}
	}
	return false
}

func main() {

	testSliceTrue := []int{1, 3, 5, 7, 5, 8}
	testSliceFalse := []int{1, 2, 3, 4}

	fmt.Printf("%t", containsDuplicate(testSliceTrue))
	fmt.Printf("%t", containsDuplicate(testSliceFalse))
}
