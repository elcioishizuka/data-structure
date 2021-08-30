package com.projetos.pilha;

public class Pilha {

    private NodePilha refNodeEntradaPilha;

    public Pilha(){
        this.refNodeEntradaPilha=null;
    }

    public void push(NodePilha novoNo){
        NodePilha refAuxiliar = refNodeEntradaPilha;
        refNodeEntradaPilha = novoNo;
        refNodeEntradaPilha.setRefNoPilha(refAuxiliar);
    }

    public NodePilha pop(){
        if(!this.isEmpty()){
            NodePilha nodePopped = refNodeEntradaPilha;
            refNodeEntradaPilha = refNodeEntradaPilha.getRefNoPilha();
            return nodePopped;
        }
        return null;
    }


    public NodePilha top(){
        return refNodeEntradaPilha;
    }

    public boolean isEmpty(){
        return refNodeEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "*****************\n";
        stringRetorno += "     Pilha\n";
        stringRetorno += "*****************\n";

        NodePilha noAuxiliar = refNodeEntradaPilha;

        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNoPilha();
            }
            else{
                break;
            }
        }
        stringRetorno += "*****************\n";
        return stringRetorno;
    }

}
