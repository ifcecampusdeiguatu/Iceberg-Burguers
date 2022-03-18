package br.com.icebergburguers.icebergburguers.model;

import java.util.List;

public class CartModel {
    private List<ProductModel> productsList;
    private double total = 0.0;

    /**
     * @return the productList
     */
    public List<ProductModel> getProductList() {
        return productsList;
    }

    /**
     * @param productList the productList to set
     */
    public void setProductList(List<ProductModel> productList) {
        this.productsList = productList;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
    
    public void sumTotal () {
        for(ProductModel product: productsList){
            this.total += product.getAmount() * product.getPrice();
        }
    }
}
