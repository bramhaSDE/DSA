package ARRAYS;

public class SecondSmallest {

    public static void main(String[] args) {

        int arr[]  = {2,1,6,5,9,10,8};

        int smallest = arr[0];
        int sSmallest = -1;

        for(int i = 1; i< arr.length;i++){

            if(arr[i] <smallest ){
                sSmallest = smallest;
                smallest=arr[i];
            }else if(arr[i]>smallest && arr[i]<sSmallest)
                sSmallest=arr[i];
        }

        System.out.println(sSmallest);

    }
}
