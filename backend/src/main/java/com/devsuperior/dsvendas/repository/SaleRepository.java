package com.devsuperior.dsvendas.repository;

import com.devsuperior.dsvendas.dto.SaleSucessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale,Long> {


    @Query("SELECT new com.devsuperior.dsvendas.dto.SaleSumDTO(obj.seller,SUM(obj.amount))"+"FROM Sale AS obj GROUP BY obj.seller" )//está fazendo a busca pela soma do montante de cada vendedor
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.devsuperior.dsvendas.dto.SaleSucessDTO(obj.seller,SUM(obj.visited),SUM(obj.deals))"+"FROM Sale AS obj GROUP BY obj.seller" )//está fazendo a busca pela soma de visitas e vendas
    List<SaleSucessDTO> sucessGroupedBySeller();

}
