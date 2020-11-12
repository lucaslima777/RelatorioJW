package lln.relatorio.jw

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import lln.relatorio.jw.model.FieldReportModel

class ReportAdapter(
    private val items: FieldReportModel
) : RecyclerView.Adapter<ReportAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.view_table, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       (holder as ItemViewHolder).bindView(items.name!![position])
    }

    override fun getItemCount(): Int {
        return 5
    }

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val tvTitle: TextView = view.findViewById(R.id.textViewTitle)
        private val tvValue: TextView = view.findViewById(R.id.textViewValue)

        fun bindView(items: String) {
            tvTitle.text = items
        }
    }

}