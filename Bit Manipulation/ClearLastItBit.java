public class ClearLastItBit {
    public static int clearlastitbit(int n,int i){
    int bitmask=(~0)<<i;
    return n&bitmask;
    }
    public static void main(String args[]){
System.out.println(clearlastitbit(15,2));
    }
}
