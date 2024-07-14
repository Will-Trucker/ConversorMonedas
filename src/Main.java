import java.util.Scanner;

import com.example.currencyconverter.ConsultDivisa;
import com.example.currencyconverter.CurrencyConverter;

public class Main {
    public static void main(String[] args) {
        // Inicializando el atributo read
        Scanner read = new Scanner(System.in);

        // Variable para leer la opciones del sistema
        int opc = 0;
        do {
            System.out.println("""
                        ********************************************************
                               BIEVENIDO AL SISTEMA- CONVERSOR DE DIVISAS\n
                    
                                           ELIGA UNA OPCIÓN:
                                           
                            1.  DOLARES A PESOS ARGENTINOS
                            2.  PESOS ARGENTINOS A DOLARES
                            3.  DOLARES A REAL BRASILEÑO
                            4.  REAL BRASILEÑO A DOLARES
                            5.  DOLARES A PESOS COLOMBIANOS
                            6.  PESOS COLOMBIANOS A DOLARES
                            7.  SALIR\n
                        *********************************************************                
                    
                    """);
            // Hacemos que lea el entero al seleccionar una opcion
            opc = read.nextInt();
            if (opc >= 1 && opc <= 6) {
                System.out.print("""
                            \nDIGITE EL VALOR A CONVERTIR:
                        """);
                // Variable para leer el monto a convertir
                double amount = read.nextDouble();
                // Variable para convertir segun el tipo de divisa
                CurrencyConverter converter = new CurrencyConverter();
                String result = converter.convertCurrency(opc, amount);
                System.out.println(result);
            }
        } while (opc != 7);
        read.close();
        System.out.println("""
                ***************************************************
                                GRACIAS POR UTILIZAR
                                     EL SISTEMA\n
                                     
                  created by: William Mazariego\n                   
                ***************************************************
                
                """);
        }
}

