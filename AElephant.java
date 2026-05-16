import java.util.Scanner;
public class AElephant{
 public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int x = sc.nextInt(), count = 0;
    while(x != 0){
        if(x >= 5){
            count++;
            x-=5;
        }
        else if(x >= 4){
            count++;
            x-=4;
        }
        else if(x >= 3){
            count++;
            x-=3;
        }
        else if(x >= 2){
            count++;
            x-=2;
        }
        else if(x >= 1){
            count++;
            x-=1;
        }
    }
    System.out.println(count);
 }
}