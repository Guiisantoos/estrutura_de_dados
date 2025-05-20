
public class BuscaSequencial {

    public static boolean sequentialSearch(int[] lista, int item) {
        int pos = 0;
        boolean found = false;

        while (pos < lista.length && !found) {
            if (lista[pos] == item) {
                found = true;
            } else {
                pos++;
            }
        }

        return found;
    }

    public static void main(String[] args) {
        int[] Lista_exercicio = {0, 3, 5, 9, 14, 17, 21, 33, 39};

        // Chamada 1
        boolean resultado1 = sequentialSearch(Lista_exercicio, 15);
        System.out.println("Pergunta 1: " + resultado1);

        // Chamada 2
        boolean resultado2 = sequentialSearch(Lista_exercicio, 39);
        System.out.println("Pergunta 2: " + resultado2);
    }
}
