/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


/**
 *
 * @author sreehari
 */
public class ItemController implements Initializable {
    
    @FXML
    private Label itemInfo;
    
    @FXML
    private Label itemDescription;
    
    @FXML
    private void handleAction(ActionEvent event) { 
        
 
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
      
    }

public void initData(String itemInfo, String itemDesc)    {
    
    this.itemInfo.setText(itemInfo);
    
    this.itemDescription.setText(itemDesc);
    
}
    
    
    
}
