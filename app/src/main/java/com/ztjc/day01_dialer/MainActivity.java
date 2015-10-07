package com.ztjc.day01_dialer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * 开发一个电话拨号器
 * 思路：
 *      1.编写界面
 *      2.编写逻辑代码
 *      3.添加权限
 */
public class MainActivity extends Activity {

    // 声明控件
    private EditText etPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 实例化控件
        etPhone = (EditText) findViewById(R.id.et_phone);
    }

    /**
     * 拨打电话的方法
     * @param view
     */
    public void call(View view) {

        // 获取电话号码
        String phoneNum = etPhone.getText().toString();
        // 创建打电话的意图
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + phoneNum));
        // 拨打电话
        startActivity(intent);
    }
}
