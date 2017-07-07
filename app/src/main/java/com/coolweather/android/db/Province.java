package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Daul on 2017/7/7.
 */

public class Province extends DataSupport {

    private int id;
    private String provinceName;

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    private int provinceCode;

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }
}
