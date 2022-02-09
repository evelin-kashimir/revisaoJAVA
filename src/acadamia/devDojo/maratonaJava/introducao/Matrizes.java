package acadamia.devDojo.maratonaJava.introducao;

public class Matrizes {
    public static void main(String[] args) {

        //Matrizes - Array Multidimencional
        //1, 2, 3 Meses
        //30, 20, 15 Dias

        int[][]dias = new int[3][3];

        dias[0][0] = 12;
        dias[0][1] = 5;
        dias[0][2] = 2;

        dias[1][0] = 11;
        dias[1][1] = 6;
        dias[1][2] = 30;

        dias[2][0] = 9;
        dias[2][1] = 18;
        dias[2][2] = 22;

        //Com FOR
        for (int i = 0; i < dias.length; i++){
            for (int j = 0; j <dias.length; j++){
                System.out.println(dias[i][j]);
            }
        }

        //Com FOREACH
        //Cria-se um array para percorrer o array, depois um foreach aninhado para percorrer este array criado
        for(int[] arrBase: dias){
            for(int num: arrBase)
            System.out.print(num + " ");
        }

        //Outra forma de inicializar uma matriz
        int [][]arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[6];

        for (int [] base: arrayInt){
            System.out.println("\n-----");
            for (int num: base){
                System.out.print(num + " ");
            }
        }

        //inicializando e atribuindo valor a matriz
        int [][]array02 = new int[][]{{1,2,3}, {4,5,6},{7,8,9}};
    }
}
