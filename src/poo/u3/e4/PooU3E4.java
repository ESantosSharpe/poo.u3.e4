package poo.u3.e4;

import java.util.ArrayList;

public class PooU3E4 {

    public static void main(String[] args) {
        ArrayList<String> nombres=new ArrayList<String>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Pablo");
        nombres.add("José");
        nombres.add("Paco");
        nombres.add("María");
        nombres.add("Camila");
        nombres.add("Juana");
        nombres.add("Sofía");
        nombres.add("Luz");   
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
    }
    
}
