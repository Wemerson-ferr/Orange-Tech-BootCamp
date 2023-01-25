package mod03.interfaces;

public class Calculadora implements OperacoesMat{

    @Override//Notação de sobrescrita, é obrigatorio ao usar uma interface
    public Double somar(Double val1, Double val2) {
        return val1+val2;
    }

    @Override
    public Double subtrair(Double val1, Double val2) {
        return val1-val2;
    }

    @Override
    public Double multiplicar(Double val1, Double val2) {
        return val1*val2;
    }

    @Override
    public Double dividir(Double val1, Double val2) {
        return val1/val2;
    }
    
}
