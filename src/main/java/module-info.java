module com.example.phase2222222 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.phase2222222 to javafx.fxml;
    exports com.example.phase2222222;
}