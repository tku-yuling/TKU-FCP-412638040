public class hm_12 {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("所有元素:");
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.printf("a[%d][%d]=%d,  ",i,j,arr[i][j]);

            }
            System.out.println();
        }
    }
    
}
