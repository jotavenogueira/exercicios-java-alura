package Interfaces.exercicio5;

public class Livro implements Calculavel{
    private String titulo;
    private Double precoBase;
    private  Double desconto;

    @Override
    public double CalcularPrecoFinal() {
        return precoBase - (precoBase * desconto / 100);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPreco() {
        return precoBase;
    }

    public void setPreco(Double preco) {
        this.precoBase = preco;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

}
