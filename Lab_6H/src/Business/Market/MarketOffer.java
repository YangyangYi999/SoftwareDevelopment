/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Market;

import Business.Supplier.Product;

/**
 *
 * @author shinychenw
 */
public class MarketOffer {
    private static int count = 1;
    final String id;
    private Product product;
    private Market market;
    private int floorPrice;
    private int ceilingPrice;
    private int targetPrice;
    public MarketOffer(){
        id = "MO"+String.valueOf(count);
        count++;
}
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public int getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(int floorPrice) {
        this.floorPrice = floorPrice;
    }

    public int getCeilingPrice() {
        return ceilingPrice;
    }

    public void setCeilingPrice(int ceilingPrice) {
        this.ceilingPrice = ceilingPrice;
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

    public String getId() {
        return id;
    }
    
    
    @Override
    public String toString(){
        return getProduct().getProductName()+" "+getMarket().getName();
    }
    public String getPriceSet(){
    //return (String.valueOf(this.floorPrice)+","+String.valueOf(this.targetPrice)+","String.valueOf(this.ceilingPrice));
    String fp = String.valueOf(this.floorPrice);
    String tp = String.valueOf(this.targetPrice);
    String cp = String.valueOf(this.ceilingPrice);
    return fp+","+tp+","+cp;
    }
}
