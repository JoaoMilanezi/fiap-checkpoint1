package br.com.fiap.checkpoint1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CheckpointController {
	@Value("${spring.profiles.active}")
	private String activeProfile;

	@GetMapping("/ping")
	public String ping() {

		switch (activeProfile) {
			case "dev":
				return "Pong em dev";
			case "stg":
				return "Pong em stg";
			case "prd":
				return "Pong em prd";
		}
		return null;
	}
}