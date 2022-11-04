package br.com.etecia.foodfast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // inserindo menu na barra de aplicativos
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    // criando o método para clicar nos itens do menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mPerfil:
                Toast.makeText(getApplicationContext(), "Cliquei no Perfil e a mágica aconteceu", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mPesquisa:
                Toast.makeText(getApplicationContext(), "Cliquei no Pesquisa do tempo e a mágica aconteceu", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mAjuda:
                Toast.makeText(getApplicationContext(), "Cliquei no Ajuda e a mágica aconteceu", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mFeed:
                Toast.makeText(getApplicationContext(), "Cliquei no Feedback e a mágica aconteceu", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mFavorito:
                Toast.makeText(getApplicationContext(), "Cliquei no favorito e a mágica aconteceu", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mConfig:
                Toast.makeText(getApplicationContext(), "Cliquei no configurações e a mágica aconteceu", Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}