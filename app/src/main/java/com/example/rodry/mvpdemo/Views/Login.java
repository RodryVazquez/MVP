package com.example.rodry.mvpdemo.Views;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.rodry.mvpdemo.Helpers.ApplicationConstants;
import com.example.rodry.mvpdemo.Interfaces.LoginPresenter;
import com.example.rodry.mvpdemo.Interfaces.LoginView;
import com.example.rodry.mvpdemo.Presenters.LoginPresenterImpl;
import com.example.rodry.mvpdemo.R;

/**
 * Vista Login
 */
public class Login extends AppCompatActivity implements LoginView {

    private EditText edtUserName, edtPassword;
    private Button btnLogin;
    private ProgressBar progressBar;

    //Presentador
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Referenciamos los elementos de la vista :) no es necesario butter knife
        edtUserName = (EditText) findViewById(R.id.edtUserName);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        //Inicializamos la implementacion del presenter
        loginPresenter = new LoginPresenterImpl(this);
    }

    @Override
    public void ShowProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void HideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void SetErrorUser() {
        edtUserName.setError(ApplicationConstants.USERNAME_ERROR);
    }

    @Override
    public void SetErrorPassword() {
        edtPassword.setError(ApplicationConstants.PASSWORD_ERROR);
    }

    @Override
    public void NavigateToHome() {
        startActivity(Home.class);
    }

    /**
     * Lanza un Intent
     * @param activityClass activity target
     */
    private void startActivity(Class<? extends Activity> activityClass) {
        startActivity(new Intent(this, activityClass));
    }

    //OnClick del boton, ejecuta el metodo del presenter
    public void onLogin(View view) {
        //Le agregamos los parametros de usuario y contraseña
        this.loginPresenter.ValidateUser(edtUserName.getText().toString(), edtPassword.getText().toString());
    }
}
