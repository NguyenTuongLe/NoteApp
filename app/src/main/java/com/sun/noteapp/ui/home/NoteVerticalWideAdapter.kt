package com.sun.noteapp.ui.home

import android.annotation.SuppressLint
import android.text.SpannableString
import android.text.Spanned
import android.text.style.StrikethroughSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sun.noteapp.R
import com.sun.noteapp.data.model.Note
import com.sun.noteapp.ui.base.BaseRecyclerViewAdapter
import com.sun.noteapp.ui.base.BaseViewHolder
import com.sun.noteapp.utils.*
import kotlinx.android.synthetic.main.item_note_vertical_wide.view.*

const val PADDING_WIDTH = 10
const val EMPTY = ""

class NoteVerticalWideAdapter(
    private val listener: OnNoteItemClick,
    private val maxWidthItem: Int
) : BaseRecyclerViewAdapter<Note, NoteVerticalWideAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_note_vertical_wide,
            parent,
            false
        )
        return ViewHolder(view, maxWidthItem, listener)
    }

    class ViewHolder(
        itemView: View,
        private val maxWidthItem: Int,
        private val listener: OnNoteItemClick
    ) : BaseViewHolder<Note>(itemView) {

        override fun onBindData(itemData: Note) {
            super.onBindData(itemData)
            itemView.apply {
                textTitleNoteVerticalWide.setBackgroundResource(
                    ColorPicker.getMediumColor(itemData.color)
                )
                layoutContentNoteVerticalWide.setBackgroundResource(
                    ColorPicker.getLightColor(itemData.color)
                )
                textTitleNoteVerticalWide.text = itemData.title
                val content = if (itemData.type == 1) itemData.content
                else ConvertString.showActionCheckListByDataString(itemData.content)
                textContentNoteVerticalWide.text = content

                textRemindTimeNoteVerticalWide.apply {
                    setRemindTime(itemData.remindTime)
                    if (itemData.remindTime == Note.NONE) gone() else visible()
                }

                if (itemData.password != Note.NONE) {
                    iconLockNoteVerticalWide.visible()
                    textContentNoteVerticalWide.text = EMPTY
                } else {
                    iconLockNoteVerticalWide.gone()
                }
            }
        }

        private fun setRemindTime(time: String) {
            val currentTime = getCurrentTimeWithoutSecond()
            if (currentTime.compareTo(time) > 0) {
                val spannableString = SpannableString(time)
                spannableString.setSpan(
                    StrikethroughSpan(),
                    0,
                    time.length,
                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
                )
                itemView.textRemindTimeNoteVerticalWide.text = spannableString
            } else {
                itemView.textRemindTimeNoteVerticalWide.text = time
            }
        }

        override fun onHandleItemClick(mainItem: Note) {
            listener.showNoteDetail(adapterPosition, mainItem)
        }
    }
}
