package com.example.traineeingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.traineeingproject.databinding.ActivityMultiViewRecyclerViewBinding
import com.example.traineeingproject.databinding.ActivityNumberListUsingRecyclerViewBinding

class MultiViewRecyclerView : AppCompatActivity() {
    private val mrvBinding by lazy {
        ActivityMultiViewRecyclerViewBinding.inflate(LayoutInflater.from(this))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mrvBinding.root)

        val dataList = ArrayList<Data_for_MRV>()
        dataList.add(Data_for_MRV(Adapter_For_MRV.VIEW_TYPE_ONE, "1. Hi! I am in View 1"))
        dataList.add(Data_for_MRV(Adapter_For_MRV.VIEW_TYPE_TWO, "2. Hi! I am in View 2"))
        dataList.add(Data_for_MRV(Adapter_For_MRV.VIEW_TYPE_ONE, "3. Hi! I am in View 3"))
        dataList.add(Data_for_MRV(Adapter_For_MRV.VIEW_TYPE_TWO, "4. Hi! I am in View 4"))
        dataList.add(Data_for_MRV(Adapter_For_MRV.VIEW_TYPE_ONE, "5. Hi! I am in View 5"))
        dataList.add(Data_for_MRV(Adapter_For_MRV.VIEW_TYPE_TWO, "6. Hi! I am in View 6"))
        dataList.add(Data_for_MRV(Adapter_For_MRV.VIEW_TYPE_ONE, "7. Hi! I am in View 7"))
        dataList.add(Data_for_MRV(Adapter_For_MRV.VIEW_TYPE_TWO, "8. Hi! I am in View 8"))
        dataList.add(Data_for_MRV(Adapter_For_MRV.VIEW_TYPE_ONE, "9. Hi! I am in View 9"))
        dataList.add(Data_for_MRV(Adapter_For_MRV.VIEW_TYPE_TWO, "10. Hi! I am in View 10"))
        dataList.add(Data_for_MRV(Adapter_For_MRV.VIEW_TYPE_ONE, "11. Hi! I am in View 11"))
        dataList.add(Data_for_MRV(Adapter_For_MRV.VIEW_TYPE_TWO, "12. Hi! I am in View 12"))
        dataList.add(Data_for_MRV(Adapter_For_MRV.VIEW_TYPE_ONE, "13. Hi! I am in View 13"))
        dataList.add(Data_for_MRV(Adapter_For_MRV.VIEW_TYPE_TWO, "14. Hi! I am in View 14"))
        dataList.add(Data_for_MRV(Adapter_For_MRV.VIEW_TYPE_ONE, "15. Hi! I am in View 15"))
        dataList.add(Data_for_MRV(Adapter_For_MRV.VIEW_TYPE_TWO, "16. Hi! I am in View 16"))
        dataList.add(Data_for_MRV(Adapter_For_MRV.VIEW_TYPE_ONE, "17. Hi! I am in View 17"))
        dataList.add(Data_for_MRV(Adapter_For_MRV.VIEW_TYPE_TWO, "18. Hi! I am in View 18"))

        val adapter = Adapter_For_MRV(this, dataList)
        var multirecyclerView = mrvBinding.multiviewRecyclerView
        multirecyclerView.layoutManager = LinearLayoutManager(this)
        multirecyclerView.adapter = adapter
    }
}