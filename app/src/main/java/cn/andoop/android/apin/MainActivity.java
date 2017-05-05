package cn.andoop.android.apin;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.andoop.andooptabframe.AndoopFrameListener;
import com.andoop.andooptabframe.AndoopPage;
import com.andoop.andooptabframe.AndoopTabFrame;
import com.andoop.andooptabframe.core.AndoopFrame;
import com.andoop.andooptabframe.core.TabFrameConfig;

import cn.andoop.android.apin.tab.IndexPage;
import cn.andoop.android.apin.tab.MsgPage;
import cn.andoop.android.apin.tab.PersonnalPage;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化tab页面

        AndoopTabFrame.getInstance().init(new TabFrameConfig.Builder()
                .canScroll(false)
                .tabColorString("#ffffff")
                .build());

        AndoopTabFrame.getInstance().build(this, R.id.fl_content_main, new AndoopFrameListener() {
            @Override
            public void onReady(AndoopFrame andoopFrame) {
                andoopFrame.addPage(new IndexPage(),R.drawable.ic_car_selector,"拼车");
                andoopFrame.addPage(new MsgPage(),R.drawable.ic_msg_selector,"消息");
                andoopFrame.addPage(new PersonnalPage(),R.drawable.ic_person_selector,"个人中心");
                andoopFrame.commit();
            }

            @Override
            public void onSelect(AndoopPage andoopPage, int pos) {

            }
        });
    }
}
