package com.finpulse.design_strategy;

public class Context {
    private ITrie iTrie;
    public void TrieTable(){
        iTrie.trie();
    }
    public void SetiTrie(ITrie iTrie){
        this.iTrie=iTrie;
    }

}
