package guokun.com.cn.mvc_mvp_mvvm.MVVM.http;

import guokun.com.cn.mvc_mvp_mvvm.MVVM.Entity.HaveDoneListEntity;
import io.reactivex.Flowable;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {
    @FormUrlEncoded
    @POST("TerminalRest.do?method=projectAlreadyList")
    Flowable<Response<HaveDoneListEntity>> projectAlreadyList(@Field("userName") String username,
                                                              @Field("password") String code,
                                                              @Field("departId") String departId,
                                                              @Field("roleId") String roleId,
                                                              @Field("project") String project,
                                                              @Field("page") int page,
                                                              @Field("pageSize") int pageSize);
}
