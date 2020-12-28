package codewithcal.au.customradiogrouptutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView textView;
    RadioButton metal, classical, pop, jazz;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
        // default selected
        updateRadioGroup(metal);
    }

    private void initWidgets()
    {
        textView = findViewById(R.id.textView);
        metal = findViewById(R.id.metal);
        classical = findViewById(R.id.classical);
        pop = findViewById(R.id.pop);
        jazz = findViewById(R.id.jazz);
    }

    public void radioTapped(View view)
    {
        int selectedID = view.getId();

        if(selectedID == R.id.metal)
        {
            updateRadioGroup(metal);
        }
        else if(selectedID == R.id.classical)
        {
            updateRadioGroup(classical);
        }
        else if(selectedID == R.id.pop)
        {
            updateRadioGroup(pop);
        }
        else if(selectedID == R.id.jazz)
        {
            updateRadioGroup(jazz);
        }

    }

    private void updateRadioGroup(RadioButton selected)
    {
        metal.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.radio_off));
        classical.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.radio_off));
        pop.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.radio_off));
        jazz.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.radio_off));

        selected.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.radio_on));

        String selectedString = getString(R.string.favourite_genre) + "\n" + selected.getText();
        textView.setText(selectedString);
    }
}