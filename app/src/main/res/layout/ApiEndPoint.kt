package layout

import android.text.style.UpdateAppearance
import androidx.annotation.RequiresPermission

class ApiEndPoint{

    companion object {
        private  val  SERVER = "http://192.168.0.107/universitaskotilin"
        val CREATE = SERVER+"create_fakultas.php"
        val READ   = SERVER+"read_fakultas.php"
        val UPDATE = SERVER+"update_fakultas.php"
        val DELETE = SERVER+"delete_fakultas.php"
    }
}