package layout
package com.example.koneksidatabase
        import android.content,.Conetext
        import android.view.View
import android.recyclerview.widget.ErecyclerView

class RVAAdapterFakultas(private val context: Context,private val arraylist: ArrayList<Fakultas>):
        RecyclerView.Adapter<RVAAdapertFakultas.Holder>( ){
    override fun toString(): String {
        return super.toString()
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    class Holder(val view: View): RecyclerView.ViewHolder(view)
}