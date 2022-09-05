public class EjercicioTema4 {
    public static void main(String[] args) {
        var numeroIf = 0;
        if (numeroIf == 0) {
            System.out.println("Es cero");
        }else if (numeroIf > 0) {
            System.out.println("Es positivo");
        }else {
            System.out.println("Es negativo");
        }

        System.out.println("________________________________________");
        int numeroWhile = 0;

        while(numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println("________________________________________");

        int numeroDoWhile = 1;

        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile > 3);

        System.out.println("________________________________________");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("________________________________________");

        String estacion = "OTOÑO";

        switch (estacion) {
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estacion");
                break;
        }
    }



}
