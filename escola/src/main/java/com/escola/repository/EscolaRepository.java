package com.escola.repository;

import com.escola.Entity.EscolasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EscolaRepository extends JpaRepository<EscolasEntity, Long> {
}