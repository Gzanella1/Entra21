package com.entra21.PrimeiroProjetoSpring.View.Repository;

import com.entra21.PrimeiroProjetoSpring.Model.Entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {
}
