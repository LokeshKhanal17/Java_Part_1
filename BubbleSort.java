package DataStructures.Sorting;

public class BubbleSort {
    public static void main(String args[]){
        int [] arr = {7,8,2,9,4};
        //print unsorted array
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
          
        }
        //sort array
        //at first iteration largest element will be at last index
        //for that we need to iterate array.length-1 times
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            } 
        }
          System.out.print("\n");
        //print sorted array
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
