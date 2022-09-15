public class Matriz {
    public int[][] matriz;

    public void show(){
        for(int i=0; i < this.matriz.length ; i++ ){
            System.out.print("\n");
            for(int j=0; j < this.matriz[i].length; j++ ){
                System.out.print(this.matriz[i][j] + " ");
            }
        }
    }

    public void insertValuePrimaryMatriz(int num1, int num2) {
        this.matriz[num1-1][num2-1] = 1;
    }

    public int[][] insertValueSecondaryMatriz(int num1, int num2){

        // implement a function that executes when number1 is higher than number2
        int j = 0;
        for(int i=0; i < this.matriz.length ; i++ ){
            if(i+1 == num1) {
                this.matriz[i][j] = -1;
                System.out.print(this.matriz[i][j]);
                for(j=0; j < this.matriz[i].length; j++ ){
                    if(j+1 == num2) {
                        this.matriz[i][j] = 1;
                        break;
                    }
                }
            }
        }
        return this.matriz;
    }
}
