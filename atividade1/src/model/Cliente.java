package model;

public class Cliente {
    private String nome;
    private String end;
    private String lat;
    private String lng;
    
    public void setNome(String nome){
        this.nome=nome;       
    }
    public void setEnd(String end){
        this.end=end;
    }    
    public void setLat(String lat){
        this.lat=lat;
    }
    public void setLng(String lng){
        this.lng=lng;
    }
    
    public String getNome(){
        return nome;
    }
    public String getEnd(){
        return end;
    }
    public String getLat(){
        return lat;
    }
    public String getLng(){
        return lng;
    }
     
}
