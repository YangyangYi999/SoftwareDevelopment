/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Market.MarketOffer;
import Business.Supplier.Product;

/**
 *
 * @author shinychenw
 */
public class OrderItem {
    private int quantity;
    private double actualPrice;
    private MarketOffer marketOffer;
    private double gap;

    public double getGap() {
        return gap;
    }

    public void setGap(double gap) {
        this.gap = gap;
    }

    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(double actualPrice) {
        this.actualPrice = actualPrice;
    }

    public MarketOffer getMarketOffer() {
        return marketOffer;
    }

    public void setMarketOffer(MarketOffer marketOffer) {
        this.marketOffer = marketOffer;
    }


    
    @Override
    public String toString(){
        return marketOffer.getProduct().getProductName();
    }
}
