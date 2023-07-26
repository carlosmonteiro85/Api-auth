package com.prototype.security.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/management")
@Tag(name = "Management")
public class ManagementController {

	@Operation(description = "Obter endpoint para gerente", summary = "Gerenciamento de Respostas de endpoint", responses = {
			@ApiResponse(description = "Success", responseCode = "200"),
			@ApiResponse(description = "Unauthorized / Invalid Token", responseCode = "401") }

	)
	@GetMapping
	public String get() {
		return "GET:: management controller";
	}

	@PostMapping
	public String post() {
		return "POST:: management controller";
	}

	@PutMapping
	public String put() {
		return "PUT:: management controller";
	}

	@DeleteMapping
	public String delete() {
		return "DELETE:: management controller";
	}
}
