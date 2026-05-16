package Codeforces_Problems;
import java.util.*;
public class B_The_67_th_6_7_Integer_Problem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int[] n=new int[7];
            int sum=0;
            for(int j=0;j<7;j++){
                 n[j]=sc.nextInt();
            }
            Arrays.sort(n);
            for(int j=0;j<6;j++){
              sum=sum+n[j];
            }
            System.out.println(-sum+n[6]);
        }
    }
}