import java.util.*;

public class SortMethod{
    public static void main(String[]  args){
        int[][] matrix=new int[][]{{1,2},{2,3},{3,2},{2,5},{6,3},{3,5}};

        //sorted according to first element of 2D array
        Arrays.sort(matrix, (a,b)->a[0]-b[0]);
        for(int[] arr:matrix){
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("_x_x_x_x_x_x_x_x_");
        //sorted according to second element of 2D array
        Arrays.sort(matrix, (a,b)->a[1]-b[1]);
        for(int[] arr:matrix){
            System.out.println(Arrays.toString(arr));
        }

        
        //sorted according to first and second elements of 2D array
        // if first elements are equal then use second 
        // else first elements
        Arrays.sort(mArr, (p1, p2) -> {
            if (p1[0] == p2[0]) {
                return p1[1] - p2[1];
            }
            return p1[0] - p2[0];
        });
        

        
    }
}
