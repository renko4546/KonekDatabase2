package padila1ilham.com.konekdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.app.ProgressDialog
import android.os.Bundle
import android.util.JsonReader
import android.util.Log
import android.widget.Toast
import com.androidnetworking
import layout.Fakultas
import org.json.JSONObject

,AndroidNetworking
import com.androidnetworking,common.Prioryty
import com.androidnetworking,error.ANError
import com.androidnetworking,interfaces,JSONBjectrequesListener
import kotlinx.android.synthetic.main.activity_main.*
import  org.json.JSONbject


class MainActivity : AppCompatActivity() {
    var arrayList = Arraylist<Fakultas>()
    override fun onCreate(savedInstanceState: Bundle?){
        super.oncrate(savedInstancesState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title="Data Fakultas"
        recycle_view.setHasFixedSize(true)
        recycle_view.layoutManage=LinierLayeoutManager(this)
        mFloattingActionButton.setOnclikListener{
            starActivity(intent(this,manageFakultasActivity::class.java))
        }
        loadALLfakultas()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun loadALLfakultas(){
        val loading = ProgressDialog(this)
        loading,setNessage("membuat data..")
        loading.show()

        AndoridNetworking,get(ApiEndPoint.READ)
        .setPriority(Prioryty.MEDIUM)
            .build()
            .getAsJSONObject(object :  : JSONObjectRequestListener {
                override fun onREsponse(response:JSONObject?){
                    arrayList.clear()
                    val jsonArray = response?.optJSONArray("result")
                    if(jsonArray?.length()==0){
                        loading.dismiss()
                        Toast.makeTExt(
                            applicationContext,"fakultas DAta is empety,add the data firsyt"
                        Toast.LENGTH_SHORT
                        )
                    }
                    for(i in 0 until jsonArray?.length()!!){
                        val jsonObject = jsonArrat?.optJSONObject(i)
                        arrayList.add(
                            Fakultas(
                                JsonObject.getString("kode_fakultas"),
                                JsonObject.getString("nama_fakultas"),

                                )
                        )
                        if(jsonArray?.length()-1 == i)
                            loading.dismiss()
                        val adapter = RVAAdapterFakultas(applicationContextmarratList)
                            adapter.notiftyDataSetChanged()
                        recycle_view.adapter = adapter
                    }
                }
            }
            override fun onError(anError: ANError?){
                loading.dissmis()
                Log.d("ONERROR",anError?.errorDetail?.toString())
                Toast.makeTExt(applicationContext,"Connection FAilure",toast.Length_short).show()
            }
            )
    }
}
