package com.apialistamento.alistamento.model.Dtos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public record PessoaRequestDTO(String name, String cpf,@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy") LocalDate dateOfBirth) {
}
