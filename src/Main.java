public class Main {
    public static void main(String[] args) {
      int[][][] array = new int[2][2][2];
      int layer = array.length;
      int col = array[0][0].length;
      int row = array[0][1].length;
      for (int i = 0; i < layer; i++) {
        for (int a = 0; a < col; a++) {
            for (int b = 0; b <row; b++) {
                System.out.println(array[i][a][b]);}}}
      array[0][0][0] = 1;
      for (int o = 0; o < layer; o++) {
        for (int f = 0; f < col; f++) {
            for (int g = 0; g <row; g++) {
                System.out.println(array[o][f][g]);}}}


    }

}
