/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.kge.eti.OSApiApplication.domain.repository;

import br.kge.eti.OSApiApplication.domain.model.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sesideva
 */


@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long>{
    
}
