package com.entra21.PrimeiroProjetoSpring.View.Repository;

import com.entra21.PrimeiroProjetoSpring.Model.Entity.DVDEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DvdRepository extends JpaRepository<DVDEntity, Long> {
                                   //sempre jpa depois a classe entity e o tipo de dado do ID
}
