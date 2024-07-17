public class hm_18 {
    public static void main(String[] args) {

        int[][][] array = {
            {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            },
            {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
            },
            {
                {19, 20, 21},
                {22, 23, 24},
                {25, 26, 27}
            }
        };

        for (int z = 0; z < array.length; z++) {
            int sum = 0;
            int count = 0;
            for (int x = 0; x < array[z].length; x++) {
                for (int y = 0; y < array[z][x].length; y++) {
                    sum += array[z][x][y];
                    count++;
                }
            }
            double average = (double) sum / count;
            System.out.println("第 " + (z + 1) + " 層的average：" + average);
        }
    }
}

