package DataStructures.Sorting;

public class InsertionSort {
    public static void main(String args[]){

        int [] arr = {7,8,3,1,2};
        //print unsorted array
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
          
        }
        for(int i=0;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
            System.out.print("\n");
        //print sorted array
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
