package guokun.com.cn.mvc_mvp_mvvm.MVVM.vm;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import guokun.com.cn.mvc_mvp_mvvm.MVVM.Entity.User;

public class MyViewModel extends ViewModel {
    private MutableLiveData<List<User>> users;
    public MutableLiveData<List<User>> getUsers() {
        if (users == null) {
            users = new MutableLiveData<List<User>>();
            loadUser();
        }
        return users;
    }

    private void loadUser() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 1;
                List<User> user = new ArrayList<User>();
                for (int a = 0; a < 100; a++) {
                    user.add(new User("age" + (a), "name" + (a)));
                }
                users.postValue(user);
            }
        }).start();
    }
}
