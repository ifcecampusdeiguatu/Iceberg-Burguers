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
public class Api {
    private List<Categories> listCategories = new ArrayList<>();

    /**
     * @return the listCategories
     */
    public List<Categories> getListCategories() {
        return listCategories;
    }

    /**
     * @param listCategories the listCategories to set
     */
    public void setListCategories(List<Categories> listCategories) {
        this.listCategories = listCategories;
    }

    
}
