public class PrintPower {
  public static int printpower(int x,int n){
    //base case
    if(n==0){
        return 1;
    }
    return x*printpower(x,n-1);

  }
  public static void main(String args[]){
    int x=2;
    int n=10;
    System.out.println(printpower(x,n));
  }
}
