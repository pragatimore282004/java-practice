public class LastOccurence {
    public static int lastoccurence(int arr[],int i,int key){
        //base case
        if(i==arr.length){
            return -1;
        }
        int isFound=lastoccurence(arr,i+1,key);
        if(isFound==-1&&arr[i]==key){
            return i;
        }
          return isFound;
    }
    public static void main(String args[]){
    int arr[]={8,3,6,9,5,10,2,5,3};
    System.out.println("lat occurence of key at index : "+lastoccurence(arr,0,5));
    }
    
}
