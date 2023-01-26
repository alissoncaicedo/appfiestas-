package org.example;

public class Main {
    public static void main(String[] args) {
        //en el main llamo a mis clases.
        //creo los objetos de mis clases.
        //creo una instancia de mi clase
        //saco copia a mis classes y creo objetos.
        Invitado objetodelaclaseInvitado=new Invitado();
        Invitado objeto2=new Invitado(33,true,"alisson",100000);
        Invitado objeto3=new Invitado("no puedo martha");

        ///voy a obtener el valor de los atributos
        System.out.println(objetodelaclaseInvitado.nombre);
        System.out.println(objeto2.nombre);

    }
}