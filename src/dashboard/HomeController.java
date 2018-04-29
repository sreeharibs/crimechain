/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.NodeOrientation;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

/**
 *
 * @author oXCToo
 */
public class HomeController implements Initializable {
    
    private Map<String,String> info = new HashMap<>();
    
    @FXML
    private JFXButton btnSubmit;
    
    @FXML
    private Label itemInfo;
    
      @FXML
    private VBox pnl_scroll;
    
    @FXML
    private void handleButtonAction(MouseEvent event) { 
        
       refreshNodes("Item",3);
    }
    
    @FXML
    private void handleAction(ActionEvent event) { 
        
        if(event.getSource().equals(btnSubmit)){
            
             refreshNodes("submit",1);
            
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        info.put("Body upside down","Liga Skromene's decomposed body found hanging upside down from a tree");
        info.put("Missing from Ayu: center","The Latvian tourist had gone missing from an Ayurvedic centre in Kerala");
        info.put("Samples tested : 100% match","A bone sample from the woman's body and her sister, Ilze Skromane's blood samples were tested at the Rajiv Gandhi Centre for Bio-Technology at Thiruvananthapuram. It was a 100");
        refreshNodes("Item",3);
    }    
    
    private void refreshNodes(String item, Integer count)
    {
        pnl_scroll.getChildren().clear();
        
        Node [] nodes = new  Node[15];
        
        for(int i = 0; i<count; i++)
        {
            try {
                
                if(item.equalsIgnoreCase("item")){
                    
                    nodes[i] = (Node)FXMLLoader.load(getClass().getResource(item+i+".fxml"));
                    
                }else{
                    nodes[i] = (Node)FXMLLoader.load(getClass().getResource(item+".fxml"));
                }
                
                
               
               pnl_scroll.getChildren().add(nodes[i]);
                
            } catch (IOException ex) {
                Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }  
    }
    
}
