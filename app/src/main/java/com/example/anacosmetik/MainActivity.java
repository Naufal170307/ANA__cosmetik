package com.example.anacosmetik;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    PersonFragment personFragment = new PersonFragment();
    home homeFragment = new home();
    locationFragment locationFragment = new locationFragment();

    ShopFragment shopFragment = new ShopFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, personFragment).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.fr_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, homeFragment).commit();
                        return true;

                    case R.id.fr_location:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, locationFragment).commit();
                        return true;

                    case R.id.fr_shop:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, shopFragment).commit();
                        return true;
                    case R.id.fr_person:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, personFragment).commit();
                        return true;

                }

                return false;
            }
        });

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

    return false;
    }


}