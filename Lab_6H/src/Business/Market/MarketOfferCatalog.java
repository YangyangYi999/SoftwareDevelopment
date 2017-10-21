/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Market;

import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class MarketOfferCatalog {
    private ArrayList<MarketOffer> marketOfferCatalog;

    public MarketOfferCatalog() {
        marketOfferCatalog = new ArrayList<>();
    }

    public ArrayList<MarketOffer> getMarketOfferCatalog() {
        return marketOfferCatalog;
    }

    public void setMarketOfferCatalog(ArrayList<MarketOffer> marketOfferCatalog) {
        this.marketOfferCatalog = marketOfferCatalog;
    }
    
    public MarketOffer addMarketOffer(){
        MarketOffer marketOffer = new MarketOffer();
        marketOfferCatalog.add(marketOffer);
        return marketOffer;
    }
    
    public void removeMarketOffer(MarketOffer marketOffer){
        marketOfferCatalog.remove(marketOffer);
    }
}
