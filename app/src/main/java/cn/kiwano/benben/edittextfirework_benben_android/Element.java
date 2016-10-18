package cn.kiwano.benben.edittextfirework_benben_android;

/**
 * Created by LiYuanxiong on 2016/10/18 14:16.
 * Desribe:
 */
public class Element {
    public int color;
    public Double direction;
    public float speed;
    public float x = 0;
    public float y = 0;

    /**
     * 烟花的小火花
     * @param color 颜色
     * @param direction 飞行方向
     * @param speed 飞行速度
     */
    public Element(int color, Double direction, float speed) {
        this.color = color;
        this.direction = direction;
        this.speed = speed;
    }
}
