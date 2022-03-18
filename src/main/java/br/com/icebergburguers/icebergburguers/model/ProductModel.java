/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.icebergburguers.icebergburguers.model;

/**
 *
 * @author naiandra
 */
public class ProductModel {
    private String title;
    private int amount;
    private double price;
    
    public ProductModel() {
        
    }
    
    public ProductModel(String title, double price) {
        this.title = title;
        this.price = price;
    }
    
    public String getTitle() {
            return title;
    }
    public void setTitle(String title) {
            this.title = title;
    }
    public int getAmount() {
            return amount;
    }
    public void setAmount(int amount) {
            this.amount = amount;
    }
    public double getPrice() {
            return price;
    }
    public void setPrice(double price) {
            this.price = price;
    }
}
