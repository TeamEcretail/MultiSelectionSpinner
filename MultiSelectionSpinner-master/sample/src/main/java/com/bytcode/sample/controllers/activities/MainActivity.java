package com.bytcode.sample.controllers.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.bytcode.lib.spinner.multiselectspinner.data.KeyPairBoolData;
import com.bytcode.lib.spinner.multiselectspinner.spinners.MultiSpinner;
import com.bytcode.lib.spinner.multiselectspinner.spinners.MultiSpinnerSearch;
import com.bytcode.lib.spinner.multiselectspinner.spinners.SingleSpinner;
import com.bytcode.lib.spinner.multiselectspinner.spinners.SingleSpinnerSearch;
import com.bytcode.lib.spinner.multiselectspinner.interfaces.SpinnerListener;
import com.bytcode.sample.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final List<String> list = Arrays.asList(getResources().getStringArray(R.array.sports_array));

        final List<KeyPairBoolData> listArray0 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            KeyPairBoolData h = new KeyPairBoolData();
            h.setId(i + 1);
            h.setName(list.get(i));
            h.setSelected(false);
            listArray0.add(h);
        }

        final List<KeyPairBoolData> listArray1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            KeyPairBoolData h = new KeyPairBoolData();
            h.setId(i + 1);
            h.setName(list.get(i));
            h.setSelected(false);
            listArray1.add(h);
        }

        final List<KeyPairBoolData> listArray2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            KeyPairBoolData h = new KeyPairBoolData();
            h.setId(i + 1);
            h.setName(list.get(i));
            h.setSelected(false);
            listArray2.add(h);
        }
        final List<KeyPairBoolData> listArray3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            KeyPairBoolData h = new KeyPairBoolData();
            h.setId(i + 1);
            h.setName(list.get(i));
            h.setSelected(false);
            listArray3.add(h);
        }

        MultiSpinner spinner = findViewById(R.id.singleSpinner1);
        spinner.setDefaultText("hello");
    }
}
