package com.example.ReclutApp.empresa.pago;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ReclutApp.databinding.FragmentPagoemBinding;


public class PagoFragment extends Fragment {

    private FragmentPagoemBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PagoViewModel pagoViewModel =
                new ViewModelProvider(this).get(PagoViewModel.class);

        binding = FragmentPagoemBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPago;
        pagoViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}