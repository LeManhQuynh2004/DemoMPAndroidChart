package fpoly.quynhlmph32353.demompandroidchart;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        BarChart barChart = findViewById(R.id.barChart);

        // Tạo danh sách dữ liệu (giả định)
        List<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(1, 20));
        entries.add(new BarEntry(2, 35));
        entries.add(new BarEntry(3, 15));
        entries.add(new BarEntry(4, 25));
        entries.add(new BarEntry(5, 30));
        entries.add(new BarEntry(6, 80));
        entries.add(new BarEntry(7, 10));
        entries.add(new BarEntry(8, 25));
        entries.add(new BarEntry(9, 30));
        entries.add(new BarEntry(10, 20));

        BarDataSet dataSet = new BarDataSet(entries, "Doanh số bán hàng");
        dataSet.setColor(Color.BLUE);
        dataSet.setValueTextColor(Color.BLACK);
        dataSet.setValueTextSize(12f);

        XAxis xAxis = barChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);

        YAxis yAxis = barChart.getAxisLeft();
        yAxis.setDrawGridLines(false);

        barChart.getAxisRight().setEnabled(false); // Tắt trục Y bên phải

        // Hiển thị giá trị trên cột
        barChart.setDrawValueAboveBar(true);


        BarData barData = new BarData(dataSet);
        barChart.setData(barData);
    }
}