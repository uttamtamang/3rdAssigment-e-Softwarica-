package com.example.esoftwarica.ui.dashboard;

import android.app.ActionBar;
import android.widget.Toolbar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.esoftwarica.R;
import com.google.android.material.bottomnavigation.BottomNavigationMenu;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardViewModel extends ViewModel {




    private MutableLiveData<String> mText;



    public DashboardViewModel() {
        mText = new MutableLiveData<>();


    }




    public LiveData<String> getText() {
        return mText;
    }


    }



