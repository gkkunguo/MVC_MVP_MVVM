package guokun.com.cn.mvc_mvp_mvvm.MVVM.view.activity;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import java.util.List;

import guokun.com.cn.mvc_mvp_mvvm.MVVM.Entity.User;
import guokun.com.cn.mvc_mvp_mvvm.MVVM.vm.MyViewModel;
import guokun.com.cn.mvc_mvp_mvvm.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyViewModel myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        myViewModel.getUsers().observe(this, observer1->{
            for (int i = 0; i < observer1.size(); i++) {
                Log.i("gk", observer1.get(i).getAge() + "," + observer1.get(i).getName());
            }
        });
    }

//    private Observer observer = new Observer<List<User>>() {
//        @Override
//        public void onChanged(@Nullable List<User> user) {
//            for (int i = 0; i < user.size(); i++) {
//                Log.i("gk", user.get(i).getAge() + "," + user.get(i).getName());
//            }
//        }
//    };

}
