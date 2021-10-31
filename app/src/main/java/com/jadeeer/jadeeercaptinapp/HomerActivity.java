package com.jadeeer.jadeeercaptinapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import androidx.appcompat.app.AppCompatActivity;

import com.jadeeer.jadeeercaptinapp.databinding.ActivityMainBinding;
import com.jadeeer.jadeeercaptinapp.databinding.NavDrawerLayoutBinding;
import com.jadeeer.jadeeercaptinapp.databinding.ToolbarLayoutBinding;

import de.hdodenhof.circleimageview.CircleImageView;

public class HomerActivity extends AppCompatActivity {

    private NavDrawerLayoutBinding navDrawerLayoutBinding;
    private ActivityMainBinding activityMainBinding;
    private ToolbarLayoutBinding toolbarLayoutBinding;
    private CircleImageView imgHeader;
    private TextView txtName, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        navDrawerLayoutBinding = NavDrawerLayoutBinding.inflate(getLayoutInflater());
        setContentView(navDrawerLayoutBinding.getRoot());
        activityMainBinding = navDrawerLayoutBinding.mainActivity;
        toolbarLayoutBinding = activityMainBinding.toolbar;

        setSupportActionBar(toolbarLayoutBinding.toolbar);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                navDrawerLayoutBinding.navDrawer,
                toolbarLayoutBinding.toolbar,
                R.string.open_navigation_drawer,
                R.string.close_navigation_drawer
        );

        navDrawerLayoutBinding.navDrawer.addDrawerListener(toggle);
        toggle.syncState();

        NavController navController = Navigation.findNavController(this, R.id.fragmentContainer);
        NavigationUI.setupWithNavController(
                navDrawerLayoutBinding.navigationView,
                navController
        );

        View headerLayout = navDrawerLayoutBinding.navigationView.getHeaderView(0);

        imgHeader = headerLayout.findViewById(R.id.imgHeader);
        txtName = headerLayout.findViewById(R.id.txtHeaderName);
//        txtEmail = headerLayout.findViewById(R.id.txtHeaderEmail);




    }




//    private BottomNavigationView.OnNavigationItemSelectedListener selectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//
//
//            switch (menuItem.getItemId()) {
//
//                case R.id.nav_book_order:
//                    //actionBar.setTitle("Home");
//                    OrderBookFragment fragment = new OrderBookFragment();
//                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction.replace(R.id.fragmentContainer, fragment, "");
//                    fragmentTransaction.commit();
//                    return true;
//
//                case R.id.nav_wallet:
//                //    actionBar.setTitle("Profile");
//                    WalletFragment fragment1 = new WalletFragment();
//                    FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction1.replace(R.id.fragmentContainer, fragment1);
//                    fragmentTransaction1.commit();
//                    return true;
//
//                case R.id.nav_map:
//                  //  actionBar.setTitle("Users");
//                    MapFragment fragment2 = new MapFragment();
//                    FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction2.replace(R.id.fragmentContainer, fragment2, "");
//                    fragmentTransaction2.commit();
//                    return true;
//
//                case R.id.nav_myorders:
//                    //actionBar.setTitle("Chats");
//                    OrderArchiveFragment listFragment = new OrderArchiveFragment();
//                    FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction3.replace(R.id.fragmentContainer, listFragment, "");
//                    fragmentTransaction3.commit();
//                    return true;
//            }
//            return false;
//        }
//    };
//


    }

