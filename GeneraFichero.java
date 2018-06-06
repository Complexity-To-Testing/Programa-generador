package tfgGroupID.tfgArtefactID;

import java.io.FileWriter;
import java.io.PrintWriter;

public  class  GeneraFichero {
	static void crear(String route, String nomFichero,String x ) {
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
        	String fin_route=route+"/"+nomFichero;
            fichero = new FileWriter(fin_route);
            pw = new PrintWriter(fichero);
                pw.println(x);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
	}
	
}
