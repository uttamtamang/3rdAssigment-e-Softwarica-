package com.example.esoftwarica.ui.aboutus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.esoftwarica.R;

public class AboutusFragment extends Fragment {

    private AboutusViewModel notificationsViewModel;

    public WebView webView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_aboutus, container, false);
        webView = (WebView) v.findViewById(R.id.webview);
        webView.loadUrl("https://softwarica.edu.np/");
        webView.setWebViewClient(new WebViewClient());

        return v;

    }
}