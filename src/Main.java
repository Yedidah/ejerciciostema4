public class Main {
    public static void main(String[] args) {
        int numeroif;
        numeroif = -10;

        if ( numeroif == 0) {
            System.out.println("El numero es Cero");
        } else if (numeroif > 0) {
            System.out.println("El numero es positivo");
        } else
            System.out.println("El numero es Negativo");


        //while
        int numeroWhile = 1;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("La variable numeroWhile ahora vale: " + numeroWhile);

            // doWhile //
            int numeroDoWhile = 3;
            do {

                System.out.println("La variable Dowhile es " + numeroDoWhile);
                numeroDoWhile++;
            } while (numeroDoWhile <= 3);

            //For //

            for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
                System.out.println("La variable numeroFor ahora vale: " + numeroFor);
            }

            //swich//
            String estacion ="Otoño";
            switch (estacion) {
                case "Verano":
                    System.out.println( "Es Verano");
                    break;
                case "Invierno":
                    System.out.println("Es Invierno");
                    break;
                case "Otoño":
                    System.out.println("Es Otoño");
                    break;
                case "Primavera":
                    System.out.println("Es Primavera");
                    break;
                default:
                    System.out.println(estacion + " " + "No es una Estacion");
            }
        }
    }
}
