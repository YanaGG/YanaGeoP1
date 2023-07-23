package chapiterThree;

public class ArrayCaseDD {
    public static void main(String[] args) {

        char symbol = 'a';
        String[][] myArray = new String[5][7];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[4].length; j++) {
                myArray[i][j] = symbol + "" + (j + 1);
                System.out.print(myArray[i][j] + " ");
            }
            symbol++;
            System.out.println();



        }

    }
}
