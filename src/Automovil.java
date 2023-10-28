public class Automovil {
    private int id;
    private String fabricate ;//= "Carlos Mendoza Hernandez"
    private String modelo ; //= "nissan"

    private Color color = Color.GRIS_OSCURO;// Enumerodor
    //es del tipo color y necesita getter and setter
    //private String color = "gris oscuro"; //
    private double cilindrada;

    private int capacidadTanque = 40;

    private static Color colorPatente = Color.NARANJA;
    // si es static sus get and set también son static
    // prívate static String colorPatente = "Naranja";
    /* es un atributo estático y por defecto todos los objetos
                                              son color naranja por ser un atributo
                                                                          static
                                               además para un atributo static se debe crear
                                               un método static                           */

    private static int capacidadTanqueEstatico = 40;
    // es un atributo estático
    //sus get and set también son static
    //sus métodos son static

    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;// no se pueden modificar solo leer
    //son public y static
    //son de la clase y no del objeto
    public static final Integer VELOCIDAD_MAX_CIUDAD = 100;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
     static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS_OSCURO = "Gris Oscuro";

    private TipoAuto tipo;// Enumerodor

    ////////////////////////////// Constructores /////////////////////////////////////////////////
    public Automovil() {//1 constructor
        this.id = ++ ultimoId;//forma de agregar id auto incremental a las instancias de los objetos
    }

    public Automovil(String fabricate, String modelo) {//2 constructor
        this();//llama al primer constructor
        this.fabricate = fabricate;
        this.modelo = modelo;
    }

    public Automovil(String fabricate, String modelo, /*String*/Color color) {//3 constructor
        this(fabricate,modelo);//llama al segundo constructor
        this.color = color;
    }

    public Automovil(String fabricate, String modelo, /*String*/ Color color, double cilindrada) {//4 constructor
        this(fabricate,modelo,color);//llama al tercer constructor
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricate, String modelo, /*String*/Color color, double cilindrada, int capacidadTanque) {
        this(fabricate,modelo,color,cilindrada);//llama al cuarto constructor
        this.capacidadTanque = capacidadTanque;
    }
    ///////////////////////////////// Getters and Setters ///////////////////////////////////////
    public int getId(){// leer
        return this.id;
    }

    public void setId(int id){// modificar
        this.id = id;
    }
    public String getFabricate(){//leer
        return this.fabricate;
    }
    public void setFabricate(String fabricate){// modifica
        this.fabricate = fabricate;
    }


    public String getModelo(){//leer
        return this.modelo;
    }
    public void setModelo(String modelo){// modifica
        this.modelo = modelo;
    }


    public Color /*String*/ getColor(){//leer
        return this.color;
    }
    public void setColor(Color/*String*/ color){// modificar
        this.color = color;
    }


    public double getCilindrada(){//leer
        return this.cilindrada;
    }
    public void setCilindrada(double cilindrada){// modificar
        this.cilindrada = cilindrada;
    }


    public int getCapacidadTanque(){//leer
        return this.capacidadTanque;
    }
    public void setCapacidadTanque(int capacidadTanque){// modificar
        this.capacidadTanque = capacidadTanque;
    }

    public static Color/*String*/ getColorPatente() {//leer
        return colorPatente;
    }

    public static void setColorPatente(Color/*String*/ colorPatente) {//modificar
        Automovil.colorPatente = colorPatente;//como es static se inicia con el objeto
    }

    public static int getCapacidadTanqueEstatico() {
        return capacidadTanqueEstatico;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    public TipoAuto getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoAuto tipo) {
        this.tipo = tipo;
    }

    ////////////////////////////////////// Métodos ////////////////////////////////////////////////

   
    public String detalle(){//sirve para mostrar los valores de los atributos
        StringBuilder sb = new StringBuilder();
        sb.append("ID:"+ this.id);sb.append("\n"+ this.fabricate);  //el this hace referencia a la variable de la misma clase
        sb.append("\n" + this.modelo);
        if(this.getTipo() != null){
            sb.append("\nCaracterizticas: "+ this.getTipo().getDescripcion());
        }
        sb.append("\n"+ this.color);
        sb.append("\n" + colorPatente);// se invoca solo con el nombre porque no pertenece al objeto
        sb.append("\n"+ this.cilindrada);
        return sb.toString();
    }

    public String acelerar(int rpm){//metodo acelerar
        return "el auto " + this.fabricate + " acelerando a " + rpm + " rpm";

    }

    public String frenar(){// metodo acelerar

        return this.fabricate + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm){//metodo que combina acelerar y frenar
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();

        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return  km/(capacidadTanque*porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return  km/(capacidadTanque*(porcentajeBencina/100f));
    }

    public static float calcularConsumoEstatico(int km, int porcentajeBencina){
        return  km/(Automovil.capacidadTanqueEstatico*(porcentajeBencina/100f));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Automovil))
            return false;
        Automovil a = (Automovil)obj;//se hace un cast
        return (this.fabricate != null && this.modelo != null
                && this.fabricate.equals(a.getFabricate())
                && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "ID= " + id + '\'' +
                "fabricate='" + fabricate + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }
}
