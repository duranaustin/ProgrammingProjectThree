package com.project;
/**
 * @Authors: Jorge Jimenez, Pauline Makoma, Christian Makoma, Austin Duran
 * @Project Programming Project3
 * @Course CSIS-2430
 */
import java.util.ArrayList;
import java.util.List;

public class ArrayGenerator {

    int n; //n field for initBaseArray() usage
    int[] nArray; //nArray is the base array to be used for our permutations
    ArrayList<List<Integer>> unsortedLists; //store permutation unsortedLists here
    ArrayList<List<Integer>> baseLists; //make a copy of permutations 'unsortedLists' and store them here



    //todo an arraylist of arraylists based off of n?

    /**
     * ArrayGenerator Constructor expects n
     * @param n denotes the array length and will help with permutations
     */
    ArrayGenerator(int n){
        this.n = n; //initializing this.n based off provided argument n
        nArray = new int[this.n]; //initializing nArray for initBaseArray
        unsortedLists = new ArrayList(); //initialize a List of lists
        baseLists = new ArrayList(); //make a copy of permutations 'unsortedLists' and store them here
        if(this.n <= 0){ //if n is less than or equal to 0, throw exception
            throw new IllegalArgumentException("n must be greater than 0");
        }
        initBaseArray(); //initialize the base Array base off of n
        permute(); //initialize permutations of array
    }

    /**
     *initBaseArray initializes the base Array
     * @return
     */
    public void initBaseArray(){
        for(int i = 0; i < n; i++){
            nArray[i] = i; // init the base array in preparation for permute
        }
    }

    /**
     * permute creates an List of lists of type Integer
     * @return
     */
    public void permute() {
        int[] nums = nArray; //initialize nums with previously initialized nArray from initBaseArray()
        ArrayList<List<Integer>> temp = new ArrayList(); //temp List of
        ArrayList<List<Integer>> tempTwo = new ArrayList(); //temp List of lists
        List<Integer> result = new ArrayList<>(); //initialize a List to be used with our List of lists for depthFirstSearch
        if (nums == null || nums.length == 0) { //return the empty List
            unsortedLists = temp;
        }
        unsortedLists = depthFirstSearch(nums, temp, result); //method call to depthFirstSearch with nArray, List of lists, and List
        baseLists =  depthFirstSearch(nums, tempTwo, result);
    }
    
    /**
     * depthFirstSearch is a recursive method that checks for the existence of an element and removes the last element if the element we're checking does not exist.
     * @param nums
     * @param results
     * @param result
     * @return
     */
    
    public ArrayList<List<Integer>> depthFirstSearch(int[] nums, ArrayList<List<Integer>> results, List<Integer> result) {
        if (nums.length == result.size()) { //base case of our recursive depthFirstSearch method
            List<Integer> temp = new ArrayList<>(result); //create a temp List
            results.add(temp); //add our temp List to our List of lists
        }
        for (int i=0; i<nums.length; i++) { //iterate through the length of nArray
            if (!result.contains(nums[i])) { //if our List does not contain nArray[i]...
                result.add(nums[i]); // add nArray[i] to our List
                depthFirstSearch(nums, results, result); //recursive case
                result.remove(result.size() - 1); //remove the last element from our List
            }
        }
        return results;
    }
}
