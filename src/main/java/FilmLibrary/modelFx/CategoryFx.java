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
    private StringProperty category = new SimpleStringProperty();
    private IntegerProperty firstShown = new SimpleIntegerProperty();
    private StringProperty country = new SimpleStringProperty();
    private StringProperty director = new SimpleStringProperty();
    private StringProperty evaluation = new SimpleStringProperty();

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

    public String getCategory() {
        return category.get();
    }

    public StringProperty categoryProperty() {
        return category;
    }

    public void setCategory(String category) {
        this.category.set(category);
    }

    public int getFirstShown() {
        return firstShown.get();
    }

    public IntegerProperty firstShownProperty() {
        return firstShown;
    }

    public void setFirstShown(int firstShown) {
        this.firstShown.set(firstShown);
    }

    public String getCountry() {
        return country.get();
    }

    public StringProperty countryProperty() {
        return country;
    }

    public void setCountry(String country) {
        this.country.set(country);
    }

    public String getDirector() {
        return director.get();
    }

    public StringProperty directorProperty() {
        return director;
    }

    public void setDirector(String director) {
        this.director.set(director);
    }

    public String getEvaluation() {
        return evaluation.get();
    }

    public StringProperty evaluationProperty() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation.set(evaluation);
    }

    @Override
    public String toString() {
        return namePL.getValue();
    }

}
