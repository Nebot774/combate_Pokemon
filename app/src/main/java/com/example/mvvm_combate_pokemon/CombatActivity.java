package com.example.mvvm_combate_pokemon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CombatActivity extends AppCompatActivity {

    private TextView tvPokemon1Stats, tvPokemon2Stats, tvCombatLog;
    private Button btnCombat;
    private Pokemon pokemon1, pokemon2;

    //comprobamos que los pokemons estan correctos si no finalizamos i mostramos un error
    private void comprobarIntegridad() {
        if (pokemon1 == null || pokemon2 == null) {
            Toast.makeText(this, "Error: Datos de Pokémon no disponibles.", Toast.LENGTH_LONG).show();
            finish(); // Cierra la actividad si los datos no están disponibles
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_combate);

        // Obtener Pokémon del intent
        pokemon1 = (Pokemon) getIntent().getSerializableExtra("pokemon1");
        pokemon2 = (Pokemon) getIntent().getSerializableExtra("pokemon2");

        // Comprobar la integridad de los datos de Pokémon
        comprobarIntegridad();

        // Inicialización de los controles de la UI
        tvPokemon1Stats = findViewById(R.id.tvPokemon1Stats);
        tvPokemon2Stats = findViewById(R.id.tvPokemon2Stats);
        tvCombatLog = findViewById(R.id.tvCombatLog);
        btnCombat = findViewById(R.id.btnAttack);

        // Obtener Pokémon del intent
        // ...

        // Configurar el botón de combate
        btnCombat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performCombat();
            }
        });

        // Actualizar UI inicialmente
        updateUI();
    }

    private void performCombat() {
        // Aquí va la lógica de un intercambio de golpes
        int damageToPokemon2 = calculateDamage(pokemon1, pokemon2);
        pokemon2.setHp(pokemon2.getHp() - damageToPokemon2);

        int damageToPokemon1 = calculateDamage(pokemon2, pokemon1);
        pokemon1.setHp(pokemon1.getHp() - damageToPokemon1);

        // Actualizar la UI con los nuevos estados
        updateUI();

        // Comprobar si alguno de los Pokémon se ha debilitado
        if (pokemon1.getHp() <= 0 || pokemon2.getHp() <= 0) {
            tvCombatLog.setText(pokemon1.getHp() <= 0 ? "¡" + pokemon1.getNombre() + " se ha debilitado!" : "¡" + pokemon2.getNombre() + " se ha debilitado!");
            btnCombat.setEnabled(false); // Desactivar el botón si el combate ha terminado
        }
    }

    private int calculateDamage(Pokemon attacker, Pokemon defender) {
        // Fórmula simple de daño
        int baseDamage = attacker.getAtaque() - defender.getDefensa();
        int specialDamage = attacker.getAtaqueEspecial() - defender.getDefensaEspecial();
        return Math.max(baseDamage, 0) + Math.max(specialDamage, 0);
    }

    //muestra la informacion de el estado de los pokemons
    private void updateUI() {
        if (pokemon1 != null && pokemon2 != null) {
            tvPokemon1Stats.setText("Estadísticas de " + pokemon1.getNombre() + ": HP " + pokemon1.getHp() + ", Ataque " + pokemon1.getAtaque() + "Defensa"+pokemon1.getDefensa()+",Ataque Especial"+pokemon1.getAtaqueEspecial()+",Defensa especial"+pokemon1.getDefensaEspecial());
            tvPokemon2Stats.setText("Estadísticas de " + pokemon2.getNombre() + ": HP " + pokemon2.getHp() + ", Ataque " + pokemon2.getAtaque() + "Defensa"+pokemon2.getDefensa()+",Ataque Especial"+pokemon2.getAtaqueEspecial()+",Defensa especial"+pokemon2.getDefensaEspecial());
        }
    }
}

