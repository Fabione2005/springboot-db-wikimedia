package com.fub.springboot.db.wikimedia.repository;

import com.fub.springboot.db.wikimedia.model.RecentChange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecentChangeRepository extends JpaRepository<RecentChange, Long> {
}