package br.com.wfsneto.appsoma;

import android.app.Activity;
import android.os.Bundle;

//imports necessários para a essa aplicação, para ser colocado depois 
import android.widget.*;
import android.view.*;
import android.app.*;

public class AppSomaActivity extends Activity {
    /** Called when the activity is first created. */
	// Declaração de variaveis
	EditText editnumber1, editnumber2;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
     // resgatando o que foi digitado nos EditText
		editnumber1 = (EditText) findViewById(R.id.number1);
		editnumber2 = (EditText) findViewById(R.id.number2);

		// resgatando o butão declarado no main.xml
		Button btsomar = (Button) findViewById(R.id.btsomar);

		// adicione a ação ao botão soma
		btsomar.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View arg0) {
		        // Declaração de variaveis
		        // resgata o valor digitado no primeiro campo
		        double num1 = Double.parseDouble(editnumber1.getText().toString());
		        // resgata o valor digitado no segundo campo
		        double num2 = Double.parseDouble(editnumber2.getText().toString());
		        // o resultado da soma dos dois numeros
		        double res = num1 + num2;

		        // preparando AlertDialog: instanciando e setando valores o objeto AlertDialog
		        // Instância
		        AlertDialog.Builder dialogo = new AlertDialog.Builder(AppSomaActivity.this);
		        // setando título 
		        dialogo.setTitle("Resultado");
		        // setando mensagem 
		        dialogo.setMessage("Soma: " + res);
		        // setando botão
		        dialogo.setNeutralButton("OK", null);
		        // chamando o AlertDialog
		        dialogo.show();
		    }
		});
    }
}
