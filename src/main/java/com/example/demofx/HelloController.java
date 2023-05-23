package com.example.demofx;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        name.setCellValueFactory(new PropertyValueFactory<Customer, String>("name"));
        age.setCellValueFactory(new PropertyValueFactory<Customer, Integer>("age"));

        Customer customer = new Customer("john","doe");
        ObservableList<Customer> customers = tableau.getItems();
        customers.add(customer);
        tableau.setItems(customers);
    }
    
    @FXML
    private TableView tableau;
    @FXML
    private TableColumn age;
    @FXML
    private TableColumn name;

}