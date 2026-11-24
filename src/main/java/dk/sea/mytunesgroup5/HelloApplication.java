package dk.sea.mytunesgroup5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("MyTunes");
        stage.setScene(scene);
        //To make sure that the program will run with a maximized screen size no matter the computer type
        stage.setMaximized(true);
        stage.show();
    }
}
