package com.example.assignment4;

public class Detail {
    String firstName;
    String lastName;
    Double marks;
    String percentage;


    public  Detail(String first, String last,Double marks,String percentage){
        this.firstName=first;
        this.lastName=last;
        this.marks=marks;
        this.percentage=percentage;
    }
    public String  getFirstName(){
        return firstName;
    }
    public  String getLastName(){
        return  lastName;
    }
    public Double getMarks(){
        return  marks;
    }
    public String getPercentage(){return percentage;}
    public void setPercentage(String newPer){
        percentage=newPer;
    }
    public void setMarks(Double newMark){
        marks=newMark;
    }
    public  void setFirstName(String newFirst){
        firstName=newFirst;
    }
    public void setLastName(String newLast){
        lastName=newLast;
    }

}
