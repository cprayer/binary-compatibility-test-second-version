package org.example;

public interface Typo {
    String typpo();

    default String typo() {
        return typpo();
    }
}
