package com.esprit.zacharia.repositories;

import com.esprit.zacharia.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StockRepository extends JpaRepository<Stock,Long> {
@Query ("select s from Stock  s where s.qte< s.qteMin")
    List<Stock> retriveStatusStock();
}
