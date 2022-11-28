package com.gyakorlatbeadando;

import com.gyakorlatbeadando.Jelentkezo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JelentkezoRepo extends CrudRepository<Jelentkezo, Integer> {
}
