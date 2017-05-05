package cn.andoop.android.apin.tab;

/* * * * * * * * * * * * * * * * * * *
* author :andoop　　　　　　　　　　　
* time   :2017/4/27
* explain：消息页面
* * * * * * * * * * * * * * * * * * */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andoop.andooptabframe.AndoopPage;

import butterknife.ButterKnife;
import cn.andoop.android.apin.R;

public class MsgPage extends BaseTab {
    @Override
    public void onSelect(AndoopPage andoopPage, int pos) {
        super.onSelect(andoopPage, pos);
    }

    @Override
    protected View initView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment_msg, null);
        ButterKnife.inject(this,view);
        return view;
    }

    @Override
    protected void initData() {

    }
}
