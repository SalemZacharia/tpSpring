package com.esprit.zacharia.services;

import com.esprit.zacharia.entities.Stock;

import java.util.List;

public interface IStockService {
    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock updateStock(Stock s);

    Stock retrieveStock(Long id);

    void removeStock(Long id);

    void assignProduitToStock(Long idProduit, Long idStock);

    String retriveStatusStock();
}
