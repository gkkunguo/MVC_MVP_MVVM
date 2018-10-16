package guokun.com.cn.mvc_mvp_mvvm.MVVM.model.repository;

import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import guokun.com.cn.mvc_mvp_mvvm.MVVM.Entity.HaveDoneListEntity;
import guokun.com.cn.mvc_mvp_mvvm.MVVM.Entity.User;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import rx.Observable;

public class MyRepository {
    private MutableLiveData<List<User>> users;

    public MutableLiveData<List<User>> getUsers() {
        if (users == null) {
            users = new MutableLiveData<List<User>>();
            loadUser();
        }
        return users;
    }

    private void loadUser() {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                int i = 1;
//                List<User> user = new ArrayList<User>();
//                for (int a = 0; a < 100; a++) {
//                    user.add(new User("age" + (a), "name" + (a)));
//                }
//                users.postValue(user);
//            }
//        }).start();

//        MediaType mediaType = MediaType.parse("text/x-markdown; charset=utf-8");
//        Request request = new Request.Builder()
//                .url("http://172.16.100.5:8088/zgdj/TerminalRest.do?method=projectAlreadyList&userName=13647316552&password=MTIzNDU2Nzg%3D%0A&departId=1008&roleId=2c9087bf62d249440162d26a9d830068&project=plan&page=1&pageSize=15")
//                .post(RequestBody.create(mediaType))
//                .build();
//        MediaType mediaType = MediaType.parse("text/x-markdown; charset=utf-8");
//        String requestBody = "I am Jdqm.";
//        Request request = new Request.Builder()
//                .url("https://api.github.com/markdown/raw")
//                .post(RequestBody.create(mediaType, requestBody))
//                .build();
//        OkHttpClient okHttpClient = new OkHttpClient();
//        okHttpClient.newCall(request).enqueue(new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//                Log.d("gk", "onFailure: " + e.getMessage());
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                Log.d("gk", response.protocol() + " " +response.code() + " " + response.message());
//                Headers headers = response.headers();
//                for (int i = 0; i < headers.size(); i++) {
//                    Log.d("gk", headers.name(i) + ":" + headers.value(i));
//                }
//                Log.d("gk" ,"onResponse: " + response.body().string());
//            }
//        });



    }

}
