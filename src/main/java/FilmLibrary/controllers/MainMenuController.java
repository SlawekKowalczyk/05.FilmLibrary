package FilmLibrary.controllers;

import FilmLibrary.Utils.DialogsUtils;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.control.ButtonType;

import java.util.Optional;

/**
 * Created by Admin on 2017-03-28.
 */
public class MainMenuController {

    public void closeApplicationOnAction() {
        Optional<ButtonType> result = DialogsUtils.confirmationExitDialog();
        if (result.get() == ButtonType.OK) {
            Platform.exit();
            System.exit(0);
        }
    }

    public void setCaspianOnAction() {
        Application.setUserAgentStylesheet(Application.STYLESHEET_CASPIAN);
    }

    public void setModenaOnAction() {
        Application.setUserAgentStylesheet(Application.STYLESHEET_MODENA);
    }

    public void aboutOnAction() {
        DialogsUtils.aboutApplicationDialog();
    }
}
