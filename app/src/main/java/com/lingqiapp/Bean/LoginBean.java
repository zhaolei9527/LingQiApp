package com.lingqiapp.Bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * sakura.liangdinvshen.Bean
 *
 * @author 赵磊
 * @date 2017/11/29
 * 功能描述：
 */
public class LoginBean {

    /**
     * status : 1
     * msg : 登录成功
     * user : {"id":"461","ni_name":"靓帝女神","img":"/Public/uploads/headimg/default_img.png","tel":"17629345001","is_show":null,"is_hui":"1","password":"14e1b600b1fd579f47433b88e8d85291","add_time":"1537413511","status":"1","rand":null,"is_del":"1","last_login_time":null,"money":"0.00","total_push_money":"0.00","pid1":null,"pid2":null,"pid3":null,"city":null,"openid_qq":null,"openid_qq_type":null,"openid_wx":null,"check_in_time":null,"erweima":null,"unionid":null,"app_qq_openid":null}
     */

    private String status;
    private String msg;
    private UserBean user;

    public static List<LoginBean> arrayLoginBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<LoginBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public static class UserBean {
        /**
         * id : 461
         * ni_name : 靓帝女神
         * img : /Public/uploads/headimg/default_img.png
         * tel : 17629345001
         * is_show : null
         * is_hui : 1
         * password : 14e1b600b1fd579f47433b88e8d85291
         * add_time : 1537413511
         * status : 1
         * rand : null
         * is_del : 1
         * last_login_time : null
         * money : 0.00
         * total_push_money : 0.00
         * pid1 : null
         * pid2 : null
         * pid3 : null
         * city : null
         * openid_qq : null
         * openid_qq_type : null
         * openid_wx : null
         * check_in_time : null
         * erweima : null
         * unionid : null
         * app_qq_openid : null
         */

        private String id;
        private String ni_name;
        private String img;
        private String tel;
        private String is_show;
        private String is_hui;
        private String password;
        private String add_time;
        private String status;
        private String rand;
        private String is_del;
        private String last_login_time;
        private String money;
        private String total_push_money;
        private String pid1;
        private String pid2;
        private String pid3;
        private String city;
        private String openid_qq;
        private String openid_qq_type;
        private String openid_wx;
        private String check_in_time;
        private String erweima;
        private String unionid;
        private String app_qq_openid;

        public static List<UserBean> arrayUserBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<UserBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNi_name() {
            return ni_name;
        }

        public void setNi_name(String ni_name) {
            this.ni_name = ni_name;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getIs_show() {
            return is_show;
        }

        public void setIs_show(String is_show) {
            this.is_show = is_show;
        }

        public String getIs_hui() {
            return is_hui;
        }

        public void setIs_hui(String is_hui) {
            this.is_hui = is_hui;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getAdd_time() {
            return add_time;
        }

        public void setAdd_time(String add_time) {
            this.add_time = add_time;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getRand() {
            return rand;
        }

        public void setRand(String rand) {
            this.rand = rand;
        }

        public String getIs_del() {
            return is_del;
        }

        public void setIs_del(String is_del) {
            this.is_del = is_del;
        }

        public String getLast_login_time() {
            return last_login_time;
        }

        public void setLast_login_time(String last_login_time) {
            this.last_login_time = last_login_time;
        }

        public String getMoney() {
            return money;
        }

        public void setMoney(String money) {
            this.money = money;
        }

        public String getTotal_push_money() {
            return total_push_money;
        }

        public void setTotal_push_money(String total_push_money) {
            this.total_push_money = total_push_money;
        }

        public String getPid1() {
            return pid1;
        }

        public void setPid1(String pid1) {
            this.pid1 = pid1;
        }

        public String getPid2() {
            return pid2;
        }

        public void setPid2(String pid2) {
            this.pid2 = pid2;
        }

        public String getPid3() {
            return pid3;
        }

        public void setPid3(String pid3) {
            this.pid3 = pid3;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getOpenid_qq() {
            return openid_qq;
        }

        public void setOpenid_qq(String openid_qq) {
            this.openid_qq = openid_qq;
        }

        public String getOpenid_qq_type() {
            return openid_qq_type;
        }

        public void setOpenid_qq_type(String openid_qq_type) {
            this.openid_qq_type = openid_qq_type;
        }

        public String getOpenid_wx() {
            return openid_wx;
        }

        public void setOpenid_wx(String openid_wx) {
            this.openid_wx = openid_wx;
        }

        public String getCheck_in_time() {
            return check_in_time;
        }

        public void setCheck_in_time(String check_in_time) {
            this.check_in_time = check_in_time;
        }

        public String getErweima() {
            return erweima;
        }

        public void setErweima(String erweima) {
            this.erweima = erweima;
        }

        public String getUnionid() {
            return unionid;
        }

        public void setUnionid(String unionid) {
            this.unionid = unionid;
        }

        public String getApp_qq_openid() {
            return app_qq_openid;
        }

        public void setApp_qq_openid(String app_qq_openid) {
            this.app_qq_openid = app_qq_openid;
        }
    }
}
