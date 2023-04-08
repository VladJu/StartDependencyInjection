package com.example.startdependencyinjection.example1

class Activity {
   lateinit var  computer : Computer
   lateinit var keyboard: Keyboard
   init {
       Component().inject(this)
   }
}