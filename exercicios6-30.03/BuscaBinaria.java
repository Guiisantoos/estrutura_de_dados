
public class BuscaBinaria {

    public static boolean binarySearch(int[] lista, int item) {
        int first = 0;
        int last = lista.length - 1;
        boolean found = false;

        while (first <= last && !found) {
            int midpoint = (first + last) / 2;

            if (lista[midpoint] == item) {
                found = true;
            } else {
                if (item < lista[midpoint]) {
                    last = midpoint - 1;
                } else {
                    first = midpoint + 1;
                }
            }
        }

        return found;
    }

    public static void main(String[] args) {
        int[] Lista_exercicio = {0, 3, 5, 9, 14, 17, 21, 33, 39};

        // Chamada 1
        boolean resultado1 = binarySearch(Lista_exercicio, 15);
        System.out.println("Pergunta 1: " + resultado1);

        // Chamada 2
        boolean resultado2 = binarySearch(Lista_exercicio, 39);
        System.out.println("Pergunta 2: " + resultado2);
    }
}
