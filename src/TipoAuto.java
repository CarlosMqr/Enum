public enum TipoAuto {
    SEDAN("Sedan", "Mediono" , 4),
    STATION_WAGON("Station Wagon", "Auto grande",4),
    HATCHBACK("Hatchback", "Auto compacto",4),
    PICKUP("Pickup","Camioneta",4),
    COUPE("Coupe","Auto pequeño",2),
    CONVERTIBLE("Convertible","Auto deportivo",2),
    FURGON("Furgon","Auto utilitario",4);

    private final String nombre;
    private final String descripcion;
    private final int numeroPuertas;

    ///////////////////// CONSTRUCTORES /////////////////////////////

    TipoAuto(String nombre, String descripcion, int numeroPuertas){//Constructor
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuertas = numeroPuertas;
    }

    //////////////////// GETTERS /////////////////////////

    public String getNombre(){//leer
        return this.nombre;
    }

    public String getDescripcion(){//leer
        return this.descripcion;
    }

    public int getNumeroPuertas(){//leer
        return this.numeroPuertas;
    }


}
