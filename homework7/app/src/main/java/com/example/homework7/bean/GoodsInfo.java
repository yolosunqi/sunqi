package com.example.homework7.bean;

import com.example.homework7.R;

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
            "iPhone 12 promax", "华为mate40 pro", "小米10", "oppo reno4 SE", "vivo 黑曜石", "魅族17"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "值享焕新版 Apple iPhone 12 promax 128G 金色",
            "华为mate40 pro 5G手机 亮黑色 8+256G 全网通",
            "现货速发 小米10 5G手机 骁龙865 1亿像素游戏手机新品1",
            "oppo reno4 SE 5G新品手机 全面屏 拍照 全网通",
            "vivo 6GB+64GB 黑曜石 5000mAh大电池 骁龙662处理器",
            "魅族17 8GB+128GB 十七度灰 骁龙865"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {6666, 4356, 3211, 2999, 2455, 2666};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.iphone_s, R.drawable.huawei_s, R.drawable.xiaomi_s,
            R.drawable.oppo_s, R.drawable.vivo_s, R.drawable.meizu_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.iphone, R.drawable.huawei, R.drawable.xiaomi,
            R.drawable.oppo, R.drawable.vivo, R.drawable.meizu
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
