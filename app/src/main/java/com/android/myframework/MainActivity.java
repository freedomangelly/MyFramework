package com.android.myframework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class MainActivity extends AppCompatActivity {
    Observer observer;
    Subscriber subscriber;
    Observable observable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Schedulers.immediate(): 直接在当前线程运行，相当于不指定线程。这是默认的 Scheduler。
     * •Schedulers.newThread(): 总是启用新线程，并在新线程执行操作。
     * •Schedulers.io(): I/O 操作（读写文件、读写数据库、网络信息交互等）所使用的 Scheduler。行为模式和 newThread() 差不多，区别在于 io() 的内部实现是是用一个无数量上限的线程池，可以重用空闲的线程，因此多数情况下 io() 比 newThread() 更有效率。不要把计算工作放在 io() 中，可以避免创建不必要的线程。
     * •Schedulers.computation(): 计算所使用的 Scheduler。这个计算指的是 CPU 密集型计算，即不会被 I/O 等操作限制性能的操作，例如图形的计算。这个 Scheduler 使用的固定的线程池，大小为 CPU 核数。不要把 I/O 操作放在 computation() 中，否则 I/O 操作的等待时间会浪费 CPU。
     * •另外， Android 还有一个专用的 AndroidSchedulers.mainThread()，它指定的操作将在 Android 主线程运行。
     */

    private void observable() {
        observable = (Observable) Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("hello");
                subscriber.onNext("hi");
                subscriber.onNext("Aloha");
                subscriber.onCompleted();
            }
        }).observeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);//调用观察者

        Observable.just("hello", "hi", "aloba")
                .subscribeOn(Schedulers.io()) // 指定 subscribe() 发生在 IO 线程
                .observeOn(AndroidSchedulers.mainThread()) // 指定 Subscriber 的回调发生在android主线程
                .subscribe(observer);//调用观察者

    }

//    private void maps(){
//        Observable.just("images/log.png")//输入类型String
//        .map(new Func1<String, Bitmap>() {
//            @Override
//            public Bitmap call(String s) {   //返回类型string
//                return getBitmapFromPath(filePath); // 返回类型 Bitmap ;
//            }
//        }).subscribe(new Action1<Bitmap>() {
//            @Override
//            public void call(Bitmap bitmap) {     // 参数类型 Bitmap
//                // showBitmap(bitmap);
//            }
//        });
//    }

//    private void from() {
//        Student[] students = new Student[3];
//        Subscriber<Student> subscriber = new Subscriber<Student>() {
//            @Override
//            public void onCompleted() {
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onNext(Student student) {
//                List<Course> courses = student.getCourses();
//                for (int i = 0; i < courses.size(); i++) {
//                    Course course = courses.get(i);
//                    String name = courses.getName();
//                }
//            }
//        };
//        Observable.from(students).subscribe(subscriber);
//    }


    public void observer() {//观察者
        observer = new Observer() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Object o) {

            }
        };


    }

    public void subscriber() {
        subscriber = new Subscriber() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Object o) {

            }

            @Override
            public void onStart() {
                super.onStart();
            }
        };

        boolean isSubscribeing = subscriber.isUnsubscribed();
        if (isSubscribeing) {
            subscriber.unsubscribe();//取消订阅（事件）
        }
    }
}

