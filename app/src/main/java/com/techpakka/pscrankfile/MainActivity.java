package com.techpakka.pscrankfile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSubcategory(View view) {
        Log.d("id",String.valueOf(view.getId()));
        switch (view.getId()){
            case 2131165219:
                navigateActivity("കേരള ചരിത്രം ");
                break;
            case 2131165225:
                navigateActivity("കേരള രാഷ്ട്രീയം ");
                break;
            case 2131165226:
                navigateActivity("കേരളം അടിസ്ഥാന\n" +
                        "വിവരം ");
                break;
            case 2131165227:
                navigateActivity("കേരള നവോഥാനം ");
                break;
            case 2131165228:
                navigateActivity("കേരളത്തിലെ അച്ചടി\n" +
                        "മാധ്യമങ്ങൾ ");
                break;
            case 2131165229:
                navigateActivity("തിരുവിതാംകൂർ ഭരണാധികാരികൾ ");
                break;
            case 2131165230:
                navigateActivity("ഇന്ത്യൻ സ്റ്റേറ്റ്സ്");
                break;
            case 2131165231:
                navigateActivity("ഇന്ത്യൻ ജിയോഗ്രാഫി ");
                break;
            case 2131165232:
                navigateActivity("ഇന്ത്യൻ ഭരണഘടന ");
                break;
            case 2131165220:
                navigateActivity("പ്രാചീന ഭാരതം ");
                break;
            case 2131165221:
                navigateActivity("മധ്യകാല ഭാരതം ");
                break;
            case 2131165222:
                navigateActivity("ആധുനിക ഭാരതം ");
                break;
            case 2131165223:
                navigateActivity("സ്വതന്ത്ര ഭാരതം ");
                break;
        }
    }

    private void navigateActivity(String category) {
        Intent intent = new Intent(MainActivity.this,SubCategoryActivity.class);
        intent.putExtra("category_name",category);
        startActivity(intent);
    }
}
