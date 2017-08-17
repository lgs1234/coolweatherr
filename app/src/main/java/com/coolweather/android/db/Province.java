package com.coolweather.android.db;

/**
 * Created by acer on 2017/8/17.
 * 建立省的数据信息
 */

public class Province extends DataSupport{
    private int id; //省份对应id
    private String  provinceName; //省份名字
    private int provinceCode; //省份代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

}
