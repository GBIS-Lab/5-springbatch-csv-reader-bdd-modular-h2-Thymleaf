package com.smartphonebatch.repository;

import com.smartphonebatch.model.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmartphoneRepository extends JpaRepository<Smartphone, Long> {
}