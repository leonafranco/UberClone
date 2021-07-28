package application;

import db.DB;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.sql.Connection;


public class Main extends Application {
    private static Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/GUI/MainView.fxml"));
        ScrollPane root = loader.load();

        root.setFitToHeight(true);
        root.setFitToWidth(true);


        scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("UberClone");
        primaryStage.show();
    }

//    public void changeScene(String fxml) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource(fxml));
//        Scene scene = new Scene(root);
//        primaryStage.setScene(scene);
//        //        primaryStage.getScene().setRoot(root);
//    }


    public static void main(String[] args) {
        Connection conn = DB.getConnection();
        launch(args);
    }

    public static Scene getMainScene() {
        return scene;
    }
}
