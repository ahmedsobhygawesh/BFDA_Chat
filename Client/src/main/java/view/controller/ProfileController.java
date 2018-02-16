/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToggleButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Passant
 */
public class ProfileController implements Initializable{
    @FXML private JFXTextField userFullName;
    @FXML private JFXTextField userName;
    @FXML private JFXTextField userEmail;
    @FXML private JFXPasswordField userPassword;
    @FXML private JFXToggleButton userGender;
    @FXML private JFXDatePicker userDob;
    @FXML private JFXComboBox userStatus;
    @FXML private JFXComboBox userCountry;
    @FXML private Label warningMessage;
    @FXML private JFXButton cancelBtn;
    @FXML private JFXButton saveChangesBtn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        userStatusInit();
    }
    
    public void userStatusInit(){
        ObservableList<String> options = 
            FXCollections.observableArrayList(
                "Available",
                "Away",
                "Busy"
            );
        userStatus.getItems().addAll(options);
    }
    
    public void saveChanges(ActionEvent actionEvent)  {    
        saveChangesBtn.setDisable(false);
    }
    
    public void cancelChanges(ActionEvent actionEvent)  { 
        cancelBtn.setDisable(false);
        saveChangesBtn.setDisable(false);
    }
}
