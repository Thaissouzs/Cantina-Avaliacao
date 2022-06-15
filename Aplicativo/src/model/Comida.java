package model;
import javafx.beans.property.SimpleStringProperty;

public class Comida {
    private SimpleStringProperty lancheManha = new SimpleStringProperty();
    private SimpleStringProperty almoco = new SimpleStringProperty();
    private SimpleStringProperty lancheTarde = new SimpleStringProperty();

    public Comida(){

    }
    public Comida(String lancheManha, String almoco, String lancheTarde){
        this.lancheManha.set(lancheManha);
        this.almoco.set(almoco);
        this.lancheTarde.set(lancheTarde);
    }
    public String getLancheManha(){
        return lancheManha.get();
    }
    public void setLancheManha(String lancheManha){
        this.lancheManha.set(lancheManha);
    }
    public String getAlmoco(){
        return almoco.get();
    }
    public void setAlmoco(String almoco){
        this.almoco.set(almoco);
    }
    public String getLancheTarde(){
        return lancheTarde.get();
    }
    public void setLancheTarde(String lancheTarde){
        this.lancheTarde.set(lancheTarde);
    }
}
