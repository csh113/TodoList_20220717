package com.cshka.todolist_20220717.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.cshka.todolist_20220717.datas.TodoData

class TodoListAdapter (
    val mContext : Context,
    val resId : Int,
    val mList: ArrayList<TodoData>
) : ArrayAdapter<TodoData>(mContext, resId, mList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(resId, null)
        }
        val row = tempRow!!

//        val scoreTxt = row.findViewById<TextView>(R.id.scoreTxt)
//        val todoTxt = row.findViewById<TextView>(R.id.todoNameTxt)
//        val storeRatingBar = row.findViewById<ScaleRatingBar>(R.id.storeRatingBar)

//        todoTxt.text = mList[position].to
//        scoreTxt.text = "(${mList[position].score})"
//        Log.d(">>>>>>>>> 별점 : ", mList[position].score.toString())
//        storeRatingBar.rating = mList[position].score.toFloat()

        return row
    }
}