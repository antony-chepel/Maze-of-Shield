package com.socialquantum.acityinta.vbcb.llxozks
import com.socialquantum.acityinta.vbcb.Deplwlpwlpkosoksd.Companion.dokkoepwlplplpsalpdok
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore

import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import com.socialquantum.acityinta.vbcb.Deplwlpwlpkosoksd.Companion.ycoxkkkojijichuvhuv
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException


import com.socialquantum.acityinta.R
import com.socialquantum.acityinta.databinding.YwwiijwjishuBinding
import com.socialquantum.acityinta.vbcb.Deplwlpwlpkosoksd.Companion.qopqqp
import android.widget.Toast
import com.socialquantum.acityinta.vbcb.Deplwlpwlpkosoksd.Companion.okoqokkoowkokokskd
import android.content.Intent

import com.orhanobut.hawk.Hawk
import android.os.*
import android.webkit.*
import com.appsflyer.AppsFlyerLib
import java.io.File
import android.content.pm.PackageManager
import android.net.Uri
import android.annotation.SuppressLint
import android.app.Activity



class Njxxooxoxijsd : AppCompatActivity() {
    private val llockxvjihuhudhu = 1

    lateinit var rokekokosokaokixjicjizij: WebView
    private var yeuhijsjdjjadux = false
    var doskkokoxkocvo = ""


    var ijsdjifijdji = ""
    var cxjivji: ValueCallback<Array<Uri>>? = null
    var owiwji: String? = null

    lateinit var aplapsp: YwwiijwjishuBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        aplapsp = YwwiijwjishuBinding.inflate(layoutInflater)
        setContentView(aplapsp.root)

