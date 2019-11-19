package com.example.esoftwarica.ui.dashboard;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.esoftwarica.R;
import com.example.esoftwarica.ui.home.HomeFragment;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public class DashboardFragment extends Fragment implements View.OnClickListener {

    private EditText etname,etage,etaddress;
    private Button btnsave;
    private RadioButton rdom,rdof,rdot;

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_dashboard,container,false);

        etname = v.findViewById(R.id.etname);
        etage = v.findViewById(R.id.etage);
        etaddress = v.findViewById(R.id.etaddress);
        rdom = v.findViewById(R.id.rdomale);
        rdof = v.findViewById(R.id.rdofemale);
        rdot = v.findViewById(R.id.rdoother);
        btnsave = v.findViewById(R.id.btnsave);
        btnsave.setOnClickListener(this);


        return v;



    }

    @Override
    public void onClick(View v) {


        String name = etname.getText().toString();
        String age = etage.getText().toString();
        String address = etaddress.getText().toString();
        String  gender ="";

        if(rdom.isChecked()){

            gender = "male";


        }
        if(rdof.isChecked()){
            gender ="female";

        }
        if(rdot.isChecked()){
            gender ="others";
        }

        Bundle b = new Bundle();
        b.putString("Name",name);
        b.putString("Age",age);
        b.putString("Gender",gender);
        b.putString("Address",address);

        HomeFragment hf = new HomeFragment();

        Bundle bu = new Bundle();
        bu.putString("Name:",name);
        bu.putString("Age:",age);
        bu.putString("Gender:",gender);
        bu.putString("Address",address);

        hf.setArguments(bu);

        FragmentManager fm = getFragmentManager();
       fm.beginTransaction().replace(R.id.navigation_home,hf).commit();










    }
}