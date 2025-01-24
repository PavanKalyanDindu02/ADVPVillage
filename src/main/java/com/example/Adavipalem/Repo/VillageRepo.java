package com.example.Adavipalem.Repo;

import com.example.Adavipalem.Model.Temple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VillageRepo extends JpaRepository<Temple, Integer> {
}
