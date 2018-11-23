package com.example.nguyenpro231998.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    private GridView grv_sach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] tacpham = new String[] {"Tác phẩm: Bí mật của hạnh phúc","Tác phẩm: Ly rượu pha vội","Tác phẩm: Tây du ký"};
        String[] tacgia = new String[] {"Tác giả: David Niven","Tác giả:  James Patterson & Howard Roughan","Tác giả: Ngô Thừa Ân"};
        String[] theloai = new String[] {"Thể loại: Tiểu thuyết","Thể loại: Tiểu thuyết","Thể loại: Tiểu thuyết "};
        Integer[] anh = new Integer[] {R.drawable.a,R.drawable.b,R.drawable.c};
        grv_sach = (GridView)findViewById(R.id.grid_1);
        adtqls adtqls = new adtqls(this,tacpham,tacgia,theloai,anh);
        grv_sach.setAdapter(adtqls);

    }
}
