package calculadorageometrica;

import calculadorageometrica.DimensaoInvalidaException;
import calculadorageometrica.FormaGeometrica;

public class Circulo implements FormaGeometrica {
    private final double raio;

    public Circulo(double raio) throws DimensaoInvalidaException {
        if (raio <= 0) {
            throw new DimensaoInvalidaException("Raio invalido");
        }
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String getNomeForma() {
        return "Circulo";
    }

    @Override
    public String getDetalhesDimensoes() {
        return "Raio: " + raio;
    }
}