/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.icebergburguers.icebergburguers.api;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author naiandra
 */
public class Categories {
    private String title;
    private List<Product> listProducts = new ArrayList<>();

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the listProducts
     */
    public List<Product> getListProducts() {
        return listProducts;
    }

    /**
     * @param listProducts the listProducts to set
     */
    public void setListProducts(List<Product> listProducts) {
        this.listProducts = listProducts;
    }

   
}
