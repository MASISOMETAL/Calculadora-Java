package src;

import java.util.Scanner;
import java.util.ArrayList;

public class App {

    static int cantOperaciones = 0;
    static ArrayList<String> operadores = new ArrayList<>();
    static ArrayList<Double> valores = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);

    static void Inicio() {

        System.out.println("Escribe un valor y apreta enter");
        valores.add(entrada.nextDouble());
        System.out.println("Escribe un operador y apreta enter");
        String operador = entrada.next();
        switch (operador) {
            case "+":
                Operacion(operador);

                break;
            case "-":
                Operacion(operador);

                break;
            case "*":
                Operacion(operador);

                break;
            case "/":
                Operacion(operador);

                break;
            case "=":
                Resultado();
                break;

            default:
                break;
        }
        //System.out.println("El num seleccionado es: " + valores + " y el operador es: " + operadores);
    }

    static void Operacion(String value) {
        operadores.add(value);
        Inicio();
    }


    static void Resultado() {
        Double[] valoresArray = new Double[valores.size()];
        Double resultado = valores.get(0);

        for (int i = 0; i < valoresArray.length - 1; i++) {
            Double numero = valores.get(i + 1);
            switch (operadores.get(i)) {
                case "+":
                    resultado += numero;

                    break;
                case "-":
                    resultado -= numero;

                    break;
                case "*":
                    resultado *= numero;

                    break;
                case "/":
                    resultado /= numero;

                    break;
                default:
                    break;
            }
        }
        System.out.println("El resultado es: " + resultado);

    }

    public static void main(String[] args) {
        Inicio();
    }
}
