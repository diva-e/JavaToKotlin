package com.divae.aburgmaier.javatokotlin

class DivaGreeter(val name: String) {

    fun greet(): String {
        return "Grüße gehen raus an ${name.trim()} von allen Diven."
    }
}