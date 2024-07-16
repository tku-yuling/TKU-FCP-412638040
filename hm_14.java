public class hm_14 {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] trans =new int[3][3];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                trans[j][i]=arr[i][j];
            }
        }
        System.out.println("原本: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.printf("%d", arr[i][j]);

            }
            System.out.println();
        }
        System.out.println("轉置: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.printf("%d", trans[i][j]);
            }
            System.out.println();
        }


    }
}
