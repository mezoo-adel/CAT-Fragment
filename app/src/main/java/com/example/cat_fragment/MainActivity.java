package com.example.cat_fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cat_fragmwent.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<String> getNames(){
     ArrayList<String>  namesOfAllah = new ArrayList<>();
    namesOfAllah.add("هو الله");namesOfAllah.add("الذي لا إله إلا هو");namesOfAllah.add("الوهاب");
    namesOfAllah.add("الرزاق");namesOfAllah.add("الكريم");namesOfAllah.add("الباري");
    namesOfAllah.add("المصور");namesOfAllah.add("التواب");namesOfAllah.add("ليس كمثله شيء");
    namesOfAllah.add("الرحمن");namesOfAllah.add("الشكور");namesOfAllah.add("السميع");
    namesOfAllah.add("الرحيم");namesOfAllah.add("المحيي");namesOfAllah.add("البصير");
    namesOfAllah.add("الملك");namesOfAllah.add("المغني");namesOfAllah.add("النافع");
    namesOfAllah.add("القدوس");namesOfAllah.add("الحليم");namesOfAllah.add("المغني");
    namesOfAllah.add("المتعال");namesOfAllah.add("الصبور");namesOfAllah.add("الحميد");
    namesOfAllah.add("البر");namesOfAllah.add("الودود");namesOfAllah.add("المجيد");
    namesOfAllah.add("التواب");namesOfAllah.add("الشكور");
    namesOfAllah.add("الخالق");namesOfAllah.add("له الأسماء الحسنى");
    return namesOfAllah;
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.fragment1, new BlankFragment(getNames())).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment2, new BlankFragment(getNames())).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment3, new BlankFragment( getNames())).commit();

    }


}