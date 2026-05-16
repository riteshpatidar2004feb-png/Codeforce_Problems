
    import java.util.Scanner ;
    public class ACalculatingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long nO = 0, nE = 0;
        if(n%2 != 0){
            long a = n/2;
            nO = n-a;
            nE = n-nO;
        }
        else {
            nO = n/2; nE = n/2;
        }
        System.out.println(nE*(nE+1) - nO*nO);
    }
}

