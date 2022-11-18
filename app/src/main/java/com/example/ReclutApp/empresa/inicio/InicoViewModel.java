package com.example.ReclutApp.empresa.inicio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InicoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public InicoViewModel() {
        mText = new MutableLiveData<>();

    }

    public LiveData<String> getText() {
        return mText;
    }
}