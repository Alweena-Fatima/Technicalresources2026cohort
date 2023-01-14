import java.util.*;
  
  public class a1_q3{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
       int t = scn.nextInt();
       
       while(t>0){
           int n =scn.nextInt();
       
       int check = 0;
       for(int i = 1;i<=n/2 ; i ++){
           if(n%i==0){
               check++;
           }
       }
       if(n<=2){
           System.out.println("prime");
           
       }
       else if (check==1){
           System.out.println("prime");
       }
       else{
           System.out.println("not prime");
       }
       t--;
       }
       
  
   }
  }