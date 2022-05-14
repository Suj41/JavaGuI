public class Multidimensional_array {
    public static void main(String[] args) {
        int[][] fck={{1,2,3}, {1,2}};
        for(int i=0; i<fck.length; i++){
            for (int j=0; j<fck[i].length; j++){
                System.out.println(fck[i][j]);
            }
        }
        System.out.println("------");
       /* int x = fck[1][2];
        System.out.println(x);*/
    }
}
