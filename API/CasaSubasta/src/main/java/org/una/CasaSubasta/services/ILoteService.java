/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.CasaSubasta.services;

import java.util.List;
import java.util.Optional;
import org.una.CasaSubasta.entities.Lab2_Lote;

/**
 *
 * @author expz
 */
public interface ILoteService {
    
    public Optional<List<Lab2_Lote>> findAll();

    public Optional<Lab2_Lote> findById(Long id);
    
    public Lab2_Lote create(Lab2_Lote lotes);

   // public Optional<Lab2_Lote> update(Lab2_Lote lotes, Long id);


}
