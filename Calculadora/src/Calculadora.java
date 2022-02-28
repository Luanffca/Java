class Calculadora{
    double resultado;
    double operador1, operador2;
    double mrc, mmais, mmenos;
    void soma(){
        resultado = operador1 + operador2;
    }
    void subtrair(){
        resultado = operador1 - operador2;
    }
    void multiplicar(){
        resultado = operador1 * operador2;
    }
    void dividir(){
        resultado = operador1 / operador2;
    }
    void raiz(){
        resultado = Math.sqrt(operador1);
    }
    void pocentagem(){
        resultado = operador1 / 100;
    }
    void MRC(){
        resultado = mmais;
    }
    void Mmais(){
        mmais = operador1;
    }
    void Mmenos(){
        mrc = mmais - mmenos;
    }
}