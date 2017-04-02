package FilmLibrary.controllers;

import FilmLibrary.Utils.*;
import FilmLibrary.Utils.exceptions.ApplicationException;
import FilmLibrary.modelFx.CategoryFx;
import FilmLibrary.modelFx.CategoryModel;
import javafx.fxml.FXML;
import javafx.scene.control.*;


/**
 * Created by Admin on 2017-03-27.
 */
public class MainBorderPaneControllers {

    @FXML
    private Button addFilm;
    @FXML
    private Button editFilm;
    @FXML
    private Button deleteFilm;
    @FXML
    private ComboBox<CategoryFx> titlePLComboBox;
    private CategoryModel categoryModel;
    @FXML
    private TextField titlePLTextField;
    @FXML
    private TextField titleENTextField;
    @FXML
    private TextField categoryTextField;
    @FXML
    private DatePicker firstShownTextField;
    @FXML
    private TextField countryTextField;
    @FXML
    private TextField directorTextField;
    @FXML
    private TextField evaluationTextField;

    @FXML
    public void initialize() {
        this.categoryModel = new CategoryModel();
        try {
            this.categoryModel.init();
        } catch (ApplicationException e) {
            DialogsUtils.errorDialog(e.getMessage());
        }
        this.titlePLComboBox.setItems(this.categoryModel.getCategoryList());
        this.deleteFilm.disableProperty().bind(this.categoryModel.categoryProperty().isNull());
        this.editFilm.disableProperty().bind((this.categoryModel.categoryProperty().isNull()));
        initBindings();
    }


    public void addFilmOnAction() {
        try {
            categoryModel.saveCategoryInDataBase(
                    titlePLTextField.getText(),
                    titleENTextField.getText(),
                    categoryTextField.getText(),
                    firstShownTextField.getValue().toString(),
                    countryTextField.getText(),
                    directorTextField.getText(),
                    Integer.parseInt(evaluationTextField.getText()));

            titlePLTextField.clear();
            titleENTextField.clear();
            categoryTextField.clear();
            firstShownTextField.setValue(null);
            countryTextField.clear();
            directorTextField.clear();
            evaluationTextField.clear();
        } catch (ApplicationException e) {
            DialogsUtils.errorDialog(e.getMessage());
        }
    }

    private void initBindings() {
        addFilm.disableProperty().bind(titlePLTextField.textProperty().isEmpty());
        addFilm.disableProperty().bind(categoryTextField.textProperty().isEmpty());
        addFilm.disableProperty().bind(firstShownTextField.promptTextProperty().isEmpty());
        addFilm.disableProperty().bind(evaluationTextField.textProperty().isEmpty());
    }


    public void editFilmOnAction() {
        String newValue = DialogsUtils.editDialog(this.categoryModel.getCategory().getNamePL());
        if (newValue != null) {
            this.categoryModel.getCategory().setNamePL(newValue);
            try {
                this.categoryModel.updateCategoryInDataBase();
            } catch (ApplicationException e) {
                DialogsUtils.errorDialog(e.getMessage());
            }
        }
    }

    public void deleteFilmOnAction() {
        try {
            this.categoryModel.deleteTitlePLById();
        } catch (ApplicationException e) {
            DialogsUtils.errorDialog(e.getMessage());
        }
    }

    public void comboBoxOnAction() {
        this.categoryModel.setCategory(this.titlePLComboBox.getSelectionModel().getSelectedItem());
    }
}
