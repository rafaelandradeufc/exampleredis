package br.com.ufc.crateus.tcc.exampleredis.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import br.com.ufc.crateus.tcc.exampleredis.models.Client;
import br.com.ufc.crateus.tcc.exampleredis.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	@Cacheable(cacheNames = "Client", key = "#root.method.name")
	public List<Client> getAll() {
		return clientRepository.findAll();
	}

	@Cacheable(cacheNames = "Client", key = "#id")
	public Client getById(final Integer id) {
		return clientRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Id not found: " + id));
	}

	@CacheEvict(cacheNames = "Client", allEntries = true)
	public Client add(final Client client) {
		return clientRepository.save(client);
	}

}
