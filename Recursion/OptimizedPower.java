public class OptimizedPower {
    public static int optimizedpower(int x,int n){
        //base case
        if(n==0){
            return 1;
        }
        int halfpower=optimizedpower(x,n/2);
        int halfpowersq=halfpower*halfpower;
        //n is odd
        if(n%2!=0){
            halfpowersq=x*halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String args[]){
    int x=2;
    int n=5;
    System.out.print(optimizedpower(x,n));
    }
}
