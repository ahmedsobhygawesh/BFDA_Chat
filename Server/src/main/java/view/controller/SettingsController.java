/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import model.ConnectionValidation;
import model.RemoteServerToRegistry;
import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author Passant
 */
public class SettingsController implements Initializable{

    @FXML private Button startButton;
    @FXML private Button stopButton;
    private boolean isServerRunning = false;
    private RemoteServerToRegistry remoteServerToRegistry;

    public void initialize(URL location, ResourceBundle resources) {
        remoteServerToRegistry = RemoteServerToRegistry.getInstance();
        stopButton.setDisable(true);
    }

    public void stopServer(ActionEvent actionEvent)  {
        new Thread(()->{
            try {
                remoteServerToRegistry.stopServer();
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            }
        }).start();
        isServerRunning = false;
        startButton.setDisable(false);
        stopButton.setDisable(true);

    }

    public void startServer(ActionEvent actionEvent) {
        new Thread(()->{
            try {
                remoteServerToRegistry.startServer();
                isServerRunning = true;
                checkActiveUsers();
                startButton.setDisable(true);
                stopButton.setDisable(false);
            } catch (RemoteException e) {
                showError("Connection Port May Be Used");
               return;
            }catch (SQLException ex) {
                showError("There is an Issue With your network , Check Administrator");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }).start();
    }

    private void checkActiveUsers()
    {
        System.out.print(isServerRunning);
        new Thread(()-> {
            while (isServerRunning)
                new ConnectionValidation().checkActiveUsers();
        }).start();
    }


    private void showError(String errorMsg)
    {
        Platform.runLater(()->{ new Alert(Alert.AlertType.ERROR , errorMsg).show();
        });
    }
}
