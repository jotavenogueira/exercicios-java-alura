package Interfaces.exercicio2;

import Interfaces.exercicio5.Calculavel;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public Double calcularPerimetro(Double lado1, Double lado2) {
        return lado1 * 2 + lado2 * 2;
    }

    @Override
    public Double calcularArea(Double lado1, Double lado2) {
        return lado1 * lado2;
    }

}
