package com.projetos.fila;

public class Fila {

    private Node refNodeEntradaFila;

    public Fila(){
        this.refNodeEntradaFila = null;
    }

    public void enqueue(Node newNode){
        newNode.setRefNode(refNodeEntradaFila);
        refNodeEntradaFila = newNode;
    }

    public Node first(){
        if(!this.isEmpty()){
            Node firstNode = refNodeEntradaFila;
            while (true){
                if(firstNode.getRefNode() != null){
                    firstNode = firstNode.getRefNode();
                }else{
                    break;
                }

            }
            return firstNode;
        }
        return null;
    }

    public Node dequeue(){
        if(!this.isEmpty()){
            Node firstNode = refNodeEntradaFila;
            Node auxNode = refNodeEntradaFila;
            while (true){
                if(firstNode.getRefNode() != null){
                    auxNode = firstNode;
                    firstNode = firstNode.getRefNode();
                }else{
                    auxNode.setRefNode(null);
                    break;
                }

            }
            return firstNode;
        }
        return null;
    }

    public boolean isEmpty(){
        return refNodeEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        Node auxNode = refNodeEntradaFila;

        if(refNodeEntradaFila != null){
            while (true){
                stringRetorno += "[Node{object=" + auxNode.getObject() + "}]--->";
                if(auxNode.getRefNode() != null){
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
