package com.projetos.circularList;

public class CircularNode<T> {

    private T content;
    private CircularNode<T> nextNode;

    public CircularNode(T content) {
        this.nextNode = null;
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public CircularNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(CircularNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "CircularNode{" +
                "content=" + content +
                '}';
    }
}
