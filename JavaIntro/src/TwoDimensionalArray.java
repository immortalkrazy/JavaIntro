public class TwoDimensionalArray {

      public TwoDimensionalArray() {
            // TODO Auto-generated constructor stub
      }

      public static void main(String[] args) {
            int[][] matrix = new int[2][2];
            initialize(matrix);
            print(matrix);

      }

      public static boolean initialize(int[][] matrix) {
            for (int row = 0; row < matrix.length; row++) {
                  for (int column = 0; column < matrix[row].length; column++) {
                        matrix[row][column] = (int) (Math.random() * 100);
                  }
            }
            return true;
      }

      public static void print(int[][] matrix) {
            for (int row = 0; row < matrix.length; row++) {
                  for (int column = 0; column < matrix[row].length; column++) {
                        System.out.print(matrix[row][column] + " ");
                  }
                  System.out.println();
            }

      }

}
