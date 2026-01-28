public class UpdateItBit {
    public static int setitbit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static int clearitbit(int n,int i){
    int bitmask=~(1<<i);
    return n&bitmask;
    }
    public static int updateitbit(int n, int i, int newbit){
     if(newbit==0){
        return clearitbit(n,i);
     }else{
        return setitbit(n,i);
     }
    }
    public static void main(String args[]){
    System.out.println(updateitbit(10,2,1));
    }
}
