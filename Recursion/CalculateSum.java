public class CalculateSum {
   public static int calsum(int n){
    //base case
    if(n==1){
        return 1;
    }
    int snm1=calsum(n-1);
    int sum=n+snm1;
    return sum;
   }
    public static void main(String args[]){
    int n=10;
    System.out.println(calsum(n));
    }
}
