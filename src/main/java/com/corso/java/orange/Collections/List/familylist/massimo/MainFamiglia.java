package com.corso.java.orange.Collections.List.familylist.massimo;

import java.util.ArrayList;
import java.util.List;

public class MainFamiglia {
    public static void main(String[] args) {

        List<Persona> popolazione = new ArrayList<>();
        creaPopolazione(popolazione);
        stampaLista(popolazione);

        List<Famiglia> famiglia = creaFamiglie(popolazione);
        stampaFamiglie(famiglia);

    }

    public static List<Famiglia> creaFamiglie(List<Persona> popolazione){
        List<Persona> maschi = new ArrayList<>();
        List<Persona> femmine = new ArrayList<>();
        for(Persona persona : popolazione){
            if(persona.getSesso()== ('M')) {
                maschi.add(persona);
            } else{
                femmine.add(persona);
            }
        }

        List<Famiglia> famiglie = new ArrayList<>();
            for(int i=0; i<maschi.size(); i++){
                Persona marito = maschi.get(i);
                Persona moglie = femmine.get(i);
                if(marito != null && moglie != null){
                    famiglie.add(new Famiglia(marito, moglie));
                }
            }
        return famiglie;
    }

    private static void creaPopolazione(List<Persona> popolazione) {
        popolazione.add(new Persona("Massimo",'M',"SCIMSM90"));
        popolazione.add(new Persona("Tizio",'M',"NLSTZO90"));
        popolazione.add(new Persona("Caio",'M',"NLSCIO"));
        popolazione.add(new Persona("Laura",'F',"AAALRA95"));
        popolazione.add(new Persona("Gina",'F',"NLSGNA90"));
        popolazione.add(new Persona("Tina",'F',"NLSTNA88"));

    }
    public static void stampaLista(List<Persona> lista){
        for( Persona persona : lista){
            System.out.println("Nome: "+persona.getNome()+" - Genere: "+persona.getSesso()+" - CF: "+persona.getCf());
        }
    }
    public static void stampaFamiglie(List<Famiglia> famiglie){
        for(Famiglia famiglia : famiglie){
            System.out.println("\nFAMIGLIA : "+famiglia.getMarito().getNome()+ " - "+famiglia.getMoglie().getNome());
        }
    }
}

/*
Iterator<Persona> popolazioneIterator = popolazione.listIterator();
while(popolazioneIterator.hasNext()){
Persona persona = popolazioneIterator.next();
if(persona.getGenere().equals('M')){
Famiglia famiglia = new Famiglia();
famiglia.setMarito(persona);
popolazioneIterator.remove();
famiglie.add(famiglia);
}
}
 */