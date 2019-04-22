package com.android.myframework.rxjava;

import android.util.Log;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class UseRxjava {
    Observer observer, observer2;
    Subscriber subscriber;
    Observable observable;
    /**
     * Schedulers.immediate(): 直接在当前线程运行，相当于不指定线程。这是默认的 Scheduler。
     * •Schedulers.newThread(): 总是启用新线程，并在新线程执行操作。
     * •Schedulers.io(): I/O 操作（读写文件、读写数据库、网络信息交互等）所使用的 Scheduler。行为模式和 newThread() 差不多，区别在于 io() 的内部实现是是用一个无数量上限的线程池，可以重用空闲的线程，因此多数情况下 io() 比 newThread() 更有效率。不要把计算工作放在 io() 中，可以避免创建不必要的线程。
     * •Schedulers.computation(): 计算所使用的 Scheduler。这个计算指的是 CPU 密集型计算，即不会被 I/O 等操作限制性能的操作，例如图形的计算。这个 Scheduler 使用的固定的线程池，大小为 CPU 核数。不要把 I/O 操作放在 computation() 中，否则 I/O 操作的等待时间会浪费 CPU。
     * •另外， Android 还有一个专用的 AndroidSchedulers.mainThread()，它指定的操作将在 Android 主线程运行。
     */

    public void observable() {
//        observable = (Observable) Observable.create(new Observable.OnSubscribe<String>() {
//            @Override
//            public void call(Subscriber<? super String> subscriber) {
//                subscriber.onNext("hello");
//                subscriber.onNext("hi");
//                subscriber.onNext("Aloha");
//                subscriber.onCompleted();
//            }
//        }).observeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(observer);//调用观察者
//
//        Observable.just("hello", "hi", "aloba")
//                .subscribeOn(Schedulers.io()) // 指定 subscribe() 发生在 IO 线程
//                .observeOn(AndroidSchedulers.mainThread()) // 指定 Subscriber 的回调发生在android主线程
//                .subscribe(observer);//调用观察者
        observable = Observable.create(new ObservableOnSubscribe() {
            @Override
            public void subscribe(ObservableEmitter emitter) throws Exception {
                emitter.onNext("hello");
                emitter.onNext("hi");
                emitter.onNext("aloba");
            }
        });
        observable.observeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);//调用观察者

        Observable.just("hello", "hi", "aloba")
                .subscribeOn(Schedulers.io()) // 指定 subscribe() 发生在 IO 线程
                .observeOn(AndroidSchedulers.mainThread()) // 指定 Subscriber 的回调发生在android主线程
                .subscribe(observer2);//调用观察者

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
            public void onSubscribe(Disposable d) {
                Log.i("info", "onSubscribe");
//                d.dispose();//解除绑定
            }

            @Override
            public void onNext(Object o) {
                Log.i("info", "onNext");
            }

            @Override
            public void onError(Throwable e) {
                Log.i("info", "onError");
            }

            @Override
            public void onComplete() {
                Log.i("info", "onComplete");
            }
        };


        observer2 = new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.i("info", "onSubscribe2");
            }

            @Override
            public void onNext(Object o) {
                Log.i("info", "onNext2");
            }

            @Override
            public void onError(Throwable e) {
                Log.i("info", "onError2");
            }

            @Override
            public void onComplete() {
                Log.i("info", "onComplete2");
            }
        };
    }

    public void subscriber() {
        subscriber = new Subscriber() {
            @Override
            public void onSubscribe(Subscription s) {

            }

            @Override
            public void onNext(Object o) {

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onComplete() {

            }
        };

//        boolean isSubscribeing = subscriber.isUnsubscribed();
//        if (isSubscribeing) {
//            subscriber.unsubscribe();//取消订阅（事件）
//        }
    }

    public void userDisposable() {
        Observable.just("hello").subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                Log.i("info", "hello222" + s);
            }
        });
    }

    /**
     * map()操作符
     * map()操作符，就是把原来的Observable对象转换成另一个Observable对象，同时将传输的数据进行一些灵活的操作，方便Observer获得想要的数据形式。
     */
    public void userMap() {
        Observable<Integer> observable = Observable
                .just("hello")
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) throws Exception {
                        return s.length();
                    }
                });
    }


    /**
     * flatMap()对于数据的转换比map()更加彻底，如果发送的数据是集合，flatmap()重新生成一个Observable对象，并把数据转换成Observer想	要的数据形式。它可以返回任何它想返回的Observable对象。
     */
    public void userFlatMap(){
        List<String> lists=new ArrayList<>();
        lists.add("1");
        lists.add("2");
        lists.add("3");
        Observable.just(lists)
                .flatMap(new Function<List<String>, ObservableSource<?>>() {
                    @Override
                    public ObservableSource<?> apply(List<String> strings) throws Exception {
                        return Observable.fromIterable(strings);
                    }
                });
    }
}
