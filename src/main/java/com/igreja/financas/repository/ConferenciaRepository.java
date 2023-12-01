package com.igreja.financas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igreja.financas.entity.Conferencia;

@Repository
public interface ConferenciaRepository extends JpaRepository<Conferencia, Long> {

}
