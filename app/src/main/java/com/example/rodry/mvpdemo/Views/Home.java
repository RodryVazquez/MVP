package com.example.rodry.mvpdemo.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.example.rodry.mvpdemo.Interfaces.Home.HomePresenter;
import com.example.rodry.mvpdemo.Interfaces.Home.HomeView;
import com.example.rodry.mvpdemo.Presenters.HomePresenterImpl;
import com.example.rodry.mvpdemo.R;
import com.example.rodry.mvpdemo.Services.ContactModel;

import java.util.List;

/**
 * Vista Home
 */
public class Home extends AppCompatActivity implements HomeView<List<ContactModel>> {

    private ProgressBar homeProgressBar;
    private ListView lstContacts;
    private HomePresenter homePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        homeProgressBar = (ProgressBar)findViewById(R.id.homeProgress);
        lstContacts = (ListView)findViewById(R.id.lstContacts);
        homePresenter = new HomePresenterImpl(this);
        FetchData();
    }

    @Override
    public void ShowProgress() {
        homeProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void HideProgress() {
        homeProgressBar.setVisibility(View.GONE);
    }

    @Override
    public void FetchData() {
        this.homePresenter.FetchData();
    }

    @Override
    public void Response(List<ContactModel> args) {
        if(args.size() > 0){

        }else{
            //TODO
        }
    }
}
