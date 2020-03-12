import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.mochluxman.kanesaapp.R

class RoamingFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_roaming, container, false)
        val  mWebView = view?.findViewById(R.id.webView1) as WebView
        mWebView.loadUrl("http://smkn1kepanjen.sch.id/web/")

        val webSettings = mWebView.getSettings()
        webSettings.setJavaScriptEnabled(true)

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(WebViewClient())
    }
}