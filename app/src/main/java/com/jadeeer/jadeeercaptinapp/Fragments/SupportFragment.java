package com.jadeeer.jadeeercaptinapp.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.SnapHelper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jadeeer.jadeeercaptinapp.R;
import com.jadeeer.jadeeercaptinapp.databinding.FragmentBookBinding;
import com.jadeeer.jadeeercaptinapp.databinding.FragmentSupportBinding;

public class SupportFragment extends Fragment {
    private FragmentSupportBinding binding;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSupportBinding.inflate(inflater, container, false);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("الدعم الفني");
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SnapHelper snapHelper = new LinearSnapHelper();
    }


}