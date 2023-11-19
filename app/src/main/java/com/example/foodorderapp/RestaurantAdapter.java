package com.example.foodorderapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {
    private List<Restaurant> restaurants;
    private Context context;

    public RestaurantAdapter(Context context, List<Restaurant> restaurants) {
        this.context = context;
        this.restaurants = restaurants;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_restaurant, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Restaurant restaurant = restaurants.get(position);

        holder.restaurantName.setText(restaurant.getName());
        holder.restaurantDescription.setText(restaurant.getDescription());

        // Implement click listener to navigate to Activity 2 (Menu)
        holder.itemView.setOnClickListener(v -> {
            // Pass data to Activity 2 using Intent
            Intent intent = new Intent(context, MenuActivity.class);
            intent.putExtra("restaurantId", restaurant.getId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView restaurantName;
        public TextView restaurantDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            restaurantName = itemView.findViewById(R.id.textRestaurantName);
            restaurantDescription = itemView.findViewById(R.id.textRestaurantDescription);
        }
    }
}

