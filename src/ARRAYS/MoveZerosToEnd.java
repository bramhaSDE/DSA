package ARRAYS;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] a = {1,2,3,0,4,0,5,0,7,9};

        int j = -1;

        //find out the first 0
        for(int i=0;i<a.length;i++){

            if(a[i]==0) {
                j = i;
                break;
            }
        }

        for(int i=j+1;i<a.length;i++){
            if(a[i]!=0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }

        for(int l=0;l<a.length;l++){
            System.out.println(a[l]);
        }


    }




}
