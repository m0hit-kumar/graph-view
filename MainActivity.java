<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <com.jjoe64.graphview.GraphView

        android:id="@+id/graph"

        android:layout_width="402dp"
        android:layout_height="674dp"
        android:layout_marginStart="4dp"
        android:layout_marginLeft="4dp"
        app:layout_constraintStart_toStartOf="parent"
        tools:ignore="MissingConstraints"
        tools:layout_editor_absoluteY="60dp" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="function"
        tools:layout_editor_absoluteX="9dp"
        tools:layout_editor_absoluteY="15dp" />

    <EditText
        android:id="@+id/editText"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="textPersonName"
        android:text="enetr function here"
        tools:layout_editor_absoluteX="148dp"
        tools:layout_editor_absoluteY="9dp" />


</androidx.constraintlayout.widget.ConstraintLayout>