package FilmLibrary.modelFx;

import FilmLibrary.Utils.FxmlUtils;
import FilmLibrary.Utils.exceptions.ApplicationException;
import FilmLibrary.dataBase.dao.CategoryDao;
import FilmLibrary.dataBase.dbBuilt.DbManager;
import FilmLibrary.dataBase.models.Category;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

/**
 * Created by Admin on 2017-03-28.
 */
public class CategoryModel {

    private ObservableList<CategoryFx> categoryList = FXCollections.observableArrayList();
    private ObjectProperty<CategoryFx> category = new SimpleObjectProperty<>();

    public void init() throws ApplicationException {
        CategoryDao categoryDao = new CategoryDao(DbManager.getConnectionSource());
        List<Category> categories = categoryDao.queryForAll(Category.class);
        initCategoryList(categories);
        DbManager.closeConnectionSource();
    }

    private void initCategoryList(List<Category> categories) {
        this.categoryList.clear();
        categories.forEach(c -> {
            CategoryFx categoryFx = FxmlUtils.ConverterCategoryFx(c);
            this.categoryList.add(categoryFx);
        });
    }


    public void saveCategoryInDataBase(String namePL, String nameEN,
                                       String gatunek, String firstShown,
                                       String country,String director, int evaluation) throws ApplicationException {

        CategoryDao categoryDao = new CategoryDao(DbManager.getConnectionSource());
        Category category = new Category();
        category.setNamePL(namePL);
        category.setNameEN(nameEN);
        category.setCategory(gatunek);
        category.setFirstShown(firstShown);
        category.setCountry(country);
        category.setDirector(director);
        category.setEvaluation(evaluation);
        categoryDao.creatOrUpdate(category);

        DbManager.closeConnectionSource();
        init();
    }

    public void deleteTitlePLById() throws ApplicationException {
        CategoryDao categoryDao = new CategoryDao((DbManager.getConnectionSource()));
        categoryDao.deleteById(Category.class, category.getValue().getId());
        DbManager.closeConnectionSource();
        init();
    }

    public void updateCategoryInDataBase() throws ApplicationException {
        CategoryDao categoryDao = new CategoryDao(DbManager.getConnectionSource());
        Category tempCategory = categoryDao.findById(Category.class, getCategory().getId());
        tempCategory.setNamePL(getCategory().getNamePL());
        categoryDao.creatOrUpdate(tempCategory);
        DbManager.closeConnectionSource();
        init();
    }

    public ObservableList<CategoryFx> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(ObservableList<CategoryFx> categoryList) {
        this.categoryList = categoryList;
    }

    public CategoryFx getCategory() {
        return category.get();
    }

    public ObjectProperty<CategoryFx> categoryProperty() {
        return category;
    }

    public void setCategory(CategoryFx category) {
        this.category.set(category);
    }
}
