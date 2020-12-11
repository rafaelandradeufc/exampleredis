package br.com.ufc.crateus.tcc.exampleredis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufc.crateus.tcc.exampleredis.models.Client;
import br.com.ufc.crateus.tcc.exampleredis.services.ClientService;

@RestController
@RequestMapping({ "/clients" })
public class ClientController {

	@Autowired
	private ClientService clientService;

	@GetMapping
	public ResponseEntity<List<Client>> getAll() {
		List<Client> clients = clientService.getAll();
		return new ResponseEntity<List<Client>>(clients, HttpStatus.OK);
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Client> getById(@PathVariable Integer id) {
		Client newClient = clientService.getById(id);
		return new ResponseEntity<Client>(newClient, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Client> add(@RequestBody Client client) {
		Client newClient = clientService.add(client);
		return new ResponseEntity<Client>(newClient, HttpStatus.CREATED);
	}

}
