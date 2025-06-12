package calculadorageometrica;

import calculadorageometrica.DimensaoInvalidaException;
import calculadorageometrica.FormaGeometrica;

public class Retangulo implements FormaGeometrica {
    private final double base;
    private final double altura;

    public Retangulo(double base, double altura) throws DimensaoInvalidaException {
        if (base <= 0 || altura <= 0) {
            throw new DimensaoInvalidaException("Base ou altura invalida: base=" + base + ", altura=" + altura + ". Devem ser maiores que zero.");
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String getNomeForma() {
        return "Retangulo";
    }

    @Override
    public String getDetalhesDimensoes() {
        return "Base: " + base + ", Altura: " + altura;
    }
}



