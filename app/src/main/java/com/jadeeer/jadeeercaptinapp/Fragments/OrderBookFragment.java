package com.jadeeer.jadeeercaptinapp.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;


import com.jadeeer.jadeeercaptinapp.databinding.FragmentBookBinding;

import java.util.ArrayList;


public class OrderBookFragment extends Fragment  {

    private FragmentBookBinding binding;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentBookBinding.inflate(inflater, container, false);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("سجل الطلبات");
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SnapHelper snapHelper = new LinearSnapHelper();
    }



}