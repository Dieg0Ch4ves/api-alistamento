package com.apialistamento.alistamento.model.Dtos;

import java.time.LocalDate;

public record PessoaResponseDTO(Long id, String name, String cpf, LocalDate dateOfBirth) {
}
