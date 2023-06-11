package com.example.jetnote.data

import com.example.jetnote.model.Note

class NotesDataSource{
    fun loadNotes(): List<Note>{
        return listOf(
            Note(title = "Jag Saara", description = "Earth is Healing"),
            Note(title = "Jag Saara", description = "Earth is Healing"),
            Note(title = "Jag Saara", description = "Earth is Healing"),
            Note(title = "Jag Saara", description = "Earth is Healing"),
            Note(title = "Jag Saara", description = "Earth is Healing"),
            Note(title = "Jag Saara", description = "Earth is Healing"),
            Note(title = "Jag Saara", description = "Earth is Healing"),
            Note(title = "Jag Saara", description = "Earth is Healing"),
            Note(title = "Jag Saara", description = "Earth is Healing"),
            Note(title = "Jag Saara", description = "Earth is Healing")
        )
    }
}
