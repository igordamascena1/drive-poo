package calculadorageometrica;

import calculadorageometrica.DimensaoInvalidaException;
import calculadorageometrica.FormaGeometrica;

public class TrianguloRetangulo implements FormaGeometrica {
    private final double base;
    private final double altura;

    public TrianguloRetangulo(double base, double altura) throws DimensaoInvalidaException {
        if (base <= 0 || altura <= 0) {
            throw new DimensaoInvalidaException("Base ou altura invalida: base=" + base + ", altura=" + altura + ". Devem ser maiores que zero.");
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(base * base + altura * altura);
        return base + altura + hipotenusa;
    }

    @Override
    public String getNomeForma() {
        return "Triangulo Retangulo";
    }

    @Override
    public String getDetalhesDimensoes() {
        return "Base: " + base + ", Altura: " + altura;
    }
}

