package br.edu.ifsp.scl.ads.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import br.edu.ifsp.scl.ads.cadastro.model.Formulario;

public class MainActivity extends AppCompatActivity {
    private EditText fullname;
    private EditText phone;
    private EditText email;
    private EditText city;
    private CheckBox subscribe;
    private RadioGroup sex;
    private RadioButton male;
    private RadioButton female;
    private Spinner state;
    private Button clear;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindElementsToView();

        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                fullname.setText("");
                phone.setText("");
                email.setText("");
                subscribe.setChecked(false);
                city.setText("");
                sex.check(R.id.maleRb);
                state.setSelection(0);
            }
        });

        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(!existsErrors()){
                    Formulario formulario = new Formulario();
                    formulario.setFullName(String.valueOf(fullname.getText()));
                    formulario.setPhoneNumber(String.valueOf(phone.getText()));
                    formulario.setEmail(String.valueOf(email.getText()));
                    formulario.setCity(String.valueOf(city.getText()));
                    formulario.setState(String.valueOf(state.getSelectedItem()));
                    formulario.setEmail(String.valueOf(email.getText()));
                    formulario.setSubscribed(subscribe.isChecked());
                    formulario.setSex(male.isChecked() ? 'M' : 'F');

                    Toast.makeText(getApplicationContext(), formulario.toString(), Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    private boolean existsErrors() {
        boolean foundErrors = false;
        if(fullname.getText().length() < 1){
            fullname.setError("Preencha antes de continuar");
            foundErrors = true;
        }
        if(phone.getText().length() < 1){
            phone.setError("Preencha antes de continuar");
            foundErrors = true;
        }
        if(email.getText().length() < 1){
            email.setError("Preencha antes de continuar");
            foundErrors = true;
        }
        if(city.getText().length() < 1){
            city.setError("Preencha antes de continuar");
            foundErrors = true;
        }

        return foundErrors;
    }

    private void bindElementsToView(){
        fullname = findViewById(R.id.fullNamePt);
        phone = findViewById(R.id.phoneTp);
        email = findViewById(R.id.emailPt);
        subscribe = findViewById(R.id.subscribeCb);
        city = findViewById(R.id.cityPt);
        sex = findViewById(R.id.radioGroup);
        male = findViewById(R.id.maleRb);
        female = findViewById(R.id.femaleRb);
        state = findViewById(R.id.stateSp);
        clear = findViewById(R.id.clearFormBt);
        submit = findViewById(R.id.saveFormBt);
    }
}