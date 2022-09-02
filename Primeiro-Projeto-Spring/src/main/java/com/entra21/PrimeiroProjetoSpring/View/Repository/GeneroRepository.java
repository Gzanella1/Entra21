package com.entra21.PrimeiroProjetoSpring.View.Repository;

import com.entra21.PrimeiroProjetoSpring.Model.Entity.GeneroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<GeneroEntity, Long> {

}
