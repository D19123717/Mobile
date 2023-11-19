package com.example.foodorderapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {

    private List<MenuItem> menuItems;
    private Context context;

    public MenuAdapter(Context context, List<MenuItem> menuItems) {
        this.context = context;
        this.menuItems = menuItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MenuItem menuItem = menuItems.get(position);

        holder.itemName.setText(menuItem.getName());
        holder.itemDescription.setText(menuItem.getDescription());
        holder.itemPrice.setText(String.format("$%.2f", menuItem.getPrice())); // Format price

        // Implement additional logic as needed
    }

    @Override
    public int getItemCount() {
        return menuItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView itemName;
        public TextView itemDescription;
        public TextView itemPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemName = itemView.findViewById(R.id.textItemName);
            itemDescription = itemView.findViewById(R.id.textItemDescription);
            itemPrice = itemView.findViewById(R.id.textItemPrice);
        }
    }
}
