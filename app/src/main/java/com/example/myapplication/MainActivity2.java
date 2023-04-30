package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
List<Car> cars=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        InicializeData();
        RecyclerView recyclerView=findViewById(R.id.recycle);
        Adapter adapter= new Adapter(this,cars);
        recyclerView.setAdapter(adapter);

    }
    public void InicializeData(){
        cars.add(new Car("Mercedes-Benz S-класс (ориг. S-Klasse, от нем. Sonderklasse — «особый класс») — флагманская серия представительских автомобилей немецкой компании Mercedes-Benz, дочернего подразделения концерна Daimler AG","367- 510","Merseses S-class",R.drawable.w223));
        cars.add(new Car("Audi A8 — автомобиль представительского класса производимый концерном Audi AG в городе Неккарзульм, Германия, преемник модели Audi V8.","230-420","Audi A8", R.drawable.a8));
        cars.add(new Car("BMW 7, или седьмая серия BMW — автомобили серии представительского класса. Начиная с 1977 года, было выпущено семь поколений этой серии. В 2022 году компания BMW представила новую BMW 7 в кузове G70. Основными конкурентами BMW 7 являются автомобили Mercedes-Benz S-класс, Audi A8, Lexus LS и Jaguar XJ.","250","BMW 7-й серии",R.drawable.series7));
        cars.add(new Car("Mercedes-Benz G-класс, иногда именуемый G-Wagen (G — сокр. от нем. Geländewagen — [ɡəˈlɛːndəvaːɡn], «внедорожник»), — серия полноразмерных люксовых внедорожников (автомобилей повышенной проходимости), производимых в Австрии фирмой Magna Steyr[1][2] (ранее Steyr-Daimler-Puch[3]) и продаваемых под торговой маркой Mercedes-Benz. Выпускается с 1979 года по настоящее время.","450","Mercedes-Benz G-класс",R.drawable.gclass));


    }
}