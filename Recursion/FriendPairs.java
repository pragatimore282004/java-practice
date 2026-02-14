//Given n friends, each friend can:Stay single, or Pair up with one other friend
//Find the total number of ways this can be done.

public class FriendPairs {
    public static int friendpairs(int n){
    //base case
    if(n==1||n==2){
        return n;
    }
    return friendpairs(n-1)+(n-1)*friendpairs(n-2);
    }
    public static void main(String args[]){
    System.out.print("Total no of ways : "+friendpairs(3));
    }
}
