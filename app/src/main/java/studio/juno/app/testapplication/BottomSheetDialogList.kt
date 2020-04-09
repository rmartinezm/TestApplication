package studio.juno.app.testapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottom_sheet_dialog_list.*

/**
 *
 *
 */
class BottomSheetDialogList(private val items: List<String>) : BottomSheetDialogFragment() {

    /**
     *
     *
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.BottomSheetDialog)

    }

    /**
     *
     *
     */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.bottom_sheet_dialog_list, container, false)

    /**
     *
     *
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    /**
     *
     *
     */
    private fun initViews(){
        val adapter = Adapter(items)
        rvList.layoutManager = LinearLayoutManager(context)
        rvList.adapter = adapter;
    }

    /**
     *
     *
     */
    private class Adapter(
        private val items: List<String>
    ) : RecyclerView.Adapter<Adapter.ViewHolder>() {

        /**
         *
         *
         */
        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val tvItem: TextView get() = itemView.findViewById(R.id.tvItem)
        }

        /**
         *
         *
         */
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            ViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_adapter, parent, false)
            )

        /**
         *
         *
         */
        override fun getItemCount(): Int = items.size

        /**
         *
         *
         */
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = items[position]
            holder.tvItem.text = item
        }

    }

}