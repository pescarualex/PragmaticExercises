package pragmaticExercises.repetition;

public class MultiplicationTable {

    public static void main(String[] args) {

        int total;

        for (int i = 0; i <= 12; i++) {
            for (int j = 0; j <= 12; j++) {
                total = i * j;
                System.out.println(i + " * " + j + " = " + total);
            }
        }



    }

}
