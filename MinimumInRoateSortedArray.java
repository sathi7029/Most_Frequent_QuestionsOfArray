/*Find the Minimum in Rotated
 Sorted Array
 Given the sorted rotated array nums of unique elements, return 
the minimum element of this array.
 You must write an algorithm that runs in O(log n) time.
 Input: nums = [3,4,5,1,2]
 Output: 1
 Explanation: The original array was [1,2,3,4,5] rotated 3 times.*/
import java.util.Scanner;
class MinimumInRoateSortedArray{
static int findMin(int[] nums){
int n=nums.length;
int l=0;
int h=n-1;
while(l<h){
int m=(l+h)/2;
if(nums[m]>nums[h])l=m+1;
else
h=m;
}
return nums[l];
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)a[i]=sc.nextInt();
System.out.println(findMin(a));
}
}