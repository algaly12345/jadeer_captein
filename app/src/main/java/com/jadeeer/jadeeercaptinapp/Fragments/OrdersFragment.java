package com.jadeeer.jadeeercaptinapp.Fragments;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.bumptech.glide.Glide;
import com.jadeeer.jadeeercaptinapp.databinding.FragmentOrdersBinding;


import java.util.HashMap;
import java.util.Map;


public class OrdersFragment extends Fragment {

    private FragmentOrdersBinding binding;

    private Uri imageUri;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentOrdersBinding.inflate(inflater, container, false);


        binding.imgCamera.setOnClickListener(camera -> {

        });

        binding.txtUsername.setOnClickListener(username -> {
        });

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(" الطلبات");
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);





    }

}