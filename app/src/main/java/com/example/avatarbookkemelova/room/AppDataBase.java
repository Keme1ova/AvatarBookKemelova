package com.example.avatarbookkemelova.room;

import androidx.room.RoomDatabase;
import androidx.room.Database;

import com.example.avatarbookkemelova.models.Student;


@Database(entities = {Student.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract StudentDao studentDao();

}
