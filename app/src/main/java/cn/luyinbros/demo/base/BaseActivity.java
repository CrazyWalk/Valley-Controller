package cn.luyinbros.demo.base;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import cn.luyinbros.valleyframework.controller.AbstractControllerActivityDelegate;
import cn.luyinbros.valleyframework.controller.ControllerActivityDelegate;
import cn.luyinbros.valleyframework.controller.ControllerDelegate;
import cn.luyinbros.logger.LoggerFactory;


public abstract class BaseActivity extends AppCompatActivity {
    private ControllerActivityDelegate mDelegate = ControllerDelegate.create(this);

    {
        LoggerFactory.getLogger(BaseActivity.class).debug(" " + mDelegate.getClass());
    }

    @Override
    protected final void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mDelegate.onCreate(savedInstanceState);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        mDelegate.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        mDelegate.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mDelegate.unbind();
    }
}
