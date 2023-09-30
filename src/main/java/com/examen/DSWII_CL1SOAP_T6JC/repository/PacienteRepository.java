package com.examen.DSWII_CL1SOAP_T6JC.repository;

import com.examen.DSWII_CL1SOAP_T6JC.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
}
