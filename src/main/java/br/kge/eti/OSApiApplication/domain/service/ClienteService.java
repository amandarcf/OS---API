/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.kge.eti.OSApiApplication.domain.service;

import br.kge.eti.OSApiApplication.ClienteRepository;
import br.kge.eti.OSApiApplication.domain.exception.DomainException;
import br.kge.eti.OSApiApplication.domain.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sesideva
 */
@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente) {
        Cliente clienteExistente = clienteRepository.findByEmail(cliente.getEmail());

        // Lembre-se que o método SAVE pode ser usado para atualizar um cliente também!
        // ID vazio --> Novo Registro
        // ID Preenchido --> Alterar existente

        // Verifica se o cliente existe
        if (clienteExistente != null && !clienteExistente.equals(cliente)) {
            // Lançar exception
            throw new DomainException("Já existe um cliente cadastrado com esse email!");
        }

        return clienteRepository.save(cliente);
    }

    public void excluir(Long clienteId) {
        clienteRepository.deleteById(clienteId);
    }
}

