package com.esprit.zacharia.controllers;

import com.esprit.zacharia.entities.Stock;
import com.esprit.zacharia.services.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class StockController {
    @Autowired
    IStockService StockService;
    private static final Logger log = LoggerFactory.getLogger(StockController.class);
    @GetMapping("/stocks")
    public List<Stock>retrieveAllStocks()
    {return StockService.retrieveAllStocks();}
    @PostMapping("/addStock")
    public Stock addStock(@RequestBody Stock s){
        return StockService.addStock(s);
    }
    @PutMapping("/updateStock")
    public Stock updateStock(@RequestBody Stock s){
        return StockService.updateStock(s);
    }
    @GetMapping("/Stock/{idStock}")
    public Stock retrieveStock(@PathVariable Long idStock){
        return StockService.retrieveStock(idStock);
    }
    @DeleteMapping("/deleteStock/{idStock}")
    public void removeStock(@PathVariable Long idStock){
        StockService.removeStock(idStock);
    }
    @PostMapping("/assignProduitToStock/{idProduit}/{idStock}")
    public void assignProduitToStock(@PathVariable Long idProduit,@PathVariable Long idStock) {

        StockService.assignProduitToStock(idProduit, idStock);
    }
    @GetMapping("/retriveStatus")
    @Scheduled(cron = "0 0 22 ? * *")
    public void retrieveStatusStock() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        log.info( dateFormat.format(new Date()));
        log.info("\n"+StockService.retriveStatusStock());
        System.out.println(StockService.retriveStatusStock());
    }
}


