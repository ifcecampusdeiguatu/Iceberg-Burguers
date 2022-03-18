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
public class Products {
    private String title;
    private List<Data> listData = new ArrayList<>();

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
     * @return the listData
     */
    public List<Data> getListData() {
        return listData;
    }

    /**
     * @param listData the listData to set
     */
    public void setListData(List<Data> listData) {
        this.listData = listData;
    }
}
