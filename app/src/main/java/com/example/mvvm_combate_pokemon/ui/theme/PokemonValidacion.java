package com.example.mvvm_combate_pokemon.ui.theme;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvvm_combate_pokemon.R;


public class PokemonValidacion extends AppCompatActivity {

    private EditText pokemon1Nombre, pokemon1HP, pokemon1Ataque, pokemon1Defensa, pokemon1AtaqueEspecial, pokemon1DefensaEspecial;
    private EditText pokemon2Nombre, pokemon2HP, pokemon2Ataque, pokemon2Defensa, pokemon2AtaqueEspecial, pokemon2DefensaEspecial;
    private Button startCombatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ingreso_datos_pokemon);

        // Inicializar los campos de Pokémon 1
        pokemon1Nombre = findViewById(R.id.pokemon1Name);
        pokemon1HP = findViewById(R.id.pokemon1HP);
        pokemon1Ataque = findViewById(R.id.pokemon1Ataque);
        pokemon1Defensa = findViewById(R.id.pokemon1Defensa);
        pokemon1AtaqueEspecial = findViewById(R.id.pokemon1AtaqueEspecial);
        pokemon1DefensaEspecial = findViewById(R.id.pokemon1DefensaEspecial);

        // Inicializar los campos de Pokémon 2
        pokemon2Nombre = findViewById(R.id.pokemon2Name);
        pokemon2HP = findViewById(R.id.pokemon2HP);
        pokemon2Ataque = findViewById(R.id.pokemon2Ataque);
        pokemon2Defensa = findViewById(R.id.pokemon2Defensa);
        pokemon2AtaqueEspecial = findViewById(R.id.pokemon2AtaqueEspecial);
        pokemon2DefensaEspecial = findViewById(R.id.pokemon2DefensaEspecial);

        // Inicializar y configurar el botón de combate
        startCombatButton = findViewById(R.id.btnStartCombat);
        startCombatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validarDatosPokemon()) {
                    // Aquí va el código para iniciar el combate
                }
            }
        });





    }
    //Metodo para validar que los datos de los pokemon introducidos son correctos
    private boolean validarDatosPokemon() {
        // Validación para el nombre de Pokémon 1
        if (pokemon1Nombre.getText().toString().trim().isEmpty()) {
            pokemon1Nombre.setError("El nombre es requerido");
            return false;
        }

        // Validación para el HP de Pokémon 1
        if (pokemon1HP.getText().toString().trim().isEmpty()) {
            pokemon1HP.setError("El HP es requerido");
            return false;
        } else {
            int hp = Integer.parseInt(pokemon1HP.getText().toString().trim());
            if (hp < 0 || hp > 999) {
                pokemon1HP.setError("HP debe estar entre 0 y 999");
                return false;
            }
        }

        //Validacion para el ataque del Pokemon 1
        if (pokemon1HP.getText().toString().trim().isEmpty()) {
            pokemon1HP.setError("El ataque  es requerido");
            return false;
        } else {
            int hp = Integer.parseInt(pokemon1HP.getText().toString().trim());
            if (hp < 0 || hp > 999) {
                pokemon1HP.setError("El Ataque debe estar entre 0 y 999");
                return false;
            }
        }

        //Validacion defensa del Pokemon 1
        if (pokemon1HP.getText().toString().trim().isEmpty()) {
            pokemon1HP.setError("La defensa es requerida es requerido");
            return false;
        } else {
            int hp = Integer.parseInt(pokemon1HP.getText().toString().trim());
            if (hp < 0 || hp > 999) {
                pokemon1HP.setError("La defensa debe estar entre 0 y 999");
                return false;
            }
        }

        //Validacion Ataque Especial del Pokemon 1
        if (pokemon1HP.getText().toString().trim().isEmpty()) {
            pokemon1HP.setError("El Ataque Especial es requerido");
            return false;
        } else {
            int hp = Integer.parseInt(pokemon1HP.getText().toString().trim());
            if (hp < 0 || hp > 999) {
                pokemon1HP.setError("Ataque Especial debe estar entre 0 y 999");
                return false;
            }
        }

        //Validacion Defensa Especial del Pokemon 1
        if (pokemon1HP.getText().toString().trim().isEmpty()) {
            pokemon1HP.setError("La Defensa Especial es requerido");
            return false;
        } else {
            int hp = Integer.parseInt(pokemon1HP.getText().toString().trim());
            if (hp < 0 || hp > 999) {
                pokemon1HP.setError("Defensa Especial debe estar entre 0 y 999");
                return false;
            }
        }


        // Validación para el HP de Pokémon 2
        if (pokemon2HP.getText().toString().trim().isEmpty()) {
            pokemon2HP.setError("El HP es requerido");
            return false;
        } else {
            int hp = Integer.parseInt(pokemon2HP.getText().toString().trim());
            if (hp < 0 || hp > 999) {
                pokemon2HP.setError("HP debe estar entre 0 y 999");
                return false;
            }
        }

        //Validacion para el ataque de Pokémon 2
        if (pokemon2Ataque.getText().toString().trim().isEmpty()) {
            pokemon2Ataque.setError("El ataque es requerido");
            return false;
        } else {
            int ataque = Integer.parseInt(pokemon2Ataque.getText().toString().trim());
            if (ataque < 0 || ataque > 999) {
                pokemon2Ataque.setError("El ataque debe estar entre 0 y 999");
                return false;
            }
        }

        //Validacion defensa de Pokémon 2
        if (pokemon2Defensa.getText().toString().trim().isEmpty()) {
            pokemon2Defensa.setError("La defensa es requerida");
            return false;
        } else {
            int defensa = Integer.parseInt(pokemon2Defensa.getText().toString().trim());
            if (defensa < 0 || defensa > 999) {
                pokemon2Defensa.setError("La defensa debe estar entre 0 y 999");
                return false;
            }
        }

        //Validacion Ataque Especial de Pokémon 2
        if (pokemon2AtaqueEspecial.getText().toString().trim().isEmpty()) {
            pokemon2AtaqueEspecial.setError("El ataque especial es requerido");
            return false;
        } else {
            int ataqueEspecial = Integer.parseInt(pokemon2AtaqueEspecial.getText().toString().trim());
            if (ataqueEspecial < 0 || ataqueEspecial > 999) {
                pokemon2AtaqueEspecial.setError("El ataque especial debe estar entre 0 y 999");
                return false;
            }
        }

    //Validacion Defensa Especial de Pokémon 2
        if (pokemon2DefensaEspecial.getText().toString().trim().isEmpty()) {
            pokemon2DefensaEspecial.setError("La defensa especial es requerida");
            return false;
        } else {
            int defensaEspecial = Integer.parseInt(pokemon2DefensaEspecial.getText().toString().trim());
            if (defensaEspecial < 0 || defensaEspecial > 999) {
                pokemon2DefensaEspecial.setError("La defensa especial debe estar entre 0 y 999");
                return false;
            }
        }

        return true;


    }
    }
