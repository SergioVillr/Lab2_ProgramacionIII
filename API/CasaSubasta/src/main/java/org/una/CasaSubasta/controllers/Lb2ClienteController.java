/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.CasaSubasta.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.una.CasaSubasta.dto.Lb2ClienteDTO;
import org.una.CasaSubasta.entities.Lb2Cliente;
import org.una.CasaSubasta.services.ILb2ClienteService;
import org.una.CasaSubasta.utils.MapperUtils;

/**
 *
 * @author sergio
 */
@RestController
@RequestMapping("/lb2_cliente") 
//@Api(tags = {"Lb2_Cliente"})
public class Lb2ClienteController {
    
    @Autowired
    private ILb2ClienteService lb2_ClienteService;
    
    @GetMapping() 
    public @ResponseBody
    ResponseEntity<?> findAll() {
        try {
            Optional<List<Lb2Cliente>> result = lb2_ClienteService.findAll();
            if (result.isPresent()) {
                List<Lb2ClienteDTO> clienteDTO = MapperUtils.DtoListFromEntityList(result.get(), Lb2ClienteDTO.class);
                return new ResponseEntity<>(clienteDTO, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}") 
    public ResponseEntity<?> findById(@PathVariable(value = "id") Long id) {
        try {

            Optional<Lb2Cliente> clienteFound = lb2_ClienteService.findById(id);
            if (clienteFound.isPresent()) {
                Lb2ClienteDTO clienteDTO = MapperUtils.DtoFromEntity(clienteFound.get(), Lb2ClienteDTO.class);
                return new ResponseEntity<>(clienteDTO, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/") 
    @ResponseBody
    public ResponseEntity<?> create(@RequestBody Lb2Cliente cliente) {
        try {
            Lb2Cliente clienteCreated = lb2_ClienteService.create(cliente);
            Lb2ClienteDTO clienteDTO = MapperUtils.DtoFromEntity(clienteCreated, Lb2ClienteDTO.class);
            return new ResponseEntity<>(clienteDTO, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
