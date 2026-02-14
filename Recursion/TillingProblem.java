//problem:In how many ways can you tile a 2×n floor using 2×1 tiles?

public class TillingProblem {
    public static int tillingproblem(int n){
        //base case
        if(n==0||n==1){
            return 1;
        }
        //vertical choice
        int fnm1=tillingproblem(n-1);
         //horizontal choice
        int fnm2=tillingproblem(n-2);
        int totways=fnm1+fnm2;
        return totways;
      }
    public static void main (String args[]){
        int n=4;
        System.out.print("total no. of ways to tile the floor : "+ tillingproblem(n));
    }
}
