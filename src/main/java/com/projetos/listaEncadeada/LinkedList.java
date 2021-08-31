package com.projetos.listaEncadeada;

public class LinkedList<T> {

    Node<T> inputRef;

    public LinkedList() {
        this.inputRef = null;
    }

    public void add(T content) {
        Node<T> newNode = new Node<>(content);

        if (this.isEmpty()) {
            inputRef = newNode;
            return;
        }

        Node<T> auxNode = inputRef;
        for (int i = 0; i < this.size() - 1; i++) {
            auxNode = auxNode.getNextNode();
        }

        auxNode.setNextNode(newNode);
    }

    public T get(int index) {
        return getNode(index).getContent();
    }

    private Node<T> getNode(int index) {
        validateIndex(index);
        Node<T> auxNode = inputRef;
        Node<T> returnNode = null;
        for (int i = 0; i <= index; i++) {
            returnNode = auxNode;
            auxNode = auxNode.getNextNode();
        }
        return returnNode;
    }

    public T remove(int index) {
        Node<T> targetNode = this.getNode(index);
        if (index == 0) {
            inputRef = targetNode.getNextNode();
            return targetNode.getContent();
        }
        Node<T> previousNode = getNode(index - 1);
        previousNode.setNextNode(targetNode.getNextNode());
        return targetNode.getContent();

    }

    public int size() {
        int listSize = 0;
        Node<T> auxRef = inputRef;
        while (true) {
            if (auxRef != null) {
                listSize++;
                if (auxRef.getNextNode() != null) {
                    auxRef = auxRef.getNextNode();
                } else {
                    break;
                }
            } else {
                break;
            }

        }
        return listSize;
    }

    private void validateIndex(int index) {
        if (index >= size()) {
            throw new IndexOutOfBoundsException("There is no content at index " + index + " of this list!!!!");
        }
    }

    public boolean isEmpty() {
        return inputRef == null ? true : false;
    }

    @Override
    public String toString() {
        String returnString = "";
        Node<T> auxNode = inputRef;
        for (int i = 0; i < this.size(); i++) {
            returnString += "[Node{content=" + auxNode.getContent() + "}--->";
            auxNode = auxNode.getNextNode();
        }
        returnString += "null";
        return returnString;
    }
}