        rokekokosokaokixjicjizij = aplapsp.icixijijijv
        Snackbar.make(
            aplapsp.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()


        val hjxixj = CookieManager.getInstance()
        hjxixj.setAcceptCookie(true)
        hjxixj.setAcceptThirdPartyCookies(rokekokosokaokixjicjizij, true)
        tgioioiovioiocijvibo()
        val sokw: Activity = this
        rokekokosokaokixjicjizij.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(nnmxcm: WebView, qopqkokosokjiijxc: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(qopqkokosokjiijxc)) {
                        return false
                    }
                    if (hchxiijxcjijivij(qopqkokosokjiijxc)) {

                        val hcjjxkicxjiijooksd = Intent(Intent.ACTION_VIEW)
                        hcjjxkicxjiijooksd.data = Uri.parse(qopqkokosokjiijxc)
                        startActivity(hcjjxkicxjiijooksd)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                nnmxcm.loadUrl(qopqkokosokjiijxc)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)

                tokkodko(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(sokw, description, Toast.LENGTH_SHORT).show()
            }


        }
        rokekokosokaokixjicjizij.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                cokdkokos: WebView, eowokq: ValueCallback<Array<Uri>>,
                llxoxozopspld: FileChooserParams
            ): Boolean {
                this@Njxxooxoxijsd.cxjivji?.onReceiveValue(null)
                this@Njxxooxoxijsd.cxjivji = eowokq
                var nnjcjxjn: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (nnjcjxjn!!.resolveActivity(packageManager) != null) {

                    var osooskji: File? = null
                    try {
                        osooskji = qokwo()
                        nnjcjxjn.putExtra("PhotoPath", owiwji)
                    } catch (ex: IOException) {

                    }

                    if (osooskji != null) {
                        owiwji = "file:" + osooskji.absolutePath
                        nnjcjxjn.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(osooskji)
                        )
                    } else {
                        nnjcjxjn = null
                    }
                }
                val okekojidjijixuhchu = Intent(Intent.ACTION_GET_CONTENT)
                okekojidjijixuhchu.addCategory(Intent.CATEGORY_OPENABLE)
                okekojidjijixuhchu.type = "image/*"
                val okkoxkokojicxij: Array<Intent?> =
                    nnjcjxjn?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val gokfkokfko = Intent(Intent.ACTION_CHOOSER)
                gokfkokfko.putExtra(Intent.EXTRA_INTENT, okekojidjijixuhchu)
                gokfkokfko.putExtra(Intent.EXTRA_TITLE, getString(R.string.image_chooser))
                gokfkokfko.putExtra(Intent.EXTRA_INITIAL_INTENTS, okkoxkokojicxij)
                startActivityForResult(
                    gokfkokfko, llockxvjihuhudhu
                )
                return true
            }

            @Throws(IOException::class)
            private fun qokwo(): File {
                var jnjncjnxj = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!jnjncjnxj.exists()) {
                    jnjncjnxj.mkdirs()
                }

                jnjncjnxj =
                    File(jnjncjnxj.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return jnjncjnxj
            }

        }

        rokekokosokaokixjicjizij.loadUrl(tpeppepeplod())
    }

    fun tokkodko(jjjxhhxxz: String?) {
        if (!jjjxhhxxz!!.contains("t.me")) {

            if (doskkokoxkocvo == "") {
                doskkokoxkocvo = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    jjjxhhxxz
                ).toString()

                val roiofv = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val nnxjzookkkkosjdwjidi = roiofv.edit()
                nnxjzookkkkosjdwjidi.putString("SAVED_URL", jjjxhhxxz)
                nnxjzookkkkosjdwjidi.apply()
            }
        }
    }

    private fun tpeppepeplod(): String {
        val goxok = "deeporg"
        val pelw = "ad_id="

        val yxicioksokkod = "sub_id_6="
        val bbhbx = "sub_id_1="

        val uchhxjijikok: String? = Hawk.get(okoqokkoowkokokskd, "null")
        val eokwok = Build.VERSION.RELEASE
        val qoqkkqoqokkossd = "naming"

        val nnbijjis = Hawk.get(ycoxkkkojijichuvhuv, "null")
        val eowk = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
        val oaksoskkosdijw = "sub_id_4="
        val nncnjjxjijjijdjiijfijd = "deviceID="

        val dekekwwoooskd: String? = Hawk.get(dokkoepwlplplpsalpdok, "null")
        val bbxhxhixcj:String? = Hawk.get(qopqqp, "null")
        val owkkowokwokokoksdodsa = "sub_id_5="

        val rokekowkookks = "com.socialquantum.acityinta"
        val cjixjijivcjixji = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        if (bbxhxhixcj != "null"){
            ijsdjifijdji = "$nnbijjis$bbhbx$bbxhxhixcj&$nncnjjxjijjijdjiijfijd$cjixjijivcjixji&$pelw$uchhxjijikok&$oaksoskkosdijw$rokekowkookks&$owkkowokwokokoksdodsa$eokwok&$yxicioksokkod$qoqkkqoqokkossd"
            gotoorodods(cjixjijivcjixji.toString())
        } else {
            ijsdjifijdji = "$nnbijjis$bbhbx$dekekwwoooskd&$nncnjjxjijjijdjiijfijd$cjixjijivcjixji&$pelw$uchhxjijikok&$oaksoskkosdijw$rokekowkookks&$owkkowokwokokoksdodsa$eokwok&$yxicioksokkod$goxok"
            gotoorodods(cjixjijivcjixji.toString())
        }

        return eowk.getString("SAVED_URL", ijsdjifijdji).toString()
    }




    private fun hchxiijxcjijivij(owoksok: String): Boolean {

        val xozkkokokoxokcjijihu = packageManager
        try {

            xozkkokokoxokcjijihu.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)

            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }


    override fun onBackPressed() {


        if (rokekokosokaokixjicjizij.canGoBack()) {
            if (yeuhijsjdjjadux) {
                rokekokosokaokixjicjizij.stopLoading()
                rokekokosokaokixjicjizij.loadUrl(doskkokoxkocvo)
            }
            this.yeuhijsjdjjadux = true
            rokekokosokaokixjicjizij.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                yeuhijsjdjjadux = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }
    override fun onActivityResult(epps: Int, bovoc: Int, owokakoa: Intent?) {
        if (epps != llockxvjihuhudhu || cxjivji == null) {
            super.onActivityResult(epps, bovoc, owokakoa)
            return
        }
        var jjxhuzhuijisjdjiw: Array<Uri>? = null


        if (bovoc == AppCompatActivity.RESULT_OK) {
            if (owokakoa == null || owokakoa.data == null) {

                jjxhuzhuijisjdjiw = arrayOf(Uri.parse(owiwji))
            } else {
                val hnbbvbbvcj = owokakoa.dataString
                if (hnbbvbbvcj != null) {
                    jjxhuzhuijisjdjiw = arrayOf(Uri.parse(hnbbvbbvcj))
                }
            }
        }
        cxjivji?.onReceiveValue(jjxhuzhuijisjdjiw)
        cxjivji = null
    }


    @SuppressLint("SetJavaScriptEnabled")
    private fun tgioioiovioiocijvibo() {

        val poeplp = rokekokosokaokixjicjizij.settings
        poeplp.loadWithOverviewMode = true
        poeplp.userAgentString = poeplp.userAgentString.replace("; wv", "")
        poeplp.javaScriptEnabled = true
        poeplp.domStorageEnabled = true
        poeplp.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        poeplp.allowContentAccess = true
        poeplp.allowFileAccess = true
        poeplp.javaScriptCanOpenWindowsAutomatically = true
        poeplp.displayZoomControls = false

        poeplp.setSupportMultipleWindows(false)
        poeplp.setSupportZoom(true)

        poeplp.pluginState = WebSettings.PluginState.ON
        poeplp.builtInZoomControls = true
        poeplp.useWideViewPort = true

    }

    private fun gotoorodods(gxxbb: String) {
        OneSignal.setExternalUserId(
            gxxbb,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(pllpplakoskoako: JSONObject) {
                    try {
                        if (pllpplakoskoako.has("push") && pllpplakoskoako.getJSONObject("push").has("success")) {
                            val ixjzjicji = pllpplakoskoako.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $ixjzjicji"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (pllpplakoskoako.has("email") && pllpplakoskoako.getJSONObject("email").has("success")) {
                            val uixjxicji =
                                pllpplakoskoako.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $uixjxicji"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (pllpplakoskoako.has("sms") && pllpplakoskoako.getJSONObject("sms").has("success")) {
                            val fokckookxkovjijic = pllpplakoskoako.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $fokckookxkovjijic"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }







}