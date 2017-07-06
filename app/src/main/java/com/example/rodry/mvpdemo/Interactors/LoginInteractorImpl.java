package com.example.rodry.mvpdemo.Interactors;

import android.os.Handler;

import com.example.rodry.mvpdemo.Interfaces.LoginInteractor;
import com.example.rodry.mvpdemo.Interfaces.OnLoginFinished;

/**
 * Created by Rodry on 7/5/2017.
 */

public class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void ValidateUser(final String user, final String password, final OnLoginFinished listener) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    boolean error = false;
                    if(user.equals("")){
                        listener.SetErrorUser();
                        error = true;
                    }
                    if(password.equals("")){
                        listener.SetErrorPassword();
                        error = true;
                    }
                    if(!error){
                        listener.LoginSuccess();
                    }
                }
            },2000);
    }
}
