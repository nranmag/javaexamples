package clases;

import java.util.StringTokenizer;

public class Respuestas {

    String[] respuestas = {
        "Setup Ins","FSP, Ethernet, Serial, SAN, 10GB","Informarle al coordinador de Pruebas","Final Build, Rack Merge, Crib","140, 463, 105, 170, 141"
    };
    
    String[] radioR = {
        "MAC File.Log[Sys].Error Info.Setup Ins",
        "Upic, SMP, FSP.Clock Cable, Ethernet, FSP.SAS, SPCN.FSP, Ethernet, Serial, SAN, 10GB",
        "Regresarlo a ensamble.Reportarlo al área de Calidad.Informarle al coordinador de Pruebas.Otro",
        "Early Build, Calidad.CSC, Final Build, RackMerge, C&C.Final Build, Rack Merge, Crib.Otro",
        "105, 111, 140, 340.140, 463, 105, 170, 141.170, 150, 60, 320.105, 140, 141, 111, 50"
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String getSelected(int posicion){
        return radioR[posicion];
    }
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); //obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,".");
        return s2;
    }
}
