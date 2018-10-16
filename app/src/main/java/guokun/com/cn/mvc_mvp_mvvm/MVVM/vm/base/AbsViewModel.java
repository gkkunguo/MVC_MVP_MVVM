package guokun.com.cn.mvc_mvp_mvvm.MVVM.vm.base;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

import guokun.com.cn.mvc_mvp_mvvm.MVVM.util.TUtil;

public class AbsViewModel<T> extends AndroidViewModel {
    public MutableLiveData<String> mutableLiveData;
    public T mRepository;

    public AbsViewModel(@NonNull Application application) {
        super(application);
        mutableLiveData = new MutableLiveData<>();
        mRepository = TUtil.getNewInstance(this, 0);
    }

}
