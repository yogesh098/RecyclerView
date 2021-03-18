package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecipeMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_method);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String item_name = null;
        if (extras != null) {
            item_name = extras.getString(RecipeListAdapter.EXTRA_NAME);
        }
        TextView heading = findViewById(R.id.food_name);
        ImageView imageView = findViewById(R.id.food_image);
        TextView ingredients = findViewById(R.id.recipe_description);
        heading.setText(item_name);
        if (item_name != null) {
            switch (item_name){
                case "Debs Passover Brownies":
                    imageView.setImageResource(R.drawable.debs_passover_brownie);
                    ingredients.setText(R.string.recipeexample1);
                    break;
                case "The Best Lemon Bars":
                    imageView.setImageResource(R.drawable.lemon_bar);
                    ingredients.setText(R.string.recipeexample2);
                    break;
                case "Fudge Walnut Brownies":
                    imageView.setImageResource(R.drawable.fudge_brownies);
                    ingredients.setText(R.string.recipeexample1);
                    break;
                case "Lemon Cake":
                    imageView.setImageResource(R.drawable.lemon_cake);
                    ingredients.setText(R.string.recipeexample2);
                    break;
                case "Blueberry Peach Cobbler":
                    imageView.setImageResource(R.drawable.cobbler);
                    ingredients.setText(R.string.recipeexample1);
                    break;
                case "Texas Sheet Cake":
                    imageView.setImageResource(R.drawable.sheet_cake);
                    ingredients.setText(R.string.recipeexample2);
                    break;
                case "Espresso Crinkles":
                    imageView.setImageResource(R.drawable.espresso_crinkles);
                    ingredients.setText(R.string.recipeexample1);
                    break;
                case "Chocolate Cherry Cookies":
                    imageView.setImageResource(R.drawable.chocolate_cherry_cookies);
                    ingredients.setText(R.string.recipeexample2);
                    break;
                case "Vanilla Cheesecake":
                    imageView.setImageResource(R.drawable.cheesecake);
                    ingredients.setText(R.string.recipeexample1);
                    break;
                case "Tiramisu":
                    imageView.setImageResource(R.drawable.tiramisu);
                    ingredients.setText(R.string.recipeexample2);
                    break;
                case "Carrot Cake":
                    imageView.setImageResource(R.drawable.carrot_cake);
                    ingredients.setText(R.string.recipeexample1);
                    break;
                case "Blueberry Ice Cream":
                    imageView.setImageResource(R.drawable.blueberry_ice_cream);
                    ingredients.setText(R.string.recipeexample2);
                    break;
                default: break;
            }
        }
    }
}