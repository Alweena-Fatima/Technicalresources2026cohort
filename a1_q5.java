import java.util.Scanner;
public class a1_q5{
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
        int t=sc.nextInt();
        int count = 1;
        for(int i = 0;i <t;i++)
        if(t/ 10!=0){
            t=t/10;
            count++;
        }
        System.out.println(count);

    }
    }
}