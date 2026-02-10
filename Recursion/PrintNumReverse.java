public class PrintNumReverse{
    public static void printnumreverse(int n){
        //base case
        if(n==1){
            System.out.println(n);
            return;
        }
    System.out.println(n);
    printnumreverse(n-1);
        }
    public static void main(String args[]){
      int n=10;
      printnumreverse(n);

       }
    }
