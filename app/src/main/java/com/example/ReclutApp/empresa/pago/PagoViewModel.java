package com.example.ReclutApp.empresa.pago;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PagoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PagoViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}