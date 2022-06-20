package com.example.tv;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity extends FragmentActivity {
    ArrayList<Model> bionicles = new ArrayList<Model>();

    LinearLayoutManager HorizontalLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setData();
        RecyclerView recyclerView = findViewById(R.id.recycleView);
        RecyclerAdapter adapter = new RecyclerAdapter(this, bionicles);
        recyclerView.setAdapter(adapter);

        HorizontalLayout
                = new LinearLayoutManager(
                MainActivity.this,
                LinearLayoutManager.VERTICAL,
                false);
        recyclerView.setLayoutManager(HorizontalLayout);

    }

    private void setData(){




        bionicles.add(new Model (R.drawable.tahu, "Таху - Тоа Огня"));
        bionicles.add(new Model (R.drawable.leva, "Лева - Тоа Воздуха"));
        bionicles.add(new Model (R.drawable.gali, "Гали -Тоа Воды"));
        bionicles.add(new Model (R.drawable.kopaka, "Копака -Тоа Льда"));
        bionicles.add(new Model (R.drawable.onua, "Онуа - Тоа Земли"));
        bionicles.add(new Model (R.drawable.pohatu, "Похату - Тоа камня"));
        bionicles.add(new Model (R.drawable.tanok, "Танок - Борок Огня"));
        bionicles.add(new Model (R.drawable.makuta, "Макута - Владыка теней"));

    }
}