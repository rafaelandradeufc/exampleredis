package br.com.ufc.crateus.tcc.exampleredis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ufc.crateus.tcc.exampleredis.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
