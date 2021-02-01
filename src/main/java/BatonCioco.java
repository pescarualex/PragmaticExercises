public class BatonCioco {
    public static void main(String[] args) {

        // a)

        int[] cioco = {5, 2, 0, 1, 9};
        int[] bucatiInPachet = {1, 2, 3, 5, 10};

        int total = 0;

        for (int i = 0; i < cioco.length; i++) {
            total += (cioco[i] * bucatiInPachet[i]);
        }
        System.out.println("Total: " + total);

        // b)

        int x = 22;
        int raspuns = 0;

        for (int i = 1; i < bucatiInPachet.length; i++) {
                raspuns = x / bucatiInPachet[i];
        }

        System.out.println(raspuns);
    }
}
