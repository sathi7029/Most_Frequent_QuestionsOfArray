/*Product of Array Except Self
 Given an integer array nums, return an array answer such that
 answer[i] is equal to the product of all the elements of nums
 except nums[I].
 The product of any prefix or suffix of nums is guaranteed to fit in a
 32-bit integer.
 You must write an algorithm that runs in O(n) time and without
 using the division operation.
 Input: nums = [1,2,3,4]
 Output: [24,12,8,6]*/

import java.util.Scanner;
class ProductOfArrayExceptSelf{
static int[] productExceptItself(int nums[]){
int n=nums.length;
int res[]=new int[n];
int left[]=new int[n];
int right[]=new int[n];
left[0]=1;
for(int i=1;i<n;i++)left[i]=left[i-1]*nums[i-1];

right[n-1]=1;
for(int i=n-2;i>=0;i--)right[i]=right[i+1]*nums[i+1];

for(int i=0;i<n;i++)res[i]=left[i]*right[i];

return res;

}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];

for(int i=0;i<n;i++)
a[i]=sc.nextInt();

a=productExceptItself(a);
for(int e:a){
System.out.print(e+" ");
}
}
}