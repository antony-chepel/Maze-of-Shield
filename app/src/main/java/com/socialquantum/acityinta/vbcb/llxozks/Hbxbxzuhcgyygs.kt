package com.socialquantum.acityinta.vbcb.llxozks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.socialquantum.acityinta.databinding.ActivityHbxbxzuhcgyygsBinding
import com.socialquantum.acityinta.reqws.lxllxock.Uisooksosoijxhucgyd
import kotlin.random.Random

class Hbxbxzuhcgyygs : AppCompatActivity() {
    val dsuidshuf = listOf(1,2,3,4)
    val asisjdajisij = listOf(
        100,200,400,600,800,1000,1500,2000
    )
    private lateinit var icxokvjidji : ActivityHbxbxzuhcgyygsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        icxokvjidji = ActivityHbxbxzuhcgyygsBinding.inflate(layoutInflater)
        setContentView(icxokvjidji.root)
        ijasdjiaijs()
    }


    private fun ijasdjiaijs() = with(icxokvjidji){
        val sjioadjidas = intent.getIntExtra("mzd_shld_check",1)
        val ixjzijczxji = intent.getStringExtra("mzdl_loose")
        val aposapaslpaslp = intent.getIntExtra("im_1_shld", 0)
        val uxhzhuzxchu = intent.getIntExtra("im_2_shld", 0)
        val ijasdjisdjidwodwko = intent.getIntExtra("im_3_shld", 0)
        val uxhzhucxuhxzchu = intent.getIntExtra("im_3_shld", 0)

        if(ixjzijczxji == "mzdl_loose"){
            cvuhfd.text = "Time is over, try again"
        }
        if(aposapaslpaslp != 0){
            imageView.setImageResource(aposapaslpaslp)
        }
        if(uxhzhuzxchu != 0){
            imageView.setImageResource(uxhzhuzxchu)
        }
        if(ijasdjisdjidwodwko != 0){
            imageView.setImageResource(ijasdjisdjidwodwko)
        }
        if(uxhzhucxuhxzchu != 0){
            imageView.setImageResource(uxhzhucxuhxzchu)
        }
        val ixcjjixvjijixccjix = dsuidshuf[Random.nextInt(4)]
        val aoksasko = asisjdajisij[Random.nextInt(8)]
        if(sjioadjidas == ixcjjixvjijixccjix && ixjzijczxji != "mzdl_loose"){
            cvuhfd.text = "Congratulate, you found treasure!"
            cpcpcoxocxk.visibility = View.VISIBLE
            cpcpcoxocxk.text = "You got $aoksasko golden scores"
        }




        aokakoso.setOnClickListener {
            startActivity(Intent(this@Hbxbxzuhcgyygs,Uisooksosoijxhucgyd::class.java))
        }

        sokxkozkocjiijuhdfhu.setOnClickListener {
            finishAffinity()
        }
    }
}