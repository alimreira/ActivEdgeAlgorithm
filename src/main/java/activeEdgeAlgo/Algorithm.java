package activeEdgeAlgo;

import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args) {

        int [] arr = {1, 3, 6, 4, 1, 2};
        int [] arr2 = {5, -1, -3};
        System.out.println(nonOccurrence(arr));
        System.out.println(nonOccurrence(arr2));
    }

    private static int nonOccurrence(int[] arr) {
        int hold = 1;
        Arrays.sort(arr);

        if(arr[0] > 1 || arr[arr.length - 1] <= 0)
            return hold;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == hold)
                hold++;
        }

        return hold;
    }


}
