public class hm_13 {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        for(int i=0; i<arr.length;i++){
            int sum=0;
            for(int j=0; j<arr[i].length;j++){
                sum+=arr[i][j];

            }
            System.out.printf("第%d行總和: %d\n",i+1,sum);
        }
    }
    
}
