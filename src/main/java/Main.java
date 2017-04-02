import FilmLibrary.Utils.FxmlUtils;
import FilmLibrary.dataBase.dbBuilt.DbManager;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Locale;

/**
 * Created by Admin on 2017-03-27.
 */
public class Main extends Application {
    public static final String MAIN_BORDER_PANE_FXML = "/fxml/MainBordePane.fxml";

    public static void main(String[] args) throws SQLException, IOException {
        launch(args);
    }


    public void start(Stage primaryStage) throws Exception {
        Locale.setDefault(new Locale("pl"));
        Pane borderPane = FxmlUtils.fxmlLoader(MAIN_BORDER_PANE_FXML);

        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle(FxmlUtils.getResourceBundle().getString("title.application"));
        primaryStage.show();

        DbManager.initDatabase();
    }
}