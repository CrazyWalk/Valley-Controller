package cn.luyinbros.demo.tree;


import android.widget.TextView;

import cn.luyinbros.android.controller.annotation.BindView;
import cn.luyinbros.android.controller.annotation.Controller;
import cn.luyinbros.demo.R;

@Controller
public class EActivity extends DActivity {
    @BindView(R.id.text1)
    TextView text1;
}