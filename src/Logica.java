import java.util.Scanner;

public class Logica {
    public void logicaPrograma() {
        Operacion operacion = new Operacion();
        Menu nuevoMenu = new Menu();
        nuevoMenu.mostrarMenu();
        try (Scanner input = new Scanner(System.in)) {
            int opcionUsuario = input.nextInt();
            while (opcionUsuario != 7) {
                switch (opcionUsuario) {
                    case 1:
                        System.out.println("Por favor ingresa la cantidad que deseas convertir:");
                        double cantidad = input.nextDouble();
                        double resultado = operacion.operacionConversion("USD", "BOB", cantidad);
                        System.out.println("***********************************************");
                        System.out.println(cantidad + " Dolares son " + resultado + " Bolivianos");
                        nuevoMenu.menu2();
                        int segundaOpcion = input.nextInt();
                        if (segundaOpcion == 2) {
                            System.out.println("Gracias por usar el programa");
                            return;
                        }else{
                            nuevoMenu.mostrarMenu2();
                            opcionUsuario = input.nextInt();
                        }
                        break;
                    case 2:
                        System.out.println("Por favor ingresa la cantidad que deseas convertir:");
                        cantidad = input.nextDouble();
                        resultado = operacion.operacionConversion("BOB", "USD", cantidad);
                        System.out.println("***********************************************");
                        System.out.println(cantidad + " Dolares son " + resultado + " Bolivianos");
                        nuevoMenu.menu2();
                        segundaOpcion = input.nextInt();
                        if (segundaOpcion == 2) {
                            System.out.println("Gracias por usar el programa");
                            return;
                        }else{
                            nuevoMenu.mostrarMenu2();
                            opcionUsuario = input.nextInt();
                        }
                        break;
                    case 3:
                        System.out.println("Por favor ingresa la cantidad que deseas convertir:");
                        cantidad = input.nextDouble();
                        resultado = operacion.operacionConversion("USD", "ARS", cantidad);
                        System.out.println("***********************************************");
                        System.out.println(cantidad + " Dolares son " + resultado + " Pesos Argentinos");
                        nuevoMenu.menu2();
                        segundaOpcion = input.nextInt();
                        if (segundaOpcion == 2) {
                            System.out.println("Gracias por usar el programa");
                            return;
                        }else{
                            nuevoMenu.mostrarMenu2();
                            opcionUsuario = input.nextInt();
                        }
                        break;
                    case 4:
                        System.out.println("Por favor ingresa la cantidad que deseas convertir:");
                        cantidad = input.nextDouble();
                        resultado = operacion.operacionConversion("ARS", "USD", cantidad);
                        System.out.println("***********************************************");
                        System.out.println(cantidad + " Pesos Argentino son " + resultado + " Dólares");
                        nuevoMenu.menu2();
                        segundaOpcion = input.nextInt();
                        if (segundaOpcion == 2) {
                            System.out.println("Gracias por usar el programa");
                            return;
                        }else{
                            nuevoMenu.mostrarMenu2();
                            opcionUsuario = input.nextInt();
                        }
                        break;
                    case 5:
                        System.out.println("Por favor ingresa la cantidad que deseas convertir:");
                        cantidad = input.nextDouble();
                        resultado = operacion.operacionConversion("USD", "BRL", cantidad);
                        System.out.println("***********************************************");
                        System.out.println(cantidad + " Dolares son " + resultado + " Reales Brasileros");
                        nuevoMenu.menu2();
                        segundaOpcion = input.nextInt();
                        if (segundaOpcion == 2) {
                            System.out.println("Gracias por usar el programa");
                            return;
                        }else{
                            nuevoMenu.mostrarMenu2();
                            opcionUsuario = input.nextInt();
                        }
                        break;
                    case 6:
                        System.out.println("Por favor ingresa la cantidad que deseas convertir:");
                        cantidad = input.nextDouble();
                        resultado = operacion.operacionConversion("BRL", "USD", cantidad);
                        System.out.println("***********************************************");
                        System.out.println(cantidad + " Reales Brasileros son " + resultado + " Dólares");
                        nuevoMenu.menu2();
                        segundaOpcion = input.nextInt();
                        if (segundaOpcion == 2) {
                            System.out.println("Gracias por usar el programa");
                            return;
                        }else{
                            nuevoMenu.mostrarMenu2();
                            opcionUsuario = input.nextInt();
                        }
                        break;
                }
            }
        }
    }
}
