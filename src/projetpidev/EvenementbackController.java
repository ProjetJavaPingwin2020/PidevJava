/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetpidev;

import Entity.Login;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author milim
 */
public class EvenementbackController implements Initializable {
    @FXML
    private BorderPane borderpane;
    @FXML
    private AnchorPane parent;
    @FXML
    private Label Lhello;

    /**
     * Initializes the controller class.
     */
    @Override
     public void initialize(URL url, ResourceBundle resources) {
        try {
            Lhello.setText("Bonjour " + Login.getUsername());
        } catch (Exception e) {

        }

    }  

    @FXML
   void b1(ActionEvent event) throws IOException {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/projetpidev/demandeevenement.fxml")));
        stage.setScene(scene);

    }

    @FXML
    private void b2(ActionEvent event) {
    }

    @FXML
    private void backToMenu(ActionEvent event) {
    }
    
}
