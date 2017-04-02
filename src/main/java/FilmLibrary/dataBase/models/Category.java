package FilmLibrary.dataBase.models;


import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Admin on 2017-03-27.
 */
@DatabaseTable(tableName = "Category")
public class Category implements BaseModel {
    public Category() {
    }

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = "Title PL", canBeNull = true, unique = true)
    private String namePL;
    @DatabaseField(columnName = "Title EN")
    private String nameEN;
    @DatabaseField(columnName = "Category")
    private String category;
    @DatabaseField(columnName = "First shown")
    private String firstShown;
    @DatabaseField(columnName = "Country")
    private String country;
    @DatabaseField(columnName = "Director")
    private String director;
    @DatabaseField(columnName = "Evaluation", dataType = DataType.INTEGER)
    private int evaluation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePL() {
        return namePL;
    }

    public void setNamePL(String namePL) {
        this.namePL = namePL;
    }

    public String getNameEN() {
        return nameEN;
    }

    public void setNameEN(String nameEN) {
        this.nameEN = nameEN;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFirstShown() {
        return firstShown;
    }

    public void setFirstShown(String firstShown) {
        this.firstShown = firstShown;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        this.evaluation = evaluation;
    }
}
