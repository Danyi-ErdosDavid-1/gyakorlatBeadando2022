package com.gyakorlatbeadando;

public class JelentkezoNotFoundException extends RuntimeException {
    JelentkezoNotFoundException(int id) {
        super("A jelentkező nem található: " + id);
    }
}
