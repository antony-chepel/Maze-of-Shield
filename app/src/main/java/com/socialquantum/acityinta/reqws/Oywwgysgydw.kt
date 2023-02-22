package com.socialquantum.acityinta.reqws

import com.socialquantum.acityinta.vbcb.Deplwlpwlpkosoksd.Companion.ggcggxhh
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.socialquantum.acityinta.R

import com.socialquantum.acityinta.vbcb.Deplwlpwlpkosoksd.Companion.jnxjnjnjncijcjicjid
import com.socialquantum.acityinta.vbcb.Deplwlpwlpkosoksd.Companion.okoqokkoowkokokskd
import kotlinx.coroutines.Dispatchers

import com.socialquantum.acityinta.reqws.lxllxock.Uisooksosoijxhucgyd
import com.orhanobut.hawk.Hawk
import com.socialquantum.acityinta.vbcb.Deplwlpwlpkosoksd.Companion.hhvuicii
import com.socialquantum.acityinta.vbcb.llxozks.Wzozkzijhuhuzs
import kotlinx.coroutines.GlobalScope
import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.launch

class Oywwgysgydw : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dxoozxcijs)
        rcyuxyhuhhud()
    }


    private fun rcyuxyhuhhud() {

        val mmckvkiodjifjii = mmckkvokdijfijfjig()

        if (mmckvkiodjifjii == "0") {
            hiijjifjiidfj()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                odkoskodskofo()
            }
            apqpllpwkokod()
        }
    }


    private fun hiijjifjiidfj() {
        val sdkoskodakoko = Intent(this@Oywwgysgydw, Uisooksosoijxhucgyd::class.java)
        Hawk.put(hhvuicii, null)
        Hawk.put(jnxjnjnjncijcjicjid, null)
        startActivity(sdkoskodakoko)
        finish()
    }
    private fun apqpllpwkokod() {
        val jnxcjnjiijhu = Intent(this@Oywwgysgydw, Wzozkzijhuhuzs::class.java)
        startActivity(jnxcjnjiijhu)
        finish()
    }


    private fun mmckkvokdijfijfjig(): String? {
        val fokrkookeokwok: String? = Hawk.get(ggcggxhh)
        return fokrkookeokwok
    }







    private fun odkoskodskofo(){
        val jcvjxcn = AdvertisingIdClient(applicationContext)
        jcvjxcn.start()
        val dkosfkooek = jcvjxcn.info.id
        Hawk.put(okoqokkoowkokokskd, dkosfkooek)
    }


}