package Kata6;

public class EqualSidesOfAnArray {

    public static void main(String[] args) {
        System.out.println(  findEvenIndex(new int[] {1,2,3,4,3,2,1}));
        System.out.println(  findEvenIndex(new int[] {1}));
    }




    public static int findEvenIndex(int[] arr) {

        if(arr.length == 1) return 0;

        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = 0;

            for (int x = i-1; x >= 0 ; x--) {
                left += arr[x];
            }

            for (int y = i +1; y < arr.length; y++) {
                right += arr[y];
            }

            if(left == right){
                return i;
            }
        }

        return -1;
    }
}
