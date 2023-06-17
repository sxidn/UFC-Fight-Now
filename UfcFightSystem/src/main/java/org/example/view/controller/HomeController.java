package org.example.view.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.example.view.DBUtils;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    public Button btn_fighters;
    public Button btnFighters;
    @FXML
    private Button btn_logout;

    @FXML
    private Label label_welcome;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        btnFighters.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DBUtils.changeScene(actionEvent,"/fight-choose-view.fxml","Choose",null);
            }
        });
        btn_logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBUtils.changeScene(event, "/login-view.fxml", "Login!", null);
            }


        });

        btn_fighters.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DBUtils.changeScene(actionEvent,"/fighters-view.fxml","Fighters",null);
            }
        });
    }

    public void setUserInformation(String firstName){
        label_welcome.setText("Welcome " + firstName + "!");
    }

    public void onBtnHistory(ActionEvent actionEvent) {
        DBUtils.changeScene(actionEvent,"/history-view.fxml","History",null);
    }
}
