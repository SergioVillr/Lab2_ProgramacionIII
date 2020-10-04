/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.CasaSubasta.services;

import java.util.List;
import java.util.Optional;
import org.una.CasaSubasta.entities.Lb2Cliente;

/**
 *
 * @author expz
 */
public interface ILb2ClienteService {
    
    public Optional<List<Lb2Cliente>> findAll();
    
    public Optional<Lb2Cliente> findById(Long id);
    
    public Lb2Cliente create(Lb2Cliente cliente);
}
