package com.padc.cooking.VO;

import com.padc.cooking.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Su Su Oo on 17-Sep-16.
 */
public class MarketListVO {

    String mname;
    String maddress;
    int mphoto;

    MarketListVO(String mname, String maddress, int mphoto) {
        this.mname = mname;
        this.maddress = maddress;
        this.mphoto = mphoto;
    }

    public String getMname() {
        return mname;
    }

    public String getMaddress() {
        return maddress;
    }

    public int getMphoto() {
        return mphoto;
    }


}

