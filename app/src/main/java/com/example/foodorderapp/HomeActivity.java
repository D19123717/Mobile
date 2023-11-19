package com.example.foodorderapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Assume you have a list of restaurants
        List<Restaurant> restaurants = getRestaurantData();

        // Set up RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RestaurantAdapter adapter = new RestaurantAdapter(this, restaurants);
        recyclerView.setAdapter(adapter);
    }

    private List<Restaurant> getRestaurantData() {
        // Implement a method to fetch restaurant data from your data source
        // For now, creating sample data
        List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant(1, "Restaurant A", "A description for Restaurant A"));
        restaurants.add(new Restaurant(2, "Restaurant B", "A description for Restaurant B"));
        // Add more restaurants as needed
        return restaurants;
    }
}

