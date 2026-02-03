module com.senai.sistemavendas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.senai.sistemavendas to javafx.fxml;
    exports com.senai.sistemavendas;
    exports com.senai.sistemavendas.controller;
    opens com.senai.sistemavendas.controller to javafx.fxml;
}