package guokun.com.cn.mvc_mvp_mvvm.MVVM.view.activity.base;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import guokun.com.cn.mvc_mvp_mvvm.MVVM.util.TUtil;
import guokun.com.cn.mvc_mvp_mvvm.MVVM.vm.MyViewModel2;

public abstract class AbsLifecycleActivity<T extends MyViewModel2> extends BaseActivity {
    protected T mViewModel;

    protected <T extends ViewModel> T VMProviders(AppCompatActivity activity, Class modelClass) {
        return (T) ViewModelProviders.of(activity).get(modelClass);
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        mViewModel = VMProviders(this, (Class<T>) TUtil.getInstance(this, 0));
    }

}
