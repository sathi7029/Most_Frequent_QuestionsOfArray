/*Given an array of integer nums and an integer target, return
 indices of the two numbers such that they add up to the target.
 You may assume that each input would have exactly one solution,
 and you may not use the same element twice.
 You can return the answer in any order.
 Input: nums = [2,7,11,15], target = 9
 Output: [0,1]
 Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/


//solution this print the indices which is equal to the target sum
import java.util.Scanner;
import java.util.HashMap;
class TwoSum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];

for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}

int t=sc.nextInt();
HashMap<Integer,Integer>hm=new HashMap<>();
for(int i=0;i<n;i++){
int temp=t-a[i];
if(hm.containsKey(temp))System.out.print("("+hm.get(temp)+","+i+")");
hm.put(a[i],i);
}
}
}


//solution this print the element which is equal to the target sum
/*import java.util.Scanner;
import java.util.HashSet;
class TwoSum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];

for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}

int t=sc.nextInt();

HashSet<Integer>hs=new HashSet<>();
for(int i=0;i<n;i++){
int temp=t-a[i];
if(hs.contains(temp))System.out.print("("+temp+","+a[i]+")");
hs.add(a[i]);
}
}
}*/