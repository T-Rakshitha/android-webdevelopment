<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">
    <LinearLayout
        android:layout_width="match_parent"

        android:layout_height="0dp"
        android:orientation="vertical"
        android:layout_weight="3">
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="0dp"
            android:padding="30dp"
            android:layout_weight="1"
            android:gravity="center_vertical"
            android:textColor="@color/white"
            android:text=""
            android:layout_gravity="end"
            android:textAlignment="textEnd"
            android:textSize="45sp"
            android:id="@+id/resultsTextView"/>
    </LinearLayout>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:orientation="vertical"
        android:layout_weight="7">
        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:textColor="@color/purple_200"
            android:onClick="oneonclick"
            android:text="1"/>


    </LinearLayout>

</android.support.constraint.ConstraintLayout>

    </androidx.constraintlayout.widget.ConstraintLayout>