package guokun.com.cn.mvc_mvp_mvvm.MVVM.Entity;

public class User {
    private String age;
    private String name;

    public User(String age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
