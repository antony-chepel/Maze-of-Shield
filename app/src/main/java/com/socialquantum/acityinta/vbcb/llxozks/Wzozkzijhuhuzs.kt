package com.socialquantum.acityinta.vbcb.llxozks
import java.util.concurrent.TimeUnit
import android.content.Intent
import com.socialquantum.acityinta.vbcb.Deplwlpwlpkosoksd.Companion.jnxjnjnjncijcjicjid
import com.socialquantum.acityinta.vbcb.Deplwlpwlpkosoksd.Companion.qopqqp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.socialquantum.acityinta.vbcb.Deplwlpwlpkosoksd.Companion.hhvuicii
import com.socialquantum.acityinta.vbcb.Deplwlpwlpkosoksd.Companion.ggcggxhh
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib

import com.orhanobut.hawk.Hawk
import com.socialquantum.acityinta.databinding.TreiejsadxcBinding
import com.socialquantum.acityinta.reqws.lxllxock.Uisooksosoijxhucgyd
import com.socialquantum.acityinta.vbcb.Deplwlpwlpkosoksd.Companion.dokkoepwlplplpsalpdok


import java.util.concurrent.Executors


class Wzozkzijhuhuzs : AppCompatActivity() {
    lateinit var oksokskoosk: TreiejsadxcBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        oksokskoosk = TreiejsadxcBinding.inflate(layoutInflater)
        setContentView(oksokskoosk.root)

        val bcxbhbvbhxc: String? = Hawk.get(ggcggxhh, "null")

        if (bcxbhbvbhxc == "1") {
            AppsFlyerLib.getInstance()
                .init("EjYmv6WHpN5RkbZJxi4u83", epllpwplwlpplwlpwlpsokdko, applicationContext)
            AppsFlyerLib.getInstance().start(this)
        }

        bbjicijidofkkdfko()

    }



    private fun hchcbxnvjxcvjnjnd() {
        val ifjokosk = Intent(this@Wzozkzijhuhuzs, Njxxooxoxijsd::class.java)
        Hawk.put(hhvuicii, null)
        Hawk.put(jnxjnjnjncijcjicjid, null)
        startActivity(ifjokosk)
        finish()
    }

    private fun rpelelplplpsoksakodixjichuzu() {
        val kckkxivjcuh = Intent(this@Wzozkzijhuhuzs, Uisooksosoijxhucgyd::class.java)
        Hawk.put(hhvuicii, null)
        Hawk.put(jnxjnjnjncijcjicjid, null)
        startActivity(kckkxivjcuh)
        finish()
    }

    private fun bbjicijidofkkdfko() {


        val opepelpllpspladkokoxkoc: String = Hawk.get(hhvuicii)
        val hbxhbcbhbhxushudhu: String? = Hawk.get(dokkoepwlplplpsalpdok, "null")

        val woqppqlpwlp: String? = Hawk.get(ggcggxhh, "null")
        val nxzjncjnjnzxuhdhuhu: String = Hawk.get(jnxjnjnjncijcjicjid, "null")
        var tookrokrokokeko: String? = Hawk.get(qopqqp)


        if (woqppqlpwlp == "1") {
            val bcbxnnvjijduvfhuhufv = Executors.newSingleThreadScheduledExecutor()
            bcbxnnvjijduvfhuhufv.scheduleAtFixedRate({
                if (tookrokrokokeko != null) {

                    if (tookrokrokokeko!!.contains("tdb2") || opepelpllpspladkokoxkoc.contains(nxzjncjnjnzxuhdhuhu) || hbxhbcbhbhxushudhu!!.contains("tdb2")) {
                        bcbxnnvjijduvfhuhufv.shutdown()
                        hchcbxnvjxcvjnjnd()
                    } else {
                        bcbxnnvjijduvfhuhufv.shutdown()
                        rpelelplplpsoksakodixjichuzu()
                    }
                } else {
                    tookrokrokokeko = Hawk.get(qopqqp)
                }
            }, 0, 1, TimeUnit.SECONDS)
        }  else if (opepelpllpspladkokoxkoc.contains(nxzjncjnjnzxuhdhuhu)) {
            hchcbxnvjxcvjnjnd()
        } else {
            rpelelplplpsoksakodixjichuzu()
        }

    }


    private val epllpwplwlpplwlpwlpsokdko = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(yxygcyx: MutableMap<String, Any>?) {
            val sookskodkowjiijsd = yxygcyx?.get("campaign").toString()
            Hawk.put(qopqqp, sookskodkowjiijsd)
        }
        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }

}