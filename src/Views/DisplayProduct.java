/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import entities.Produit;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
 *
 * @author jamel_pc
 */
public class DisplayProduct extends Application {
    
    HomeController homeController;
    public static Produit produit = new Produit();

    public DisplayProduct(HomeController homeController, Produit produit) {
        this.produit = produit;
        this.homeController = homeController;
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DisplayProduct.fxml"));
        Parent root = (Parent) loader.load();
        Scene scene = new Scene(root);
        primaryStage.setTitle("Display Product");
        DisplayProductController displaDisplayProduct = loader.getController();
        displaDisplayProduct.setProduct(produit);
        primaryStage.setScene(scene);        
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

   
}
