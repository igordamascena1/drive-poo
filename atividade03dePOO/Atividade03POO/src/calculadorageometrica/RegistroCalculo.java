package calculadorageometrica;

import calculadorageometrica.FormaGeometrica;

public class RegistroCalculo {
    private final FormaGeometrica forma;
    private final double areaCalculada;
    private final double perimetroCalculado;

    public RegistroCalculo(FormaGeometrica forma) {
        if (forma == null) {
            throw new IllegalArgumentException("Forma nao pode ser nula para registrar o calculo.");
        }
        this.forma = forma;
        this.areaCalculada = forma.calcularArea();
        this.perimetroCalculado = forma.calcularPerimetro();
    }

    public FormaGeometrica getForma() {
        return forma;
    }

    public double getAreaCalculada() {
        return areaCalculada;
    }

    public double getPerimetroCalculado() {
        return perimetroCalculado;
    }
}



