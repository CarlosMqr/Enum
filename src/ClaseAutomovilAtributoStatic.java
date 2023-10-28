public class ClaseAutomovilAtributoStatic {
    public static void main(String[] args) {
    Automovil auto = new Automovil("Subaru","Impreza");//primer objeto constructor
        auto.setTipo(TipoAuto.HATCHBACK);


       // Automovil.setColorPatente(Color.ROJO/*"Verde"*/);//se modifica en el main
        Automovil.setCapacidadTanqueEstatico(70);

        auto.setCilindrada(2.0);//se modifica ya que en la clase tiene otro color y toma el nuevo
        auto.setColor(Color.BLANCO /*Automovil.COLOR_BLANCO*/ /*"Blanco"*/);//se modifica ya que en la clase tiene otro color y toma el nuevo
        System.out.println(auto.detalle());
        System.out.println("kilometros por litro auto " + auto.calcularConsumo(300,60));
        System.out.println("kilometros por litro auto static " + auto.calcularConsumoEstatico(300,60));





        Automovil mazda = new Automovil("mazda","BT-50", Color.GRIS_OSCURO/*"Negro oxford"*/,5.0);//segundo objeto constructor
        mazda.setTipo(TipoAuto.PICKUP);
        System.out.println(mazda.detalle());
        System.out.println("kilometros por litro mazda " + mazda.calcularConsumo(300,60));
        System.out.println("kilometros por litro mazda static " + mazda.calcularConsumoEstatico(300,60));


        Automovil nissan = new Automovil("Nissan","Navara", Color.GRIS_OSCURO /*"Gris oscuro"*/, 3.5,40);//tercer objeto constructor
        nissan.setTipo(TipoAuto.PICKUP);
        System.out.println(nissan.detalle());
        System.out.println("kilometros por litro de nissan " + nissan.calcularConsumo(300,60));
        System.out.println("kilometros por litro nissan static " + nissan.calcularConsumoEstatico(300,60));



        //System.out.println("Color patente: " + Automovil.getColorPatente());
        System.out.println("kilometros por litro static " + Automovil.calcularConsumoEstatico(300,60));



        System.out.println("Velocidad maxima en carretera " + Automovil.VELOCIDAD_MAX_CARRETERA);
        //la constante VELOCIDAD_MAX_CARRETERA pertenece a la clase y no al objeto
        //forma para imprimirlo
        System.out.println("Velocidad maxima en ciudad " + Automovil.VELOCIDAD_MAX_CIUDAD);

























    }
}
