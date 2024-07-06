package academy.arthur.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayMulti = new int[3][];

        arrayMulti[0]= new int [2];
        arrayMulti[1]= new int []{1,2,3,4,5};
        arrayMulti[2]= new int [6];

        int[][] arrayMulti2 = {{1,2,3},{4,5,6},{7,8,9}};
        for(int[] arrayBase:arrayMulti2){
            for (int num:arrayBase){
                System.out.print(num + " ");
            }
            System.out.println("\n ------------");
        }
    }
}
