public class EjercicioTema3 {
    public static void main(String[] args) {
        var valor = suma(3,6,9);
        System.out.println(valor);
        Coche miCoche = new Coche();
        miCoche.aumentoPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int num1, int num2, int num3){
        int result = num1 + num2 + num3;
        return result;
    }
}

/**
 * Coche
 */
class Coche {
    int puertas = 0;

    public void aumentoPuertas() {
        this.puertas++;
    }

}