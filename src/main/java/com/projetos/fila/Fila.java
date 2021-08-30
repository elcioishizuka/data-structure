package com.projetos.fila;

public class Fila<T> {

    private Node<T> refNodeEntradaFila;

    public Fila() {
        this.refNodeEntradaFila = null;
    }

    public void enqueue(T object) {
        Node<T> newNode = new Node<>(object);
        newNode.setRefNode(refNodeEntradaFila);
        refNodeEntradaFila = newNode;
    }

    public T first() {
        if (!this.isEmpty()) {
            Node<T> firstNode = refNodeEntradaFila;
            while (true) {
                if (firstNode.getRefNode() != null) {
                    firstNode = firstNode.getRefNode();
                } else {
                    break;
                }

            }
            return firstNode.getObject();
        }
        return null;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            Node<T> firstNode = refNodeEntradaFila;
            Node<T> auxNode = refNodeEntradaFila;
            while (true) {
                if (firstNode.getRefNode() != null) {
                    auxNode = firstNode;
                    firstNode = firstNode.getRefNode();
                } else {
                    auxNode.setRefNode(null);
                    break;
                }

            }
            return firstNode.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return refNodeEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        Node<T> auxNode = refNodeEntradaFila;

        if (refNodeEntradaFila != null) {
            while (true) {
                stringRetorno += "[Node{object=" + auxNode.getObject() + "}]--->";
                if (auxNode.getRefNode() != null) {
                    auxNode = auxNode.getRefNode();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
