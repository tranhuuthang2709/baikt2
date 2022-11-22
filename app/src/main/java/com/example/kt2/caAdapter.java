package com.example.kt2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
public class caAdapter extends ArrayAdapter<ca> {

    @NonNull private  Activity activity;
    private int resource;
    private List<ca> obiects;
    public caAdapter(@NonNull Activity activity, int resource, @NonNull List<ca> objects) {
        super(activity, resource,objects);
        this.activity=activity;
        this.resource=resource;
        this.obiects=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.activity.getLayoutInflater();
        View view = inflater.inflate(this.resource,null);


        TextView txttenkhoahoc = view.findViewById(R.id.txttenkhoahoc);
        TextView txttenthuonggoi = view.findViewById(R.id.txttenthuonggoi);
        ca ca = this.obiects.get(position);
        txttenkhoahoc.setText(ca.getTenkhoahoc());
        txttenthuonggoi.setText(ca.getTenthuonggoi());

        ImageView btnmenu = view.findViewById(R.id.btnmenu);
        btnmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(activity,view);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        if(menuItem.getItemId()==R.id.item_them){
                            Toast.makeText(getContext(), "bạn đã nhấn thêm", Toast.LENGTH_SHORT).show();
                        }
                        if (menuItem.getItemId()==R.id.item_xoa){
                            Toast.makeText(getContext(), "bạn đã nhấn xóa", Toast.LENGTH_SHORT).show();
                        }

                        return false;
                    }
                });
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu,popupMenu.getMenu());
            }
        });
        return view;
    }
}
