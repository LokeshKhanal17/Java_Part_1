package DataStructures.Sorting;

public class Recursion {
    //Tower of hanoi
    public static void toerOfHanoi(int n, String source,String helper,String destination){
        if(n==0){
            return;
        }
        if(n==1){
            System.out.println("transfer disk 1 from" + source + "to" + destination);
            return;
        }
         toerOfHanoi(n-1,source,destination,helper);
         System.out.println("transfer disk" + n +"from" + source + "to" + destination);
         toerOfHanoi(n-1,helper,source,destination);

    } 
    //factorial
    public static int factorial(int n){
        if(n== 0){
            return 1;
        }
        int smallestProblem = factorial(n-1);
        int myans = n*smallestProblem;
        return myans;
    }
    //fibonacci
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibnm1 = fibonacci(n-1);
        int fibnm2 = fibonacci(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }
    //power
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1 = power(x,n-1);
        int xn = x*xnm1;
        return xn;
    }
    //string in reverse.
    public void reverse(String str,int index){
        if(str.length()==0){
            return;
        }
        System.err.println(str.charAt(index));
        reverse(str, str.length()-1);
        
    }
    //find first amd last occurence of a element im string
    int first = -1;
    int last = -1;
    public void firstAndLastOccurence(String str,int index,char ch){
        if(index==str.length()){
            return;
        }
        if(str.charAt(index)==ch){
            if(first==-1){
                first = index;
            }
            last = index;
        }
        firstAndLastOccurence(str, index+1, ch);
    }   
    //check if the array is sorted or not   
     public static boolean isSorted(int [] arr,int index){
        if (index == arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        boolean isSmallerSorted = isSorted(arr, index+1);
        return isSmallerSorted;

     }
    public static void main (String args[]){
        //toerOfHanoi
       int n = 3;
       toerOfHanoi(n,"A","B","C");
        //factorial
        int n1 = 5;
        int ans = factorial(n1);
        System.out.println(ans);

        //fibonacci     
        int n2 = 5;
        int ans1 = fibonacci(n2);
        System.out.println(ans1);

        //power
        int x = 2;
        int n3 = 3;
        int ans2 = power(x,n3);
        System.out.println(ans2);
        String str = "hello";
        //reverse
        Recursion obj = new Recursion();
        obj.reverse(str,0);
        //first and last occurence
        obj.firstAndLastOccurence(str,0,'l');
        System.out.println(obj.first);
        System.out.println(obj.last);

        //check if the array is sorted or not
        int [] arr = {1,2,3,4,5};
        boolean ans3 = isSorted(arr,0);
        System.out.println(ans3);
        

       

    }
    
}
