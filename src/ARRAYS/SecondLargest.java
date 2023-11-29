package ARRAYS;

public class SecondLargest {

    public static void main(String[] args) {

        int[] arr ={1,23,5,8,1,6,9,15,48};

        int largest = arr[0];
        int sLargest = Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){

            if(arr[i]>largest){
                sLargest = largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>sLargest){
                sLargest = arr[i];
            }

        }
        System.out.println(sLargest);
    }

}
