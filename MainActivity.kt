package cz.infinte.simplebrowser

import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainww1 = ww


        ww.webViewClient = WebViewClient()

        // this will load the url of the website
        ww.loadUrl("https://startpage.com")

        // this will enable the javascript settings
        ww.settings.javaScriptEnabled = true
        0
        // if you want to enable zoom feature
        ww.settings.setSupportZoom(true)
    }

    // if you press Back button this code will work

    override fun onBackPressed() {
        // if your webview can go back it will go back
        if (ww.canGoBack())
            ww.goBack()
        // if your webview cannot go back
        // it will exit the application
        else
            super.onBackPressed()
    }
}
//fun gohome(ww){
//   ww.loadUrl("https://startpage.com")
//}


//fun setww(){
//    if (ww.visible){
//        ww.visibile = false;


  //  }


//}
