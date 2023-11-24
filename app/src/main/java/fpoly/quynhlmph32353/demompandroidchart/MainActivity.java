package fpoly.quynhlmph32353.demompandroidchart;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Product product;
    List<Entry> entries = new ArrayList<>();
    List<Entry> entries2 = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LineChart lineChart = findViewById(R.id.lineChart);
        Product product1 = new Product(1,"Product1",2000);
        Product product2 = new Product(2,"Product2",1000);
        Product product3 = new Product(3,"Product3",4000);
        Product product4 = new Product(4,"Product4",3000);
        Product list [] = {product1,product2,product3,product4};
        for (int i = 0; i < list.length; i++) {
            entries.add(new Entry(list[i].getId(), list[i].getPrice()));
        }
        LineDataSet dataSet = new LineDataSet(entries, "Product");



        Product product5 = new Product(1,"Product1",4000);
        Product product6 = new Product(2,"Product2",5000);
        Product product7 = new Product(3,"Product3",7000);
        Product product8 = new Product(4,"Product4",1000);
        Product list2 [] = {product5,product6,product7,product8};
        for (int i = 0; i < list2.length; i++) {
            entries2.add(new Entry(list2[i].getId(), list2[i].getPrice()));
        }
        LineDataSet dataSet1 = new LineDataSet(entries2,"Sản phẩm");

        dataSet1.setColor(Color.RED);  // Màu sắc của đường
        dataSet1.setLineWidth(2f);      // Độ dày của đường
        dataSet1.setDrawCircles(true);   // Vẽ điểm tròn tại mỗi điểm dữ liệu
        dataSet1.setCircleRadius(6f);    // Độ lớn của điểm tròn
        dataSet1.setCircleColor(Color.RED); // Màu sắc của điểm tròn
        dataSet1.setDrawValues(true);    // Hiển thị giá trị trên mỗi điểm dữ liệu
        dataSet1.setValueTextColor(Color.BLACK);  // Màu sắc của giá trị
        dataSet1.setValueTextSize(12f);  // Kích thước của giá trị
        dataSet1.setDrawFilled(true);            // Tô màu dưới đường
        dataSet1.setFillColor(Color.BLUE);

        dataSet.setColor(Color.GREEN);
        dataSet.setLineWidth(3f);
        dataSet.setDrawCircles(false);  // Không vẽ điểm tròn
        dataSet.setDrawValues(true);
        dataSet.setValueTextColor(Color.DKGRAY);
        dataSet.setValueTextSize(14f);
        dataSet.setDrawFilled(true);            // Tô màu dưới đường
        dataSet.setFillColor(Color.RED);

        LineData lineData = new LineData(dataSet,dataSet1);
//        Một đối tượng LineData được tạo và LineDataSet được thêm vào nó.
//        Đối tượng LineData đại diện cho tất cả dữ liệu của biểu đồ, bao gồm nhiều bộ dữ liệu nếu cần.

        lineChart.setData(lineData);
        lineChart.invalidate();
    }
}