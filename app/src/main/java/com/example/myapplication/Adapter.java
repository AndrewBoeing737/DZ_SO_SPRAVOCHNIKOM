package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends  RecyclerView.Adapter<Adapter.ViewHolder>{
   private final LayoutInflater layoutInflater;
    final List <Car> cars;

    public Adapter(Context context, List<Car> cars) {
        this.layoutInflater = LayoutInflater.from(context);
        this.cars = cars;
    }



    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view =layoutInflater.inflate(R.layout.layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Car car= cars.get(position);
        holder.opisanie.setText(car.getOpisanie());
        holder.model.setText(car.getModel());
        holder.imageView.setImageResource(car.getPicture());
        holder.power.setText(car.getPower());
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    public static  class ViewHolder extends RecyclerView.ViewHolder{
final ImageView imageView;
final TextView model,power ,opisanie;
        ViewHolder( View view) {
            super(view);
            imageView=view.findViewById(R.id.imageView3);
            model=view.findViewById(R.id.textView2);
            power=view.findViewById(R.id.textView3);
            opisanie=view.findViewById(R.id.textView4);
        }
    }
}
