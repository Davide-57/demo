module test.javafx.calcolatrice.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens test.javafx.calcolatrice.demo to javafx.fxml;
    exports test.javafx.calcolatrice.demo;
}