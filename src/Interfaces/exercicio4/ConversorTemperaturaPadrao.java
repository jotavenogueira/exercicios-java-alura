package Interfaces.exercicio4;

import java.util.Scanner;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public Double celsiusParaFahrenheit(Double celsius) {
        return (celsius * 9/5) + 32;
    }

    @Override
    public Double fahrenheitParaCelsius(Double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperaturaPadrao();
        Scanner ler = new Scanner(System.in);
        Double temperatura;
        int leitor = 0;


       while(leitor != 99){
           System.out.println("Conversor de Temperatura: ");
           System.out.println("1 - Celsius para fahrenheit");
           System.out.println("2 - fahrenheit para Celsius");
           System.out.println("99 - Sair");

           leitor = ler.nextInt();

           switch (leitor){
               case 1:
                   System.out.println("Digite a temperatura em graus celsius: ");
                   temperatura = ler.nextDouble();
                   System.out.println( "A temperatura em fahreinheit é: " + conversor.celsiusParaFahrenheit(temperatura));
                   break;
               case 2:
                   System.out.println("Digite a temperatura em graus fahrenheit: ");
                   temperatura = ler.nextDouble();
                   System.out.println( "A temperatura em fahreinheit é:  " + conversor.celsiusParaFahrenheit(temperatura));
                   break;
               case 99:
                   break;

           }
       }
    }
}
