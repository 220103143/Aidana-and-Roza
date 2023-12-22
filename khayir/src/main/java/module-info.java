module com.example.khayir {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.khayir to javafx.fxml;
    exports com.example.khayir;
}