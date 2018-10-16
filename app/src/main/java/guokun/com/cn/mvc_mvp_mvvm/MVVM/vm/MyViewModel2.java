package guokun.com.cn.mvc_mvp_mvvm.MVVM.vm;

import android.app.Application;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

import java.util.List;

import guokun.com.cn.mvc_mvp_mvvm.MVVM.Entity.User;
import guokun.com.cn.mvc_mvp_mvvm.MVVM.model.repository.MyRepository;
import guokun.com.cn.mvc_mvp_mvvm.MVVM.vm.base.AbsViewModel;

public class MyViewModel2 extends AbsViewModel<MyRepository> {


    public MyViewModel2(@NonNull Application application) {
        super(application);
    }

   public MutableLiveData<List<User>> getData(){
       return mRepository.getUsers();
   }




}
