package br.com.siomara.android.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonDeleteAccount;
    private AlertDialog.Builder alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDeleteAccount = findViewById(R.id.buttonDeleteAccount);

        buttonDeleteAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Creates new alert dialog.
                alertDialog = new AlertDialog.Builder(MainActivity.this);

                // Configures the title.
                alertDialog.setTitle("DELETE ACCOUNT.");

                // Configures the message.
                alertDialog.setMessage("This operation cannot be undone. Are you sure you want to delete your account?");

                // Configures the negative button.
                alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "User clicked NO on alert dialog.", Toast.LENGTH_SHORT).show();
                    }
                });

                // Configures the positive button.
                alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "User clicked YES on alert dialog.", Toast.LENGTH_SHORT).show();
                    }
                });

                // Configures an icon.
                alertDialog.setIcon(android.R.drawable.ic_menu_delete);

                // Configures to prevent the user from clicking out of the dialog and closing it.
                // The user is forced to click on one of the dialog buttons.
                alertDialog.setCancelable(false);

                // Creates the alert dialog.
                alertDialog.create();

                // Shows the alert dialog.
                alertDialog.show();

            }
        });

    }
}