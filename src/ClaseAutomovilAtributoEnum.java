public class ClaseAutomovilAtributoEnum {
    public static void main(String[] args) {

        Automovil auto = new Automovil("Subaru","Impreza");//primer objeto constructor
        //auto.setTipo(TipoAuto.HATCHBACK);
        auto.setCilindrada(2.0);//se modifica ya que en la clase tiene otro color y toma el nuevo

        auto.setColor(Color.BLANCO /*Automovil.COLOR_BLANCO*/ /*Blanco*/);//se modifica ya que en la clase tiene otro color y toma el nuevo
        System.out.println(auto.detalle());


        Automovil mazda = new Automovil("mazda","BT-50", Color.GRIS_OSCURO/*"Negro oxford"*/,5.0);//segundo objeto constructor
        mazda.setTipo(TipoAuto.PICKUP);
        System.out.println(mazda.detalle());


        Automovil nissan = new Automovil("Nissan","Navara", Color.GRIS_OSCURO /*"Gris oscuro"*/, 3.5,40);//tercer objeto constructor
        nissan.setTipo(TipoAuto.STATION_WAGON);
        System.out.println(nissan.detalle());

        TipoAuto Tipo = mazda.getTipo();
        System.out.println(Tipo.getNombre());
        System.out.println(Tipo.getDescripcion());




        switch (Tipo){
            case CONVERTIBLE:
                System.out.println("El automivil es desportivo y descapotable de dos puertas");
                break;
            case COUPE:
                System.out.println("Es un automovil pequeño de dos puertas y típicamente deportivo");
                break;
            case FURGON:
                System.out.println("Es un auto utilitario de transporte, de empresas");
                break;
            case HATCHBACK:
                System.out.println("Es un atomovil mediano compacto");
                break;
            case PICKUP:
                System.out.println("Es una camioneta de doble cabina");
                break;
            case SEDAN:
                System.out.println("Es un auto comun");
                break;
            case STATION_WAGON:
                System.out.println("Es un automovil mas grande, con maleta grande");
                break;
        }


        TipoAuto[] tipos = TipoAuto.values();
        for (TipoAuto ta : tipos) {
            System.out.print(ta + " => " + ta.getDescripcion() + "  " + ta.getNumeroPuertas() + "  ");
            System.out.println();
        }






























    }
}
