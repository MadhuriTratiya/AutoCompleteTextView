package madhuri.com.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declare variables
    AutoCompleteTextView autoCompleteTextView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find ID
        autoCompleteTextView = findViewById(R.id.month);
       button = findViewById(R.id.display);

       //Get String of Array from String resource
       String[] item = getResources().getStringArray(R.array.ListOfMonth);

       //Create Adapter
       ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_dropdown_item_1line,item);

       //set Adapter on autocompleteTextview
       autoCompleteTextView.setAdapter(arrayAdapter);
    }

    public void displaydata(View view) {
        Toast.makeText(this, "Selected Month : "+ autoCompleteTextView.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}