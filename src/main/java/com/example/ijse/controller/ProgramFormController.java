package com.example.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ProgramFormController {

    @FXML
    private Button btnDash;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnProgramme;

    @FXML
    private Button btnRegister;

    @FXML
    private AnchorPane rootNode;

    @FXML
    private Button btnStudent;

    @FXML
    private Button btnUser;

    @FXML
    private TableColumn<?, ?> clmDuration;

    @FXML
    private TableColumn<?, ?> clmId;

    @FXML
    private TableColumn<?, ?> clmName;

    @FXML
    private TableColumn<?, ?> clmPrice;

    @FXML
    private TableView<?> tblProgramme;

    @FXML
    private TextField txtDuration;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtPrice;

    @FXML
    private TextField txtProgramme;

    @FXML
    void btnDashOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/dashboard_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Dashboard Form");
        stage.centerOnScreen();

    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/login_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Login Form");
        stage.centerOnScreen();

    }

    @FXML
    void btnProgramOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/programForm.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Program Form");
        stage.centerOnScreen();

    }

    @FXML
    void btnRegiOnAction(ActionEvent event) {

    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {

    }

    @FXML
    void btnStuOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/student_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Student Form");
        stage.centerOnScreen();

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void btnUserOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/user_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("User Form");
        stage.centerOnScreen();


    }

    @FXML
    void txtDurationOnAction(ActionEvent event) {

    }

    @FXML
    void txtIdOnAction(ActionEvent event) {

    }

    @FXML
    void txtItemOnAction(ActionEvent event) {

    }

    @FXML
    void txtPriceOnAction(ActionEvent event) {

    }

}
