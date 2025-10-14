package Interfaces.exercicio5;

public class ProdutoFisico implements Calculavel{
    private String nome;
    private Double precoBase;
    private Double desconto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(Double precoBase) {
        this.precoBase = precoBase;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    @Override
    public double CalcularPrecoFinal() {
        return precoBase - (precoBase * desconto / 100);
    }
}
