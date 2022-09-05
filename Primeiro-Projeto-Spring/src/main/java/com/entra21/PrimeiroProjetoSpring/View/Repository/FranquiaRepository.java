
package com.entra21.PrimeiroProjetoSpring.View.Repository;

import com.entra21.PrimeiroProjetoSpring.Model.Entity.FranquiaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FranquiaRepository extends JpaRepository<FranquiaEntity, Long> {
}
