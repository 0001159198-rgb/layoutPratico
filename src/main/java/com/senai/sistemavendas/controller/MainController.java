package com.senai.sistemavendas.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.layout.BorderPane;

public class MainController {

    @FXML
    private BorderPane root;

    @FXML
    public void initialize() {
        carregarTela("Home.fxml");
    }

    @FXML
    public void abrirHome() {
        carregarTela("Home.fxml");
    }

    @FXML
    public void abrirClientes() {
        carregarTela("Clientes.fxml");
    }

    @FXML
    public void abrirProdutos() {
        carregarTela("Produtos.fxml");
    }

    @FXML
    public void abrirAjuda() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sobre o Sistema");
        alert.setHeaderText("Informações do Sistema");
        alert.setContentText(
                "Nome: Sistema de Reservas\n" +
                        "Versão: 1.0.0\n" +
                        "Desenvolvedor: Davi Souza Carmo\n" +
                        "Ano: 2026"
        );
        alert.showAndWait();
    }

    private void carregarTela(String fxml) {
        try {
            root.setCenter(
                    FXMLLoader.load(getClass().getResource("/fxml/" + fxml))
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
