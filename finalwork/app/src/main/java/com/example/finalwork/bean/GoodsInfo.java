package com.example.finalwork.bean;

import com.example.finalwork.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "HUAWEI FreeBuds 3", "nova迷你小音箱", "HUAWEI FreeBuds 悦享版 无线耳机", "HUAWEI FreeLace Pro",
            "力博得智能声波牙刷", "达伦吸顶灯", "博乐宝智能净饮机B16-R100 白色（支持HUAWEI HiLink）","PINTOS品多H1智能锁 经典黑（支持HUAWEI HiLink）"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "半开放式主动降噪，麒麟A1芯片，抗干扰，低时延，无线快充，佩戴稳固舒适，震撼低音，搭配P40系列、Mate30系列，荣耀系列，苹果系列等手机体验更佳",
            "低音浑厚 小巧轻便",
            "入耳式真无线，双击触控，通话降噪",
            "适合手机/PC/平板/手表等全天候使用，充电5分钟，续航5小时，USB-C快充；智慧连接：USB-C闪连，双击闪切，智能磁吸开关，低时延电竞模式。",
            "36变智能美齿 定格自信笑容 ",
            "达伦自然光 自然才健康 ",
            "净化加热只需3秒， 支持HUAWEI HiLink ",
            "极简设计，一步开门，支持HUAWEI HiLink "


    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {599, 399, 299, 499, 169, 259,58,99};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.freeuds3_s, R.drawable.nova_s, R.drawable.freebuds_s, R.drawable.freelacepro_s,R.drawable.toothbrush_s ,
            R.drawable.lamp_s, R.drawable.water_s, R.drawable.lock_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.freebuds3, R.drawable.nova,R.drawable.freebuds, R.drawable.freelacepro, R.drawable.toothbrush,
            R.drawable.lamp, R.drawable.water, R.drawable.lock

    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
