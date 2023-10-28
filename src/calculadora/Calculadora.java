package calculadora;

public class Calculadora {
    private int valorA;
    private int valorB;
    private int tipoOperacion;

    public int getValorA(){//leer
        return this.valorA;
    }
    public void setValorA(int valorA){//modificar
        this.valorA = valorA;
    }

    public int getValorB(){//leer
        return this.valorB;
    }

    public void setValorB(int valorB){//modificar
        this.valorB = valorB;
    }

    public int getTipoOperacion(){//leer
        return this.tipoOperacion;
    }
    public void setTipoOperacion(int tipoOperacion){//modificar
        this.tipoOperacion = tipoOperacion;
    }


    public String calculadora(int a, int b){
        String resultado = "";
            switch (this.tipoOperacion){
                case 1:
                    resultado = "El resultado de la suma es: " + (a + b);
                    //System.out.print("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = "El resultado de la resta es: " + (a - b);
                    //System.out.print("El resultado de la suma es: " + resultado);
                    break;
                case 3:
                    resultado = "El resultado de la multiplicacion es: " + (a * b);
                    // System.out.print("El resultado de la suma es: " + resultado);
                    break;
                case 4:
                    resultado = "El resultado de la divicion es: " + (a/ b);
                    //System.out.print("El resultado de la suma es: " + resultado);
                    break;
            }
        return resultado;
    }
}
