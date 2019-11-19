package com.example.esoftwarica.ui.addstudents;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AddStudentsViewModel extends ViewModel {




    private MutableLiveData<String> mText;



    public AddStudentsViewModel() {
        mText = new MutableLiveData<>();


    }




    public LiveData<String> getText() {
        return mText;
    }


    }



