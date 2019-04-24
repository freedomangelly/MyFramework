package com.android.myframework.handle.architect;

public class HandlerTest {
	public static void main(String[] args) {
		Looper.prepare();

        ActivityThread thread = new ActivityThread();
        thread.attach(false);

        Looper.loop();
	}
}
