package com.joesuperm.colorselector;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.joesuperm.colorselector.view.ColorPickerDialog;
import com.joesuperm.colorselector.view.ColorPickerDialog.OnColorChangedListener;

public class MainActivity extends Activity {
    
    private TextView mTvText = null;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvText = (TextView) findViewById(R.id.txtText);
    }
    
    /**
     * 显示颜色选择对话框
     * 
     * @description
     * @date 2015年7月9日
     * @param view
     */
    public void openColorDialog(View view) {
        ColorPickerDialog dialog = new ColorPickerDialog(this, "选择颜色", new OnColorChangedListener() {
            
            @Override
            public void colorChanged(int color) {
                mTvText.setTextColor(color);
                Toast.makeText(getApplicationContext(), "选择颜色：" + color, Toast.LENGTH_SHORT).show();
            }
        });
        dialog.show();
    }
    
}
