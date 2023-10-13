package com.apialistamento.alistamento.service;

import com.apialistamento.alistamento.model.Dtos.PessoaRequestDTO;
import com.apialistamento.alistamento.model.Dtos.PessoaResponseDTO;
import com.apialistamento.alistamento.model.Pessoa;
import com.apialistamento.alistamento.model.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Service
public class AlistamentoService {

    @Autowired
    PessoaRepository pessoaRepository;

    public static boolean validate(LocalDate dateOfBirth) {
        LocalDate dateNow = LocalDate.now();
        int age = Period.between(dateOfBirth, dateNow).getYears();
        return age >= 18 && age <= 19;
    }

    public PessoaResponseDTO createAlistamento(PessoaRequestDTO request) {
        Pessoa pessoa = new Pessoa(request.name(), request.cpf(), request.dateOfBirth());
        if (validate(request.dateOfBirth())) {
            Pessoa savedPessoa = pessoaRepository.save(pessoa);
            return new PessoaResponseDTO(savedPessoa.getId(), savedPessoa.getName(),
                    savedPessoa.getCpf(), savedPessoa.getDateOfBirth());
        } else {
            throw new IdadeNaoPermitidaException("Desculpe, você não está dentro da faixa etária para o alistamento militar.");
        }
    }

    public Pessoa readById(Long id) {
        return pessoaRepository.findById(id).get();
    }

    public List<Pessoa> readAll() {
        return pessoaRepository.findAll();
    }

    public PessoaResponseDTO change(Long id, PessoaRequestDTO request) {
        Pessoa pessoa = readById(id);
        pessoa.setName(request.name());
        pessoa.setCpf(request.cpf());
        pessoa.setDateOfBirth(request.dateOfBirth());
        Pessoa response = pessoaRepository.save(pessoa);
        return new PessoaResponseDTO(response.getId(),response.getName(),response.getCpf(),response.getDateOfBirth());
    }

    public void delete(Long id) {
        pessoaRepository.deleteById(id);
    }

}
