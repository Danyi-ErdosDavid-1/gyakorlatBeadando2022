package com.gyakorlatbeadando;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UzenetRepo extends CrudRepository<Uzenet, Integer> {
}
