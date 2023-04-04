package com.example.piechart;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.androidplot.pie.PieChart;
import com.androidplot.pie.Segment;
import com.androidplot.pie.SegmentFormatter;
import com.androidplot.ui.PositionMetrics;
import com.androidplot.ui.Size;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Double Value1 = 10.0;
    Double Value2 = 15.0;
    Double Value3 = 20.0;
    Double Value4 = 5.0;

    Integer length = 0;

    PieChart pieChart;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Segment s1;
//        Segment s2;
//        Segment s3;
//        Segment s4;

        ArrayList<Double> arrayList = new ArrayList<>();
        ArrayList<Segment> snList = new ArrayList<Segment>();
        ArrayList<String> compList = new ArrayList<>();
        ArrayList<SegmentFormatter> sfList= new ArrayList<>();
        ArrayList<Integer> colorList = new ArrayList<>();


        colorList.add(-65536);
        colorList.add(-16711936);
        colorList.add(-256);
        colorList.add(-16776961);


        compList.add("1");
        compList.add("2");
        compList.add("3");
        compList.add("4");

        arrayList.add(Value1);
        arrayList.add(Value2);
        arrayList.add(Value3);
        arrayList.add(Value4);

        pieChart = findViewById(R.id.pieChart);

//        s1 = new Segment("S1",arrayList.get(0));
//        s2 = new Segment("S2",arrayList.get(1));
//        s3 = new Segment("S3",arrayList.get(2));
//        s4 = new Segment("S4",arrayList.get(3));
//
//        SegmentFormatter sf1 = new SegmentFormatter(Color.BLUE);
//        SegmentFormatter sf2 = new SegmentFormatter(Color.YELLOW);
//        SegmentFormatter sf3 = new SegmentFormatter(Color.GREEN);
//        SegmentFormatter sf4 = new SegmentFormatter(Color.RED);
//
//
//
//        pieChart.addSegment(s1,sf1);
//        pieChart.addSegment(s2,sf2);
//        pieChart.addSegment(s3,sf3);
//        pieChart.addSegment(s4,sf4);

        if(length==0){
            Segment sn = new Segment("No Company",1);
            SegmentFormatter sfn = new SegmentFormatter(Color.GREEN);
            pieChart.addSegment(sn, sfn);
            Toast.makeText(this, "No Company added yet", Toast.LENGTH_LONG).show();
        }

        for (int j = 0; j < length; j++) {
            snList.add(new Segment(compList.get(j), arrayList.get(j)));
            sfList.add(new SegmentFormatter(colorList.get(j)));
            pieChart.addSegment(snList.get(j), sfList.get(j));
        }



        pieChart.getLegend().setVisible(true);



    }
}