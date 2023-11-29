package ARRAYS;

public class ArraySortedOrNot {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,5};

        boolean sortedFlag = false;

        for(int i = 1 ;i<a.length;i++){
            if(a[i]>a[i-1]){
                sortedFlag = true;
            }else
                sortedFlag=false;
        }
        System.out.println(sortedFlag);

    }
}
