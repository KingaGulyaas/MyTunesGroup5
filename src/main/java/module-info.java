module dk.sea.mytunesgroup5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.sea.mytunesgroup5 to javafx.fxml;
    exports dk.sea.mytunesgroup5;
}