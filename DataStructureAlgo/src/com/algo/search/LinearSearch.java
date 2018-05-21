package com.algo.search;

public class LinearSearch {
    
    public static int linearSearch(int arr[], int searchElement){
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==searchElement){
              return i;  
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {10, 20, 80, 30, 60, 50, 100, 110, 130, 170};
        int loc=linearSearch(arr, 30);
        System.out.println(loc);
        int loc1=linearSearch(arr, 9);
        System.out.println(loc1);
    }
}
