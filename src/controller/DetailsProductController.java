/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jfoenix.controls.JFXButton;
import entities.Produit;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import dao.ProduitUtil;
import java.io.File;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 * FXML Controller class
 *
 * @author jamel_pc
 */
public class DetailsProductController implements Initializable {

    @FXML
    private Label lbllibelle;
    @FXML
    private Label lblPrix;
    @FXML
    private Label lblStock;
   
    @FXML
    private JFXButton btnStatistique;
    @FXML
    ImageView imgView;
    ProduitUtil produitUtil = new ProduitUtil();
    /**
     * Initializes the controller class.
     */

    
    
    public void setProduct(Produit produit){
        lblPrix.setText(produit.getPrixProduit().toString());
        lbllibelle.setText(produit.getLibelle());
        lblStock.setText(produit.getQuantiteStock().toString());
        File file = new File("D:\\imgeftp\\"+produitUtil.returnImage(produit.getId(),"image_name"));
        String img;
        try {
            img = file.toURI().toURL().toString();
            Image image = new Image(img);
              imgView.setImage(image);
        } catch (MalformedURLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }

}
