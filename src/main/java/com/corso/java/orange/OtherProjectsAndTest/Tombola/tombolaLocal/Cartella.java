package com.corso.java.orange.OtherProjectsAndTest.Tombola.tombolaLocal;

import java.util.*;

public class Cartella {

    private int nrCartella;
    private List<List<Integer>> righe;
    private List<SegmentoColonna> rangeList;

    public Cartella(int nrCartella) {
        this.rangeList = getRangeList();
        righe = new ArrayList<>();
        for(int r=0; r<3; r++) {
            righe.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
        }
        this.nrCartella = nrCartella;
        generaCartella();
    }

    private List<SegmentoColonna> getRangeList() {
        List<SegmentoColonna> rangeList = new ArrayList<>();
        rangeList.add(new SegmentoColonna(1, 9));
        rangeList.add(new SegmentoColonna(10, 19));
        rangeList.add(new SegmentoColonna(20, 29));
        rangeList.add(new SegmentoColonna(30, 39));
        rangeList.add(new SegmentoColonna(40, 49));
        rangeList.add(new SegmentoColonna(50, 59));
        rangeList.add(new SegmentoColonna(60, 69));
        rangeList.add(new SegmentoColonna(70, 79));
        rangeList.add(new SegmentoColonna(80, 90));
        return rangeList;
    }


    private void generaCartella() {
        for (int colonna=0 ; colonna<9 ; colonna++) {
            gerneraColonna(rangeList.get(colonna).getMin(), rangeList.get(colonna).getMax(), colonna);
        }
        int posizione;
        for(List<Integer> riga: righe) {
            List<Integer> exclusions = new ArrayList<>();
            for(int spazi=1; spazi<=4; spazi++) {
                posizione = Utility.calcRandomByRange(0 , 8, exclusions);
                exclusions.add(posizione);
                riga.set(posizione, 0);
            }
        }
    }

    public void stampaCartella() {
        System.out.println("====CARTELLA N° " + (nrCartella) + "====");
        for(List<Integer> riga: righe) {
            for(Integer cella: riga) {
                System.out.print((cella==0? " --": cella) + " ");
            }
            System.out.println();
        }
        System.out.println("=====================");
    }


    /**
     * genera i numeri di una colonna della cartella
     *
     * @param min
     * @param max
     * @param colonna
     */
    private void gerneraColonna(int min, int max, int colonna) {
        int valore;
        List<Integer> exclusions = new ArrayList<>();

        for(int r=0; r<3; r++) {
            valore = Utility.calcRandomByRange(min, max, exclusions);
            righe.get(r).set(colonna, valore);
            exclusions.add(valore);
        }
    }


    public Map<Integer, List<Integer>> elaboraVincitaSuCartella(TipoVincita vincitaDaVerificare, List<Integer> nrEstratti) {
        Map<Integer, List<Integer>> result = new HashMap<>();
        List<Integer> numeriRiscontrati = new ArrayList<>();
        int numeroOccorrenze = vincitaDaVerificare.getNumeroOccorrenze();
        for (List<Integer> riga : righe) {
            for (Integer cella : riga) {
                if (nrEstratti.contains(cella)) {
                    numeriRiscontrati.add(cella);
                    if (numeriRiscontrati.size()==numeroOccorrenze) {
                        result.put(righe.indexOf(riga), numeriRiscontrati);
                        break;
                    }
                }
            }
        }
        return result;
    }

    public void rilevaVincite(List<TipoVincita> vinciteDaVerificare, List<Integer> nrEstratti) {
        // cercare quelle vincite
        for(TipoVincita tipoVincita: vinciteDaVerificare) {
            this.elaboraVincitaSuCartella(tipoVincita, nrEstratti);
        }
        // stamparle
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cartella cartella = (Cartella) o;
        return nrCartella == cartella.nrCartella;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrCartella);
    }

    public int getNrCartella() {
        return nrCartella;
    }
}
