package FilmLibrary.modelFx;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by Admin on 2017-03-28.
 */
public class CategoryFx {

    private IntegerProperty id = new SimpleIntegerProperty();
    private StringProperty namePL = new SimpleStringProperty();
    private StringProperty nameEN = new SimpleStringProperty();
    private StringProperty gatunek = new SimpleStringProperty();
    private IntegerProperty rokProdukcji = new SimpleIntegerProperty();
    private StringProperty ocena = new SimpleStringProperty();

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getNamePL() {
        return namePL.get();
    }

    public StringProperty namePLProperty() {
        return namePL;
    }

    public void setNamePL(String namePL) {
        this.namePL.set(namePL);
    }

    public String getNameEN() {
        return nameEN.get();
    }

    public StringProperty nameENProperty() {
        return nameEN;
    }

    public void setNameEN(String nameEN) {
        this.nameEN.set(nameEN);
    }

    public String getGatunek() {
        return gatunek.get();
    }

    public StringProperty gatunekProperty() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek.set(gatunek);
    }

    public int getRokProdukcji() {
        return rokProdukcji.get();
    }

    public IntegerProperty rokProdukcjiProperty() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji.set(rokProdukcji);
    }

    public String getOcena() {
        return ocena.get();
    }

    public StringProperty ocenaProperty() {
        return ocena;
    }

    public void setOcena(String ocena) {
        this.ocena.set(ocena);
    }

    @Override
    public String toString() {
        return namePL.getValue();
    }

}
