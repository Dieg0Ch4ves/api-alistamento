package com.apialistamento.alistamento.controller;

import com.apialistamento.alistamento.model.Dtos.PessoaRequestDTO;
import com.apialistamento.alistamento.model.Dtos.PessoaResponseDTO;
import com.apialistamento.alistamento.model.Pessoa;
import com.apialistamento.alistamento.service.AlistamentoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alistamento")
public class PessoaController {

    @Autowired
    private AlistamentoService service;

    @PostMapping
    @Operation(summary = "Fazer um novo alistamento.")
    public ResponseEntity<PessoaResponseDTO> createAlistamento(@Validated @RequestBody PessoaRequestDTO data) {
        PessoaResponseDTO newPessoa = service.createAlistamento(data);
        return ResponseEntity.ok(newPessoa);
    }

    @GetMapping
    public ResponseEntity<List<Pessoa>> readAll() {
        List<Pessoa> allAlistamento = service.readAll();
        return ResponseEntity.ok(allAlistamento);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> readById(@PathVariable Long id) {
        Pessoa pessoa = service.readById(id);
        return ResponseEntity.ok(pessoa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PessoaResponseDTO> change(@PathVariable Long id, @RequestBody PessoaRequestDTO data) {
        PessoaResponseDTO changedAlistamento = service.change(id, data);
        return ResponseEntity.ok(changedAlistamento);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
