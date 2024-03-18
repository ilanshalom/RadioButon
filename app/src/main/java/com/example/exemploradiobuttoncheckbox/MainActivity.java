package com.example.exemploradiobuttoncheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Forma 1 para atender evento de click (veja android:onClick no XML):
    public void enviarForm (View v) {
        String str = "Você selecionou ";

        //processamento dos radiobuttons:
        int idradioselec = ((RadioGroup)findViewById(R.id.idGrupoSexo)).getCheckedRadioButtonId();
        if (idradioselec == R.id.idrbFeminino) {
            str += "Feminino";
        }
        else if (idradioselec == R.id.idrbMasculino) {
            str += "Masculino";
        }
        else {
            str += "Outro sexo";
        }

        //processamento do checkbox:
        boolean emailselec = ((CheckBox)findViewById(R.id.idchkEmails)).isChecked();
        if(emailselec == true) {
            str += "\nAceitou receber e-mails.";
        }
        else {
            str += "\nVocê não aceitou receber e-mails.";
        }

        //Também, poderíamos visualizar a mensagem com Toast:
        //Toast.makeText(v.getContext(), str, Toast.LENGTH_LONG).show();

        //Visualizamos uma mensagem com Snackbar:
        Snackbar.make(v, str, Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }
}