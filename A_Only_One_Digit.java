import java.util.Scanner;
public class A_Only_One_Digit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt(),min=Integer.MAX_VALUE;
            while(n!=0){
                int digit=n%10;
                if(digit<min) min=digit;
                n/=10;
            }
            System.out.println(min);
        }
    }
}