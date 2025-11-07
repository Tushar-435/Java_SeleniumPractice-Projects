public class inverthalfptrn {
    public static void main(String[] args) {
        
        int a =5;
        int b=4;
        for(int i=1; i<=a; i++){
            for(int j=b; j>=i; j--){
                System.out.print("*");
 
            }
            System.out.println();
        }

        // for(int i=1; i<=5; i++){
        //     for(int j=4; j>=i; j--){
        //         if(i==1 || i==2 || j==1 || j==4 || j==2){
        //             System.out.print("");
        //         }else{
        //             System.out.print(" *");
        //         }
        //     }
        //     System.out.println();
        // }
    }
    
}
