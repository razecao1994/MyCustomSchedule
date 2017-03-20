package com.adoubo.customschedule;

import com.adoubo.customschedule.bean.SelectDayTime;
import com.adoubo.customtimepicker.TimeSection;

import java.util.List;

/**
 * Created by caoweixin
 * 2017/3/20
 * Email: caoweixin@hikvision.com.cn
 */

public interface INewDayLayout {

    interface OnDistrictClickListener {
        void onDistrictClick(int item);
    }

    void drawView(SelectDayTime dayTime);

    void setMaxNum(int num);

    void setOnDestrictClickListener(OnDistrictClickListener listener);

}
