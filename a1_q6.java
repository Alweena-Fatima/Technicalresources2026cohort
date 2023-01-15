import java.util.Scanner;
public class a1_q6 {
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            int n=sc.nextInt();
            for(int i = 0;i<=n ; i++){
                int c= n%10;
                System.out.print(c);
                n=n/10;
                i=0;/*this is for let n =123
                 round 1 : i=0 , c =3 , n =12
                 round 2 : i=1 , c =2 , n =1 if we remove i=0; then 
                 round 3 : i=2 , n =1 i>n out of the loop then answer 
                 will be 32 (expected : 321) 
                */
            }
        }
    }
}

                

            