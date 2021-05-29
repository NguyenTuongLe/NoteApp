package com.sun.noteapp.ui.home

import com.sun.noteapp.data.model.Note
import com.sun.noteapp.data.model.NoteOption
import com.sun.noteapp.data.repository.NoteLocalRepository
import com.sun.noteapp.data.source.OnDataModifiedCallback

class MainPresenter(
    private val view: MainContract.View,
    private val repository: NoteLocalRepository
) : MainContract.Presenter {

    override fun getAllNotesWithOption(option: NoteOption) {
        repository.getNotesWithOption(option, object : OnDataModifiedCallback<List<Note>> {
            override fun onSuccess(data: List<Note>) {
                view.showAllNotes(data)
            }

            override fun onFailed(exception: Exception) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }

    override fun getAllNote() {
        repository.getAllNotes(object : OnDataModifiedCallback<List<Note>> {
            override fun onSuccess(data: List<Note>) {
                view.showAllNotes(data)
            }

            override fun onFailed(exception: Exception) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }

    override fun getNoteCount() {
        repository.getNoteCount(object : OnDataModifiedCallback<Int> {
            override fun onSuccess(data: Int) {
                view.noteCount(data)
            }

            override fun onFailed(exception: Exception) {
                view.noteCount(0)
            }
        })
    }
}
