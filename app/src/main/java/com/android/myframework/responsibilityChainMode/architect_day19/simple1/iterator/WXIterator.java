package com.android.myframework.responsibilityChainMode.architect_day19.simple1.iterator;


import com.darren.architect_day19.simple1.UserInfo;

/**
 * Created by hcDarren on 2017/10/22.
 * 微信的具体的迭代器
 */

public class WXIterator implements Iterator<UserInfo>{
    UserInfo[] userInfos;
    int index = 0;

    public WXIterator(UserInfo[] userInfos){
        this.userInfos = userInfos;
    }

    @Override
    public UserInfo next() {
        return userInfos[index++];
    }

    @Override
    public boolean hasNext() {
        return index<userInfos.length;
    }
}
