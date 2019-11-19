package com.example.esoftwarica.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.esoftwarica.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

     Bundle bundle = getArguments();
     if(bundle !=null){

         String name = bundle.getString("name");
         String age = bundle.getString("age");
         String gender = bundle.getString("gender");
         String address = bundle.getString("address");

         Toast.makeText(getContext(),"name:"+name,Toast.LENGTH_SHORT).show();


     }
        return  inflater.inflate(R.layout.fragment_home,container,false);

    }
}