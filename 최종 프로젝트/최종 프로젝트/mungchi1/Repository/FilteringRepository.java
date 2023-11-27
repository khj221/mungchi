package com.example.mungchi1.Repository;

import com.example.mungchi1.Entity.FilteringEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilteringRepository extends JpaRepository<FilteringEntity, Long> {
    FilteringEntity findByUserId(String userId);
}