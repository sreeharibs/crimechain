/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author sreehari
 */
public class FXMLDocumentController implements Initializable {
    

    @FXML
    private JFXTextField txtUsername;
    @FXML
    private JFXPasswordField txtPassword;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        
        System.out.println(username +" ==> " + password);
        
        if(username.equalsIgnoreCase("user1") || username.equalsIgnoreCase("user2") || username.equalsIgnoreCase("user3")){
            
            if(password.equalsIgnoreCase("pass@123")){
                
                System.out.println("I am In");
                
                Parent root = FXMLLoader.load(getClass().getResource("../dashboard/Home.fxml"));
        
                Scene scene = new Scene(root);
//
//                Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
//                
//                stage.setScene(scene);
//                
//                stage.show();

Stage stage = (Stage) txtUsername.getScene().getWindow();
// these two of them return the same stage
// Swap screen
stage.setScene(scene);

stage.show();
                
            }
            
        }
        
      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
