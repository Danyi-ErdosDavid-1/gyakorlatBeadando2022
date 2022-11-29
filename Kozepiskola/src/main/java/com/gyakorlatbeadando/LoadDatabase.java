package com.gyakorlatbeadando;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    @Bean
    CommandLineRunner initDatabase(VizsgazoRepo repository) {
        return args -> {
            if(false){  // Első feltöltés után állítsuk false-ra, mert minden futtatáskor újra feltöltené
                repository.save(new Vizsgazo("Kovacs Tibor", "10/C"));
                repository.save(new Vizsgazo("Nagy Ilona", "11/B"));
            }
        };
    }
}