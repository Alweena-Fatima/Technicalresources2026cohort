import java.util.*;
public class a1_q10{

  
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
         int n= scn.nextInt();//let n =8  
         
        for(int i = 2;i<=n ; i ++){// [i=2] [i=2 and n =4][i=2 and n=2]
            if(n%i==0){// [8%2==0] [4%2==0] [2%2==0]
                System.out.print(i+" ");//[2 2 2]
                n=n/i;// [8/2=4] [4/2=2] [2/2=1]
                i=1;// [i=1 [i =1] [i=1]
                //{out of the loop because n = 1 and i = 2 i>n false}
            }
        }
    }
}
}