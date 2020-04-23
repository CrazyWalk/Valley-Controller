package cn.luyinbros.valleyframework.controller;

import android.content.Intent;
import android.os.Bundle;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface ControllerActivityDelegate {

    /**
     * 初始化及视图创建
     *
     * @see Activity#onCreate(Bundle)
     */
    void onCreate(@Nullable Bundle savedInstanceState);

    /**
     * 接收onRequestPermissionsResult 回调
     *
     * @see Activity#onRequestPermissionsResult(int, String[], int[])
     */
    void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults);

    /**
     * onActivityResult 回调
     *
     * @see Activity#onActivityResult(int, int, Intent)
     */
    void onActivityResult(int requestCode, int resultCode, @Nullable Intent data);

    /**
     * 解除activity与delegate的关系
     *
     * @see Activity#onDestroy()
     */
    void unbind();



}
