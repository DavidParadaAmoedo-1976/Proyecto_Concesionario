//public int enteroCorrecto(String dato, int minInclusive, int maxInclusive) {
//
//    int num = 0;
//    boolean datoOk = false;
//
//    while (!datoOk) {
//        System.out.print(dato);
//        String input = sc.nextLine();
//        try {
//            num = Integer.parseInt(input);
//            if (num >= minInclusive && num <= maxInclusive) {
//                datoOk = true;
//            } else {
//                System.out.println("El valor debe estar entre " + minInclusive + " y " + maxInclusive);
//            }
//        } catch (NumberFormatException e) {
//            System.out.println("Error: Introduzca un número válido.");
//        }
//    }
//    return num;
//}