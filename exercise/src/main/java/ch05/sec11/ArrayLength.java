package ch05.sec11;

public class ArrayLength {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        // 3
        // 5
        System.out.println(array.length);
        System.out.println(array[2].length);
    }
}
