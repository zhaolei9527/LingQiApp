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
     * user : {"id":"461","is_hui":"2","img":"/Public/uploads/touxiang/2018-09-29/5baf245626ac0.jpg","ni_name":"sakura","tel":"17629345001","add_time":"1537413511","status":"1","is_del":"1","money":"192155.00","total_push_money":"2406.00","pid":null,"erweima":"./Public/userqrcode/17629345001-p.png","openid_wx":null}
     * zw_count : 0
     */

    private String status;
    private String msg;
    private UserBean user;
    private String zw_count;

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

    public String getZw_count() {
        return zw_count;
    }

    public void setZw_count(String zw_count) {
        this.zw_count = zw_count;
    }

    public static class UserBean {
        /**
         * id : 461
         * is_hui : 2
         * img : /Public/uploads/touxiang/2018-09-29/5baf245626ac0.jpg
         * ni_name : sakura
         * tel : 17629345001
         * add_time : 1537413511
         * status : 1
         * is_del : 1
         * money : 192155.00
         * total_push_money : 2406.00
         * pid : null
         * erweima : ./Public/userqrcode/17629345001-p.png
         * openid_wx : null
         */

        private String id;
        private String is_hui;
        private String img;
        private String ni_name;
        private String tel;
        private String add_time;
        private String status;
        private String is_del;
        private String money;
        private String total_push_money;
        private Object pid;
        private String erweima;
        private Object openid_wx;

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

        public String getIs_hui() {
            return is_hui;
        }

        public void setIs_hui(String is_hui) {
            this.is_hui = is_hui;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getNi_name() {
            return ni_name;
        }

        public void setNi_name(String ni_name) {
            this.ni_name = ni_name;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
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

        public String getIs_del() {
            return is_del;
        }

        public void setIs_del(String is_del) {
            this.is_del = is_del;
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

        public Object getPid() {
            return pid;
        }

        public void setPid(Object pid) {
            this.pid = pid;
        }

        public String getErweima() {
            return erweima;
        }

        public void setErweima(String erweima) {
            this.erweima = erweima;
        }

        public Object getOpenid_wx() {
            return openid_wx;
        }

        public void setOpenid_wx(Object openid_wx) {
            this.openid_wx = openid_wx;
        }
    }
}
