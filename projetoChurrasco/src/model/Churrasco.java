package model;

import java.util.ArrayList;

public class Churrasco {

    private String end;
    private String nome;
    private String edicao;
    private ArrayList<Pessoa> galera;
    private Assador assador;
        
    public Churrasco(String end, String nome, 
                     String edicao, 
                     ArrayList<Pessoa> galera) {
        
        this.end = end;
        this.nome = nome;
        this.edicao = edicao;
        this.galera = galera;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public ArrayList<Pessoa> getGalera() {
        return galera;
    }

    public void setGalera(ArrayList<Pessoa> galera) {
        this.galera = galera;
    }
    
    
    public Assador getAssador() {
        return assador;
    }

    public void setAssador(Assador assador) {
        this.assador = assador;
    }
    
    public void servirChurras(){
       int k=0, cont=0;
        float y=0, maior=1000;
        while(cont< this.galera.size()){           
            for(int i =0; i<this.galera.size();i++){
                if(this.galera.get(i).getNivelFome()>y && this.galera.get(i).getNivelFome()<maior){
                    k = i;
                    y = this.galera.get(i).getNivelFome();                    
                    
                }                
            }
            maior = y;
            y=0;            
            
            System.out.println(this.galera.get(k).getNome());
            cont++;
        } 
       
       
       
    }
    
}
