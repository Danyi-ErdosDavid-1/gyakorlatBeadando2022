package com.kozepiskola;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JelentkezesRepo extends CrudRepository<Jelentkezes, Integer> {
}
