package com.example.sonidoanimal

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    private lateinit var s1: MediaPlayer
    private lateinit var s2: MediaPlayer
    private lateinit var s3: MediaPlayer
    private lateinit var s4: MediaPlayer
    private lateinit var s5: MediaPlayer
    private lateinit var s6: MediaPlayer
    private lateinit var s7: MediaPlayer
    private lateinit var s8: MediaPlayer
    private lateinit var s9: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        s1 = MediaPlayer.create(this, R.raw.caballo)
        s2 = MediaPlayer.create(this, R.raw.elefante)
        s3= MediaPlayer.create(this, R.raw.gallo)
        s4=MediaPlayer.create(this, R.raw.gato)
        s5 = MediaPlayer.create(this, R.raw.mono)
        s6 = MediaPlayer.create(this,R.raw.pato)
        s7 = MediaPlayer.create(this, R.raw.perro)
        s8 = MediaPlayer.create(this, R.raw.rana)
        s9 = MediaPlayer.create(this, R.raw.vaca)
    }


    fun funCaballo(view: View) {
        if(s1.isPlaying==false){
            s1.start()
        }
    }
    fun funElefante(view: View) {
        if(s2.isPlaying==false){
            s2.start()
        }
    }
    fun funGallo(view: View) {
        if(s3.isPlaying==false){
            s3.start()
        }
    }
    fun funGato(view: View) {
        if(s4.isPlaying==false){
            s4.start()
        }
    }
    fun funMono(view: View) {
        if(s5.isPlaying==false){
            s5.start()
        }
    }
    fun funPato(view: View) {
        if(s6.isPlaying==false){
            s6.start()
        }
    }
    fun funPerro(view: View) {
        if(s7.isPlaying==false){
            s7.start()
        }
    }
    fun funRana( view: View) {
        if(s8.isPlaying==false){
            s8.start()
        }
    }
    fun funVaca (view: View) {
        if(s9.isPlaying==false){
            s9.start()
        }
    }

}