package com.paulfermoreyes.inventory.repository;

import com.paulfermoreyes.inventory.model.StockTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface StockTransactionRepository extends JpaRepository<StockTransaction, UUID> {
    List<StockTransaction> findByProductId(UUID productId);
}
