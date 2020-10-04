/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.CasaSubasta.services;

import java.util.List;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.una.CasaSubasta.entities.Lab2_Lote;
import org.una.CasaSubasta.repositories.ILb2LoteRepository;

/**
 *
 * @author sergio
 */
public class LoteServiceImplementation implements ILoteService{
    
    @Autowired
    private ILb2LoteRepository lotesRepository;
    
    @Override
    @Transactional(readOnly = true)
    public Optional<List<Lab2_Lote>> findAll() {
        return Optional.ofNullable(lotesRepository.findAll());
    }
    
    @Override
    @Transactional(readOnly = true)
    public Optional<Lab2_Lote> findById(Long id) {
        return lotesRepository.findById(id);
    }
    
    @Override
    @Transactional
    public Lab2_Lote create(Lab2_Lote lote) {
        return lotesRepository.save(lote);
    }
}
