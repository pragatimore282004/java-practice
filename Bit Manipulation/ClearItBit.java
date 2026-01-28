public class ClearItBit {
    public static int clearitbit(int n,int i){
    int bitmask=~(1<<i);
    return n&bitmask;
    }
    public static void main(String args[]){
    System.out.println(clearitbit(10,1));
    }
}
