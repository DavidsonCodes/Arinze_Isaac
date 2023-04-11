package entities;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private String name;
    private String address;
    private List<Staff> StaffList;

   private  int performanceRating;

    private int yearOfExperience;

    private List<Product> productList;

    List<Integer> agellist = new ArrayList<>();

     public Store(){};

    public int getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(int performanceRating) {
        this.performanceRating = performanceRating;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Staff> getStaffList() {
        return StaffList;
    }

    public void setStaffList(List<Staff> staffList) {
        StaffList = staffList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Integer> getAgellist() {
        return agellist;
    }

    public void setAgellist(List<Integer> agellist) {
        this.agellist = agellist;
    }
}
