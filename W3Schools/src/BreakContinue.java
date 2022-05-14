public class BreakContinue {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){

            System.out.println(i);
            if(i==4){
                break;
            }

        }
        System.out.println("---------------------");

        int j=0;
        while(j<9){

            if(j==4){
                j++;
                continue;

            }
            System.out.println(j);
            j++;
        }
    }

}
