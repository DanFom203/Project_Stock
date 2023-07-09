package com.itis.stock_app.set_off

data class SetOff(
    val id: Int,
    val name: String,
    val urlSetOffPicture: String,
    val urlProfessorPicture: String,
    val professorName: String,
    val advices: String,
    val complexity: String,
    val exampleOfTasksAndExercises: String
)