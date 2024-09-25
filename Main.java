/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gusta
 */

import Models.Animal;
import Models.Cachorro;
import Models.Gato;

public class Main {
    public static void main(String[] args) {
       
        Animal cachorro = new Cachorro("Scooby");
        Animal gato = new Gato("Lucky");

        cachorro.emitirSom();
        gato.emitirSom();
    }
}