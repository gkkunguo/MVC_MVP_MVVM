package guokun.com.cn.mvc_mvp_mvvm.MVVM.view.activity;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import guokun.com.cn.mvc_mvp_mvvm.MVVM.view.activity.base.AbsLifecycleActivity;
import guokun.com.cn.mvc_mvp_mvvm.MVVM.vm.MyViewModel2;
import guokun.com.cn.mvc_mvp_mvvm.R;


public class MainActivity2 extends AbsLifecycleActivity<MyViewModel2> {

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }
    @Override
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        mViewModel.getData().observe(this, observer1->{
            for (int i = 0; i < observer1.size(); i++) {
                Log.i("gk", observer1.get(i).getAge() + "," + observer1.get(i).getName());
            }
        });
    }
}
