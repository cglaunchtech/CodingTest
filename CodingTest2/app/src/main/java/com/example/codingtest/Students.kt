package com.example.codingtest

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "students")
data class Students(
    @PrimaryKey(autoGenerate = true) var name: String,
    @ColumnInfo() var age: Int,
    @ColumnInfo() var roll: Int
)
