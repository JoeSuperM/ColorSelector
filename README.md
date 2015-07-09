# ColorSelector
Android ColorSelector
#这是一个基于Android的圆形颜色选择对话框组件。它是有一个Java文件实现，由Eclipse编译通过。无任何XML文件关联。具有易用简单，无耦合的优点。
#使用方法：  
（1）将ColorPickDialog.java拷贝到项目中。  
（2）在需要显示颜色选择对话框的地方添加如下代码：  
  显示初始颜色为蓝色  
  public void openColorDialog(View view) {  
        ColorPickerDialog dialog = new ColorPickerDialog(this, Color.BLUE,"选择颜色", new OnColorChangedListener() {
            
            @Override
            public void colorChanged(int color) {
                mTvText.setTextColor(color);
                Toast.makeText(getApplicationContext(), "选择颜色：" + color, Toast.LENGTH_SHORT).show();
            }
        });
        dialog.show();
    }
      
    默认显示是黑色的：  
     public void openColorDialog(View view) {
        ColorPickerDialog dialog = new ColorPickerDialog(this,"选择颜色", new OnColorChangedListener() {
            
            @Override
            public void colorChanged(int color) {
                mTvText.setTextColor(color);
                Toast.makeText(getApplicationContext(), "选择颜色：" + color, Toast.LENGTH_SHORT).show();
            }
        });
        dialog.show();
    }
#效果图：  

![image](https://raw.githubusercontent.com/JoeSuperM/ColorSelector/master/demo.png)  
谢谢！
