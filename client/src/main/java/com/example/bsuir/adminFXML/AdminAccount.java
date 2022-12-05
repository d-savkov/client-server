package com.example.bsuir.adminFXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import com.example.bsuir.utils.ClientSocket;

import java.io.IOException;

public class AdminAccount {
    public Button buttonManageUsers;
    public Button btnEmployees;
    public Button btnUsers;
    public Button btnServices;
    public Button btnAppointments;
    public Button btnLogOut;
    public Button btnAddEmplServ;

    public void Manage_Users_Pressed() throws IOException {
        Stage stage = (Stage) buttonManageUsers.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/adminFXML/manageUsers.fxml"));
        Scene newScene = new Scene(root);
        stage.setScene(newScene);
    }

    public void usersPressed() throws IOException {
        Stage stage = (Stage) btnUsers.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/adminFXML/users.fxml"));
        Scene newScene = new Scene(root);
        stage.setScene(newScene);
    }

    public void Manage_Appointments_Pressed() throws IOException {
        Stage stage = (Stage) btnAppointments.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/adminFXML/ManageAppointments.fxml"));
        Scene newScene = new Scene(root);
        stage.setScene(newScene);
    }

    public void Manage_Employees_Pressed() throws IOException {
        Stage stage = (Stage) btnEmployees.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/adminFXML/ManageEmployee.fxml"));
        Scene newScene = new Scene(root);
        stage.setScene(newScene);
    }

    public void Manage_Services_Pressed() throws IOException {
        Stage stage = (Stage) btnServices.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/adminFXML/ManageServices.fxml"));
        Scene newScene = new Scene(root);
        stage.setScene(newScene);
    }

    public void onAddEmplServ() throws IOException {
        Stage stage = (Stage) btnAddEmplServ.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/adminFXML/AddEmplServ.fxml"));
        Scene newScene = new Scene(root);
        stage.setScene(newScene);
    }

    public void onLogOut() throws IOException {
        Stage stage = (Stage) btnLogOut.getScene().getWindow();
        ClientSocket.getInstance().setUser(null);
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("/login.fxml"));
        Scene newScene = new Scene(root);
        stage.setScene(newScene);
    }
}
