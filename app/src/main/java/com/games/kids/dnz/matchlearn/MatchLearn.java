package com.games.kids.dnz.matchlearn;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.games.kids.dnz.matchlearn.fragments.TextFragment;
import com.games.kids.dnz.matchlearn.fragments.ToolbarFragment;


public class MatchLearn extends FragmentActivity implements ToolbarFragment.ToolbarListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_learn);
    }

    public void onButtonClick(int fontsize, String text) {
        TextFragment textFragment =
                (TextFragment)
                        getSupportFragmentManager().findFragmentById(R.id.text_fragment);
        textFragment.changeTextProperties(fontsize, text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_match_learn,
                menu);
        return true;
    }
}
