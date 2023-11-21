# Proyecto de Combate Pokémon en Android

## Descripción
Este proyecto es una aplicación de Android desarrollada en Java que simula combates entre Pokémon. Permite a los usuarios ingresar las estadísticas de dos Pokémon y simula un combate entre ellos, utilizando el patrón de diseño MVVM y LiveData para una arquitectura robusta y mantenible.

## Características
- **Ingreso de Estadísticas Pokémon**: A través de `PokemonValidacion`, los usuarios pueden ingresar estadísticas para dos Pokémon, incluyendo nombre, HP, ataque, defensa, ataque especial y defensa especial.
- **Validación de Datos**: Asegura que los datos ingresados sean correctos antes de proceder al combate.
- **Simulación de Combate**: Utiliza `CombatActivity` para simular un combate entre los dos Pokémon ingresados.
- **Actualización en Tiempo Real**: Muestra los resultados del combate y actualiza las estadísticas en tiempo real.

## Layouts
- `layout_ingreso_datos_pokemon`: Contiene la interfaz gráfica para `PokemonValidacion`, permitiendo la entrada de datos de los Pokémon.
- `layout_combate`: Diseño de interfaz para `CombatActivity`, donde se muestra la simulación del combate y los resultados.

## Configuración y Ejecución
### Requisitos
- Android Studio
- SDK de Android adecuado

### Pasos para la Ejecución
1. Clona el repositorio a tu máquina local.
2. Abre el proyecto con Android Studio.
3. Configura un emulador o conecta un dispositivo Android.
4. Ejecuta la aplicación desde Android Studio.

## Estructura del Proyecto
- `PokemonValidacion`: Actividad para la entrada de datos de los Pokémon, incluye validación.
- `CombatActivity`: Gestiona la lógica y la interfaz de usuario para los combates.
- `Pokemon`: Modelo de datos para representar cada Pokémon en el combate.


