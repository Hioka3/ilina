module com.example.ilina {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ilina to javafx.fxml;
    exports com.example.ilina;
}