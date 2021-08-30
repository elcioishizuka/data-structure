package com.projetos.pilha;

public class NodePilha {

    private int dado;
    private NodePilha refNodePilha = null;

    public NodePilha() {
    }

    public NodePilha(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NodePilha getRefNoPilha() {
        return refNodePilha;
    }

    public void setRefNoPilha(NodePilha refNodePilha) {
        this.refNodePilha = refNodePilha;
    }

    @Override
    public String toString() {
        return "NoPilha{" +
                "dado=" + dado +
                '}';
    }
}
