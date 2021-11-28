import java.util.*;

 // Compiler version JDK 11.0.2

 class BubbleSort
 {
   public static void printArray(int arr[]){
     for(int i =0; i<arr.length; i++){
       System.out.print(arr[i]+" ");
     }
   }
   public static void main(String args[])
   { 
     
     //Bubble sort
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter size for array");
     int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements of array");
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    
    for(int i=0; i<arr.length-1; i++){
      for(int j = 0; j<arr.length-i-1; j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    printArray(arr);
   }
 }
