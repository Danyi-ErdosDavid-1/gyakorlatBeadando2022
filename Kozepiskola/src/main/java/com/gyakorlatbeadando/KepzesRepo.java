package com.gyakorlatbeadando;

import com.gyakorlatbeadando.Kepzes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KepzesRepo extends CrudRepository<Kepzes, Integer> {
}
