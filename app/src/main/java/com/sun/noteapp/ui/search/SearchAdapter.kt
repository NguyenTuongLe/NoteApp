package com.sun.noteapp.ui.search

import android.annotation.SuppressLint
import android.content.Context
import android.text.SpannableString
import android.text.Spanned
import android.text.style.BackgroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.sun.noteapp.R
import com.sun.noteapp.data.model.Note
import com.sun.noteapp.data.source.local.NoteDatabase
import com.sun.noteapp.ui.base.BaseRecyclerViewAdapter
import com.sun.noteapp.ui.base.BaseViewHolder
import com.sun.noteapp.utils.*
import kotlinx.android.synthetic.main.item_note_vertical_wide.view.*

class SearchAdapter(
    private val maxWidthItem: Int,
    private val listener: OnSearchItemClick
) : BaseRecyclerViewAdapter<Note, SearchAdapter.ViewHolder>() {

    private var querySearch = EMPTY

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_note_vertical_wide,
                parent,
                false
            ),
            maxWidthItem,
            listener
        )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBindData(getItem(position), querySearch)
    }

    class ViewHolder(
        itemView: View,
        private val maxWidthItem: Int,
        private val listener: OnSearchItemClick
    ) : BaseViewHolder<Note>(itemView) {

        private var note: Note? = null

        init {
            itemView.setOnClickListener{
                 note?.let {
                     listener.showNoteDetail(adapterPosition, it)
                 }
            }
        }

        fun onBindData(itemData: Note, querySearch: String) {
            showDataOnView(itemData, querySearch)
            note = itemData
        }

        private fun showDataOnView(itemData: Note, querySearch: String) {
            itemView.apply {
                textTitleNoteVerticalWide.setBackgroundResource(
                    ColorPicker.getMediumColor(itemData.color)
                )
                layoutContentNoteVerticalWide.setBackgroundResource(
                    ColorPicker.getLightColor(itemData.color)
                )

                textTitleNoteVerticalWide.text = itemData.title
                val contentNote =
                    if (itemData.type == NoteDatabase.TEXT_NOTE) {
                        itemData.content
                    } else {
                        ConvertString.showActionCheckListByDataString(itemData.content)
                    }
                textContentNoteVerticalWide.text = contentNote

                if (querySearch.isNotEmpty()) {
                    highlightText(textTitleNoteVerticalWide, itemData.title, querySearch, context)
                    highlightText(textContentNoteVerticalWide, contentNote, querySearch, context)
                }

                textRemindTimeNoteVerticalWide.apply {
                    text = itemData.remindTime
                    if (text == Note.NONE) gone() else visible()
                }

                if (itemData.password != Note.NONE) {
                    iconLockNoteVerticalWide.visible()
                    textContentNoteVerticalWide.text = EMPTY
                } else {
                    iconLockNoteVerticalWide.gone()
                }
            }
        }

        private fun highlightText(
            textView: TextView,
            text: String,
            queryText: String,
            context: Context
        ) {
            val listIndex = text.allIndexOf(queryText)
            val spannableString = SpannableString(text)
            listIndex.forEach {
                spannableString.setSpan(
                    BackgroundColorSpan(ContextCompat.getColor(context, R.color.color_highlight)),
                    it,
                    it + queryText.length,
                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
                )
            }
            textView.text = spannableString
        }
    }

    fun setQuerySearch(query: String) {
        querySearch = query
        notifyDataSetChanged()
    }

    interface OnSearchItemClick {
        fun showNoteDetail(position: Int, note: Note)
    }
}
