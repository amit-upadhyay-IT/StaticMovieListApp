package example.com.traktmovieapp.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import example.com.traktmovieapp.R;

public class MovieDetailsActivity extends AppCompatActivity {

    private TextView movieOverviewTV;

    public void initViews()
    {
        movieOverviewTV = (TextView) findViewById(R.id.movieOverviewTV);
        Bundle bundle = getIntent().getExtras();
        String ov = bundle.getString("KEY");
        movieOverviewTV.setText(ov);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        initViews();
    }
}
