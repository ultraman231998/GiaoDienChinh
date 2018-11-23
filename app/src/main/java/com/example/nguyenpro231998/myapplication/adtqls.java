package com.example.nguyenpro231998.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class adtqls extends BaseAdapter {
    Context context;
    String[] tentp;
    String[] tentg;
    String[] theloai;
    Integer[] id_anh;
    LayoutInflater inflater;

    public adtqls(Context context, String[] tentp, String[] tentg, String[] theloai, Integer[] id_anh) {
        this.context = context;
        this.tentp = tentp;
        this.tentg = tentg;
        this.theloai = theloai;
        this.id_anh = id_anh;
        inflater = LayoutInflater.from(context);
    }



    @Override
    public int getCount() {
        return tentp.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        convertView = inflater.inflate(R.layout.item,null);
        ImageView img = (ImageView)convertView.findViewById(R.id.img_anh);
        TextView tv_ten = (TextView)convertView.findViewById(R.id.tv_ten);
        TextView tv_tacgia = (TextView)convertView.findViewById(R.id.tv_tacgia);
        TextView tv_theloai = (TextView)convertView.findViewById(R.id.tv_theloai);
        img.setImageResource(id_anh[i]);
        tv_ten.setText(tentp[i]);
        tv_tacgia.setText(tentg[i]);
        tv_theloai.setText(theloai[i]);
        return convertView      ;
    }
}
