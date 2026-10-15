package com.finpulse.design_strategy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignStrategyApplication {

    public static void main(String[] args) {
        Context context = new Context();

        context.SetiTrie(new TrieBulle());
        context.TrieTable();
        System.out.println("========================");

        context.SetiTrie(new TrieInsertion());
        context.TrieTable();
        System.out.println("========================");

        context.SetiTrie(new TrieSlection());
        context.TrieTable();
    }
}
