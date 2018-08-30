package model;

public class Churrasco {
    private String end;
    private Assador assador;
    private Pessoa participante;

    public Churrasco(String end, Assador assador, Pessoa participante) {
        this.end = end;
        this.assador = assador;
        this.participante = participante;
    }

    public Churrasco() {
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

    public Pessoa getParticipante() {
        return participante;
    }

    public void setParticipante(Pessoa participante) {
        this.participante = participante;
    }
    
    
}
