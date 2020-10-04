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
import org.una.CasaSubasta.entities.Lb2Cliente;
import org.una.CasaSubasta.repositories.ILb2ClienteRepository;

/**
 *
 * @author sergio
 */
public class Lb2ClienteServiceImplementation implements ILb2ClienteService{
    
    @Autowired
    private ILb2ClienteRepository clienteRepository;
    
    @Override
    @Transactional(readOnly = true)
    public Optional<List<Lb2Cliente>> findAll() {
        return Optional.ofNullable(clienteRepository.findAll());
    }
    
    @Override
    @Transactional(readOnly = true)
    public Optional<Lb2Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }
    
    @Override
    @Transactional
    public Lb2Cliente create(Lb2Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
