package com.nopalyer.mpchart;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieChartActivity extends AppCompatActivity {

   PieChart pieChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);

        pieChart = findViewById(R.id.pieChart);


        PieDataSet pieDataSet = new PieDataSet(pieChartDataSet(),"data");
        pieDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        pieDataSet.setValueLineColor(R.color.colorAccent);
        pieDataSet.setValueTextSize(14f);

        PieData pieData = new PieData(pieDataSet);

        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.setCenterText("data");
        pieChart.animate();
    }

    private ArrayList<PieEntry> pieChartDataSet(){
        ArrayList<PieEntry> dataSet = new ArrayList<PieEntry>();

        dataSet.add(new PieEntry(0,40));
        dataSet.add(new PieEntry(1,10));
        dataSet.add(new PieEntry(2,15));
        dataSet.add(new PieEntry(3,12));
        dataSet.add(new PieEntry(4,20));
        dataSet.add(new PieEntry(5,50));
        dataSet.add(new PieEntry(6,23));
        dataSet.add(new PieEntry(7,34));
        dataSet.add(new PieEntry(8,12));
        return  dataSet;


    }

}
