package model;

import java.util.ArrayList;

public class Churrasco {
    private String end;
    private Assador assador;
    private ArrayList<Pessoa> participante;

    public Churrasco(String end, Assador assador) {
        this.end = end;
        this.assador = assador;
        
    }

    public Churrasco() {
    }
    
    public void entrarParticipantes(Pessoa part){
        this.participante.add(part);
    }
    
    

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Assador getAssador() {
        return assador;
    }

    public void setAssador(Assador assador) {
        this.assador = assador;
    }

    public ArrayList<Pessoa> getParticipante() {
        return participante;
    }

    public void setParticipante(ArrayList<Pessoa> participante) {
        this.participante = participante;
    }
    
    
}
