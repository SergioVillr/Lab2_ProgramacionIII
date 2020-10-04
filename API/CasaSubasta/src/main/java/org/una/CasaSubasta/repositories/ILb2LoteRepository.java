/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.CasaSubasta.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.una.CasaSubasta.entities.Lab2_Lote;

/**
 *
 * @author expz
 */
public interface ILb2LoteRepository extends JpaRepository<Lab2_Lote, Long>{
    public Optional<Lab2_Lote> findById(Long id);
    
}
