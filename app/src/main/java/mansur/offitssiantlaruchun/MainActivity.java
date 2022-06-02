package mansur.offitssiantlaruchun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    Button ichimlik, salat, ovqat;
    Adapter adapter;
    ArrayList<Ovqat> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        recyclerView = findViewById(R.id.recyclerView);
        ichimlik = findViewById(R.id.ichimliklar);
        salat = findViewById(R.id.salatlar);
        ovqat = findViewById(R.id.Ovqatlar);

        ichimlik.setOnClickListener(view -> {
            setIchimliklar();
            adapter = new Adapter(this, arrayList);
            recyclerView.setAdapter(adapter);
        });

        salat.setOnClickListener(view ->{
            setSalatlar();
            adapter = new Adapter(this, arrayList);
            recyclerView.setAdapter(adapter);
        });

        ovqat.setOnClickListener(view -> {
            setOvqatlar();
            adapter = new Adapter(this, arrayList);
            recyclerView.setAdapter(adapter);
        });


        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }

    public void setIchimliklar(){
        arrayList = new ArrayList<>();
        arrayList.add(new Ovqat(MainActivity.class, "Pepsi"));
    }

    public void setSalatlar(){
        arrayList = new ArrayList<>();
        arrayList.add(new Ovqat(MainActivity.class, "Svejie"));
    }

    public void setOvqatlar(){
        arrayList = new ArrayList<>();
        arrayList.add(new Ovqat(MainActivity.class, "Jiz-biz"));
    }

}