package com.socialquantum.acityinta.reqws.lxllxock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.google.android.material.snackbar.Snackbar
import com.socialquantum.acityinta.R
import com.socialquantum.acityinta.databinding.ActivityUisooksosoijxhucgydBinding
import com.socialquantum.acityinta.vbcb.llxozks.Hbxbxzuhcgyygs
import kotlin.random.Random

class Uisooksosoijxhucgyd : AppCompatActivity() {
    var sijadjis = 0
    private var xizjcxjiz : CountDownTimer? = null
    private lateinit var asisdjisj : ActivityUisooksosoijxhucgydBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        asisdjisj = ActivityUisooksosoijxhucgydBinding.inflate(layoutInflater)
        setContentView(asisdjisj.root)
        okasidasji()
        ioijsiajdji()


    }


    private fun okasidasji() = with(asisdjisj){
        xizjcxjiz?.cancel()
        var gsduh = 15
        xizjcxjiz = object : CountDownTimer(15000,1000){
            override fun onTick(p0: Long) {
                gsduh --
                xkzioxcjizijsjiajiaduh.text = "Time : $gsduh sec"
            }

            override fun onFinish() {
                gsduh = 15
                startActivity(Intent(this@Uisooksosoijxhucgyd,Hbxbxzuhcgyygs::class.java)
                    .putExtra("mzdl_loose","mzdl_loose")
                )
            }

        }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        xizjcxjiz?.cancel()
    }

    private fun ioijsiajdji() = with(asisdjisj){
     val uhasygsdgy = listOf(
         R.drawable.mzshld_it_1,
         R.drawable.mzshld_it_2,
         R.drawable.mzshld_it_3,
         R.drawable.mzshld_it_4,
         R.drawable.mzshld_it_5,
     )

        val sijd = uhasygsdgy[Random.nextInt(5)]
        val xzkkc = uhasygsdgy[Random.nextInt(5)]
        val epelelpwqp = uhasygsdgy[Random.nextInt(5)]
        val sajisdisjji = uhasygsdgy[Random.nextInt(5)]

        ixjzc.setImageResource(sijd)
        aaskoaskoaskoji.setImageResource(xzkkc)
        xnjnxczjnczxjn.setImageResource(epelelpwqp)
        qpqplqwlpq.setImageResource(sajisdisjji)


        ixjzc.setOnClickListener {
            sijadjis = 1
            aaskoaskoaskoji.alpha = 0.5f
            xnjnxczjnczxjn.alpha = 0.5f
            ixjzc.alpha = 1.0f
            qpqplqwlpq.alpha = 0.5f
            isjaijdsijjiwdwdij.alpha = 1.0f
        }
        aaskoaskoaskoji.setOnClickListener {
            sijadjis = 2
            aaskoaskoaskoji.alpha = 1.0f
            isjaijdsijjiwdwdij.alpha = 1.0f
            ixjzc.alpha = 0.5f
            xnjnxczjnczxjn.alpha = 0.5f
            qpqplqwlpq.alpha = 0.5f
        }
        xnjnxczjnczxjn.setOnClickListener {
            sijadjis = 3
            xnjnxczjnczxjn.alpha = 1.0f

            aaskoaskoaskoji.alpha = 0.5f
            ixjzc.alpha = 0.5f
            qpqplqwlpq.alpha = 0.5f
            isjaijdsijjiwdwdij.alpha = 1.0f
        }
        qpqplqwlpq.setOnClickListener {
            sijadjis = 4
            qpqplqwlpq.alpha = 1.0f
            xnjnxczjnczxjn.alpha = 0.5f
            isjaijdsijjiwdwdij.alpha = 1.0f
            ixjzc.alpha = 0.5f
            aaskoaskoaskoji.alpha = 0.5f
        }

        isjaijdsijjiwdwdij.setOnClickListener {
            if(sijadjis == 0){
                Snackbar.make(asisdjisj.root,"You have to choose treasure",Snackbar.LENGTH_SHORT).show()
            } else {
                startActivity(Intent(this@Uisooksosoijxhucgyd,Hbxbxzuhcgyygs::class.java)
                    .putExtra("mzd_shld_check",sijadjis)
                    .putExtra("im_1_shld",sijd)
                    .putExtra("im_2_shld",xzkkc)
                    .putExtra("im_3_shld",epelelpwqp)
                    .putExtra("im_4_shld",sajisdisjji)
                )
                xizjcxjiz?.cancel()
            }
        }

    }
}