package guokun.com.cn.mvc_mvp_mvvm.MVVM.view.activity.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView(savedInstanceState);
        setContentView(getLayoutId());
    }

    public abstract void initView(Bundle savedInstanceState);

    public abstract int getLayoutId();
}
