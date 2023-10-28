public class ClaseAutomovil {
    public static void main(String[] args) {
    /*Automovil auto = new Automovil("Subaru","Impreza");//primer objeto


         *//*
        se puede asignar nombre al fabricante desde el método main de esta forma
        de igual forma para las demás características o variables de la clase
         *//*
        *//*auto.fabricate = "Subaru";
        auto.modelo = "Impreza";
        auto.cilindrada = 2.0;
        auto.color = "Negro";*//*// se modificó el color, ya que en la clase tiene el color "gris oscuro"
        //las características se obtuvieron de la clase Automovil

        //auto.setFabricate("Subaru");
        //auto.setModelo("Impreza");
        auto.setCilindrada(2.0);
        //auto.setColor("Blanco");
        //getes y setes
        System.out.println(auto.acelerar(3000));
        System.out.print(auto.frenar());
        System.out.println(auto.detalle());
                        //auto.detalle();// con este método podemos imprimir lo que contiene las variables de la clase Automovil
                       // solo se manda a llamar
                       // es otra opcion



        Automovil mazda = new Automovil("mazda","BT-50","Negro oxford",5.0);//segundo objeto
        System.out.println(mazda.detalle());
        System.out.println(mazda.acelerarFrenar(4000));
        System.out.println("kilometros por litro " + mazda.calcularConsumo(300,0.6f));
        System.out.println("kilometros por litro " + mazda.calcularConsumo(300,60));
        *//*mazda.fabricate = "mazda";
        mazda.modelo = "BT-50";
        mazda.cilindrada = 5.0;
        mazda.color = "Negro oxford";
        se reasignó valores desde el main*//*
        //las características se obtuvieron de la clase Automovil
        
        //mazda.setFabricate("mazda");
        //mazda.setModelo("BT-50");
        //mazda.setCilindrada(5.0);
        //mazda.setColor("Negro oxford");
        //getes y setes


        Automovil nissan = new Automovil("Nissan","Navara", "Gris oscuro", 3.5, 50);//constructor
        System.out.println(nissan.detalle());
        System.out.println("kilometros por litro " + nissan.calcularConsumo(300,60));


        System.out.println(nissan);
        System.out.println(nissan.toString());

        Automovil nissan2 = new Automovil("Nissan","Navara", "Gris oscuro", 3.5, 50);

        System.out.println("es igual? " + (nissan == nissan2));
        System.out.println("es igual? (equals) " + nissan.equals(nissan2));

        Automovil carro = new Automovil();

        System.out.println(nissan.equals(carro));
*/














    }
}
