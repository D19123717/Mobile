package com.example.foodorderapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Retrieve restaurant ID from the Intent
        int restaurantId = getIntent().getIntExtra("restaurantId", -1);

        // Assume you have a method to fetch menu items based on the restaurant ID
        List<MenuItem> menuItems = getMenuItems(restaurantId);

        // Set up RecyclerView to display menu items
        RecyclerView recyclerView = findViewById(R.id.menuRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MenuAdapter adapter = new MenuAdapter(this, menuItems);
        recyclerView.setAdapter(adapter);
    }

    private List<MenuItem> getMenuItems(int restaurantId) {
        // Implement a method to fetch menu items from your data source
        // For now, creating sample data
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Item 1", "Description for Item 1", 10.99));
        menuItems.add(new MenuItem("Item 2", "Description for Item 2", 8.99));
        // Add more menu items as needed
        return menuItems;
    }
}

