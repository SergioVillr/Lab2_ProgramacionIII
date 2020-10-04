/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.CasaSubasta.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.una.CasaSubasta.entities.Lab2_Puja;

/**
 *
 * @author chris
 */
public interface IPujaRepository extends JpaRepository<Lab2_Puja, Long> {

    public List<Lab2_Puja> findByCantidad(int cantidad);

    public List<Lab2_Puja> findByEstado(boolean estado);
    
    public Optional<List<Lab2_Puja>> findByClienteId(Long id);

}

