package com.gyakorlatbeadando;

public class VizsgazoNotFoundException extends RuntimeException {
    VizsgazoNotFoundException(int id) {
        super("A vizsgázó nem található: " + id);
    }
}
