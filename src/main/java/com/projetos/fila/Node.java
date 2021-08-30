package com.projetos.fila;

public class Node<T>{

    private T object;
    private Node<T> refNode;

    public Node(){
    }

    public Node(T object){
        this.refNode = null;
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Node<T> getRefNode() {
        return refNode;
    }

    public void setRefNode(Node<T> refNode) {
        this.refNode = refNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "object=" + object +
                '}';
    }
}
