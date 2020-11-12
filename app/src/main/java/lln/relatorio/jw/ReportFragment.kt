package lln.relatorio.jw

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import lln.relatorio.jw.model.FieldReportModel
import lln.relatorio.jw.model.ReportModel

class ReportFragment : Fragment() {

    private lateinit var recyclerviewReport: RecyclerView

    companion object {
        fun newInstance() = ReportFragment()
    }

    private lateinit var viewModel: ReportViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.report_fragment, container, false)

        setupBind(view)
        setupAdapter()

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initViewModel()
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this).get(ReportViewModel::class.java)

    }

    private fun setupBind(view: View) {
        recyclerviewReport = view.findViewById(R.id.recyclerviewReport)
    }

    private fun setupAdapter() {
        recyclerviewReport.layoutManager = LinearLayoutManager(context)
        //recyclerviewReport.addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.VERTICAL))
        recyclerviewReport.adapter = ReportAdapter(FieldReportModel(getTitle(), "", ReportModel()))
    }

    private fun getTitle(): List<String> {
        return listOf(
            "Publicações",
            "Vídeos mostrados",
            "Horas",
            "Revisitas",
            "Estudos Bíblicos"
        )
    }

}