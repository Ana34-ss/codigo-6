public class Codigo6 {

    public static void main(String[] args) {

        // ERROR: int[] n = int[20];
        // CORRECTO: Hay que usar 'new' para crear el arreglo
        int[] n = new int[20];

        // ERROR: for (int i = 0; i < 20; i+)
        // CORRECTO: Faltaron los dos signos de suma 'i++'
        for (int i = 0; i < 20; i++) {
            // ERROR: System.print(n[i] + " ");
            // CORRECTO: 'System.print' no existe, es 'System.out.print'
            n[i] = (int)(Math.random() * 381) + 20;
            System.out.print(n[i] + " ");
        }

        // ERROR: System.out.printl(...)
        // CORRECTO: Es 'println', no 'printl'
        System.out.println("\n¿Qué números quiere resaltar? ");

        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");

        // ERROR: falta paréntesis al final
        // CORRECTO: cerrar bien el método
        int opcion = Integer.parseInt(System.console().readLine());

        // ERROR: (opcion == 1) : 5 ? 7;
        // CORRECTO: el operador ternario está mal escrito
        int multiplo = (opcion == 1) ? 5 : 7;

        // ERROR: foreach (char e : n)
        // CORRECTO: no existe como tal un'foreach' en Java, y el tipo 'char' está mal, es 'int'
        for (int e : n) {
            // ERROR: if sin llave bien cerrada y else mal puesto
            // CORRECTO: llaves bien puestas y else fuera del if
            if (e % multiplo == 0) {
                System.out.print("[" + e + "] ");
            } else {
                // ERROR: System.in.print...
                // CORRECTO: 'System.in' es para leer, no para imprimir
                System.out.print(e + " ");
            }
        }
    }
}

