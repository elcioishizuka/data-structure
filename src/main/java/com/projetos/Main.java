package com.projetos;

import com.projetos.fila.Fila;
import com.projetos.fila.Node;
import com.projetos.pilha.NodePilha;
import com.projetos.pilha.Pilha;

public class Main {

    public static void main(String[] args) {

        No<String> no1 = new No<>("Conteúdo 1");

        No<String> no2 = new No<>("Conteúdo 2");
        no1.setProximoNo(no2);

        No<String> no3 = new No<>("Conteúdo 3");
        no2.setProximoNo(no3);

        No<String> no4 = new No<>("Conteúdo 4");
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());


        Pilha minhaPilha = new Pilha();
        minhaPilha.push(new NodePilha(1));
        minhaPilha.push(new NodePilha(2));
        minhaPilha.push(new NodePilha(3));
        minhaPilha.push(new NodePilha(4));
        minhaPilha.push(new NodePilha(5));
        minhaPilha.push(new NodePilha(6));
        minhaPilha.push(new NodePilha(7));

        System.out.println(minhaPilha);

        minhaPilha.pop();
        System.out.println(minhaPilha);

        System.out.println(minhaPilha.top());

        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue("último");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

    }
}