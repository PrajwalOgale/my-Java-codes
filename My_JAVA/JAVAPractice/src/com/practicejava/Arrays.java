package com.practicejava;
import java.util.*;

public class Arrays {

    public static boolean findPythagoreanTriplet(int[] a){   // Worst case time complexity : O(n*n)
        
        for (int i=0; i<a.length ; i++) {        // O(n)
            a[i]*=a[i];
        }

        java.util.Arrays.sort(a);               // O(nlogn)
        
        for(int i=0; i< a.length; i++){         // O(n)
            int l=0;
            int u=a.length-1;
            while(l<u){                         // O(n)
                if(a[i]==(a[u]+a[l])) return true;
                
                if(a[u]+a[l] < a[i])  l++; 
                else u--;
            }
        }
        return false;
     }

     public static int[] segregateZeroAndOne(int[] a){
        int l=0;
        int r=a.length-1;

        while(l<r){
            while(a[l]==0 && l<r){
                l++;
            }
            
            while(a[r]==1 && l<r){
                r--;
            }

            if(l<r){
                a[l]=0;
                a[r]=1;
                l++;
                r--;
            }
        }

        return a;
     }

     public static void sumOfPairEqualtoX(int[] a){

     }

     public static void main(String[] args) {
        
        int[] a ={3,1,4,5,6};
        int[] b = {0,1,1,0,1,0,0,1};
        int[] z = {1,45,4,6,10,-8};
        // System.out.println(findPythagoreanTriplet(a));
        
        int[] result=segregateZeroAndOne(b);
        for(int i=0; i< result.length;i++){
            System.out.println(result[i]);
        }
     }
}
