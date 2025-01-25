package InterviewCodingQue;

public class Que005_RearrangeNumber {
    //public static void main(String[] args) {
      //  int[] input = {3, 0, 1, 0, 2, 0, 5, 0, 4, 0};
       // int[] output = rearrangeArray(input);
        //System.out.println("Output"+Arrays.toString(output));

//    }
public static void main(String[] args) {
    int arr [] = {3, 0, 1, 0, 2, 0, 5, 0, 4, 0};
    System.out.print("Original Array: ");
    for(int i = 0; i<arr.length; i++)
        System.out.print(arr[i] + " ");

    int temp = 0;
    for(int i = 0; i<arr.length; i++){
        for (int j = i+1; j<arr.length; j++){
            if(arr[j]<arr[i]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    System.out.print("\nSorted Array: ");
    for(int i = 0; i<arr.length; i++)
        System.out.print(arr[i] + " ");

}


}
