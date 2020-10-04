/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.CasaSubasta.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.una.CasaSubasta.entities.Lb2Cliente;

/**
 *
 * @author sergio
 */
public interface ILb2ClienteRepository extends JpaRepository<Lb2Cliente, Long> {
    
    public Optional<Lb2Cliente> findById(Long id);
}
