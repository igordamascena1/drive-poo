package calculadorageometrica;

import calculadorageometrica.DimensaoInvalidaException;
import calculadorageometrica.FormaGeometrica;

public class Quadrado implements FormaGeometrica {
    private final double lado;

    public Quadrado(double lado) throws DimensaoInvalidaException {
        if (lado <= 0) {
            throw new DimensaoInvalidaException("Lado invalido: " + lado + ". O lado deve ser maior que zero.");
        }
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public String getNomeForma() {
        return "Quadrado";
    }

    @Override
    public String getDetalhesDimensoes() {
        return "Lado: " + lado;
    }
}
