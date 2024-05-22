/*Maximum Product Subarray
 Given an integer array nums, find a subarray that has the largest
 product, and return the product.
 Input: nums = [2,3,-2,4]
 Output: 6
 Explanation: [2,3] has the largest product 6.
 Input: nums = [-2,0,-1]
 Output: 0
 Explanation: The result cannot be 2, because [-2,-1] is not a
 subarray.*/

import java.util.Scanner;
class MaximumProductSubarray{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)a[i]=sc.nextInt();
System.out.println(findMax(a));
}
}