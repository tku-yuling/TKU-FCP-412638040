public class hm_11 {
    public static void main(String[] args) {
        
        int[] a={22,10,18,34,56,8,9,54,65,76};
        int max =a[0];

        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        
        }
        System.out.println();
        System.out.println("max:"+max);


    }
    
}
