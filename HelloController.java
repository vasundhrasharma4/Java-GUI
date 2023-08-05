package com.example.assignment4;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {
    @FXML

    Alert alrt= new Alert(Alert.AlertType.INFORMATION);

    @FXML
    TextField firstName = new TextField();
    @FXML
    TextField lastName= new TextField();
    @FXML
    TextField marks= new TextField();
    @FXML
    TextField percentage=new TextField();

    @FXML
    TableView<Detail> studentDetail;
    @FXML
    TableColumn<Detail,String>firstDetail;
    @FXML
    TableColumn<Detail,String>lastDetail;
    @FXML
    TableColumn<Detail, Double>marksDetail;
    @FXML
    TableColumn<Detail,Double>percentageDetail;



    @FXML
    public  void onButtonClick(ActionEvent event) {
        String fName = firstName.getText();
        String lName = lastName.getText();
        Double mark= Double.valueOf(marks.getText());
        if(mark<=500& mark>0){
            Double percentage1= (mark/500)*100;
            percentage.setText(String.valueOf(percentage1));
            String per = percentage.getText();
            System.out.println(fName + lName+mark+"percentage is "+per);
            Detail d1 = new Detail(fName, lName, mark,per);
            ObservableList<Detail> details = studentDetail.getItems();
            details.add(d1);
            studentDetail.setItems(details);
        }
        else{
            alrt.setTitle("ERROR ");
            alrt.setHeaderText("Obtained marks has to be range between 0 to 500. ");
            alrt.show();
        }




    }

    public void initialize(URL url, ResourceBundle resourceBundle){
        firstDetail.setCellValueFactory(new PropertyValueFactory<Detail,String>("firstName"));
        lastDetail.setCellValueFactory(new PropertyValueFactory<Detail, String>("lastName"));
        marksDetail.setCellValueFactory(new PropertyValueFactory<Detail,Double>("marks"));
        percentageDetail.setCellValueFactory(new  PropertyValueFactory<Detail,Double>("percentage"));
    }


    @FXML
        //code to remove row from table
    void onRemoveButtonClick(ActionEvent event){
        int selectedId= studentDetail.getSelectionModel().getSelectedIndex();//fetch data
        studentDetail.getItems().remove(selectedId);// remove rows
    }





}