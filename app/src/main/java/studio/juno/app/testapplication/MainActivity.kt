package studio.juno.app.testapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    /**
     *
     *
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    /**
     *
     *
     */
    private fun initViews(){
        btnShowDialog.setOnClickListener(this::showDialog)
    }

    /**
     *
     *
     */
    private fun showDialog(ignore: View){
        val bottomSheetDialogList = BottomSheetDialogList(listOf("Hello", "World", "This", "is", "Android"))
        bottomSheetDialogList.show(supportFragmentManager, BottomSheetDialogList::javaClass.name)
    }

}
