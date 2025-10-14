package Interfaces.exercicio1;

public class ConversorMoeda implements ConversorFinanceira{
    @Override
    public Double converterDolarParaReal(Double dolar) {
        return dolar * 5.48;
    }

    @Override
    public Double converterRealParaDolar(Double real) {
        return real * 0.1823;
    }
}
