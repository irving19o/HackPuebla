package app.hackpuebla.dev_iti.hackpuebla;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity01 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**Esta actividad no lleva vista
         * El estilo está definido en res/drawable/background_splash.xml*/

        /**se crea el intento para ir a la actividad
         * de elegir el tipo de escaneo que se hará*/
        Intent intent = new Intent(this, EnviarUbicacionActivity02.class);
        startActivity(intent);
        finish();
    }

}
