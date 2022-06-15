package model;
import javafx.beans.property.SimpleStringProperty;

public class Salas {
    private SimpleStringProperty segunda = new SimpleStringProperty();
    private SimpleStringProperty terca = new SimpleStringProperty();
    private SimpleStringProperty quarta = new SimpleStringProperty();
    private SimpleStringProperty quinta = new SimpleStringProperty();
    private SimpleStringProperty sexta = new SimpleStringProperty();
    
    public Salas(){

    }
    public Salas(String segunda, String terca, String quarta, String quinta, String sexta){
        this.segunda.set(segunda);
        this.terca.set(terca);
        this.quarta.set(quarta);
        this.quinta.set(quinta);
        this.sexta.set(sexta);
    }
    public String getSegunda(){
        return segunda.get();
    }
    public void setSegunda(String segunda){
        this.segunda.set(segunda);
    }
    public String getTerca(){
        return terca.get();
    }
    public void setTerca(String terca){
        this.terca.set(terca);
    }
    public String getQuarta(){
        return quarta.get();
    }
    public void setQuarta(String quarta){
        this.quarta.set(quarta);
    }
    public String getQuinta(){
        return quinta.get();
    }
    public void setQuinta(String quinta){
        this.quinta.set(quinta);
    }
    public String getSexta(){
        return sexta.get();
    }
    public void setSexta(String sexta){
        this.sexta.set(sexta);
    }
}

