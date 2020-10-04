/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.CasaSubasta.dto;

import java.sql.Time;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author SERGIO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor 
@ToString
public class LoteDTO {
 
    private Long id; 
    private String nombreCatalogo;   
    private float preciosalida; 
    private double mayorpuja;
    private int horasubasta;
    private Time horainicio;
    private boolean estado; 
    private Date fechaRegistro;
     
}
