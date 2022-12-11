package com.esprit.zacharia.services;


import com.esprit.zacharia.entities.Produit;
import com.esprit.zacharia.entities.Stock;
import com.esprit.zacharia.repositories.ProduitRepository;
import com.esprit.zacharia.repositories.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StockServiceImp implements  IStockService {
@Autowired
    private StockRepository stockRepository;
    private ProduitRepository produitRepository;
@Override
public List<Stock> retrieveAllStocks(){
    return stockRepository.findAll();
}
public Stock addStock(Stock s){
    return stockRepository.save(s);
}
@Override
    public Stock updateStock(Stock s){
    return stockRepository.save(s);
}
@Override
    public Stock retrieveStock(Long id){
    return stockRepository.findById(id).orElse(null);
}
@Override
    public void removeStock(Long id){
    stockRepository.deleteById(id);
}

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit produit= produitRepository.findById(idProduit).orElse(null);
        Stock stock=stockRepository.findById(idStock).orElse(null);
        if(produit!=null && stock!=null)
        {
            produit.setStocks(stock);
            produitRepository.save(produit);

        }
    }
    @Override
    public String retriveStatusStock() {

        List<Stock> stocks = stockRepository.retriveStatusStock();
        String m = "";
        for(Stock stock: stocks){
            String m1 = stock.getLibelleStock();
            m+=","+m1;
        }
        return m;
    }


}
