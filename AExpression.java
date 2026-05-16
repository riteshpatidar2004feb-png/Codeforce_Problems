import java.util.Scanner ;

public class AExpression{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a !=1 && b!=1 && c !=1) System.out.println(a*b*c);
        else if(a==1 && b==1 && c==1) System.out.println(3);
        else if(a==1 && b==1) System.out.println(2*c);
        else if(c==1 && b==1) System.out.println(2*a);
        else if(a==1&&c==1) System.out.println(a+b+c);
        else if(a==1) System.out.println((a+b)*c);
        else if(b==1){
            if(a>c) System.out.println(a*(b+c));
            else System.out.println((a+b)*c);
        }
        else if(c==1) System.out.println(a*(b+c));
    }
}