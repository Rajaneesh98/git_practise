public class problem {

    public static void main(String[] args) {

        int n=5;

        for(int i=0; i<n; i++){

            for(int space=0; space<n-i-1; space++){

                System.out.print("*");
            }

            for(int j=1; j<i+2; j++){
                
                System.out.print(j);
            }
            for(int k=i; k>0; k--){
                
                System.out.print(k);
            }
            System.out.println();
        }
    }
    
}
