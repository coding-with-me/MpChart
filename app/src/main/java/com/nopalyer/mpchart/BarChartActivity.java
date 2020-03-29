package com.nopalyer.mpchart;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {

    BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        barChart = findViewById(R.id.barChart);

        BarDataSet barDataSet = new BarDataSet(barChartDataSet(),"data");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(R.color.colorAccent);
        barDataSet.setValueTextSize(14f);
        BarData barData = new BarData(barDataSet);
        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("Bar Chart Data");
        barChart.animateY(1000);

    }

    private ArrayList<BarEntry> barChartDataSet(){
        ArrayList<BarEntry> data = new ArrayList<>();

        data.add(new BarEntry(2000,890));
        data.add(new BarEntry(2002,1290));
        data.add(new BarEntry(2003,600));
        data.add(new BarEntry(2004,850));
        data.add(new BarEntry(2005,790));
        data.add(new BarEntry(2007,1190));
        data.add(new BarEntry(2012,150));
        data.add(new BarEntry(2014,3000));
        data.add(new BarEntry(2016,900));
        data.add(new BarEntry(2020,2000));
        return  data;


    }
}
