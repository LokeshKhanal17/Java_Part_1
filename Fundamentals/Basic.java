package Fundamentals;

public  Basic {
    //variables
    public static void variables(){
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    //swap
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
    //array
    public static void array(){
        int [] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]); 
    }
    //loops
    public static void loops(){
        int [] arr = {10,20,30,40,50};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int val:arr){
            System.out.println(val);
        }
    }
    //string builder
    public static void stringBuilder(){
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append(" ");
        sb.append("world");
        System.out.println(sb);
        sb.setCharAt(0,'d');
        System.out.println(sb);
        sb.insert(2,'y');
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.delete(2,4);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(0));
        System.out.println(sb.substring(0,3));
    }
    //time complexity
    public static void timeComplexity(){
        int n = 100000;
        int count = 0;
        for(int i=0;i<n;i++){
            count++;
        }
        System.out.println(count);
    }
    
}
