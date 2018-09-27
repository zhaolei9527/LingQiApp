package com.lingqiapp.Bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * com.lingqiapp.Bean
 *
 * @author 赵磊
 * @date 2018/9/27
 * 功能描述：
 */
public class GoodsPingBean {

    /**
     * status : 1
     * res : [{"id":"3","uid":"462","oid":null,"star":"2","pcontent":"最差劲的一次购物","gid":"23","aid":"1","hcontent":"不好意思，给你带来了不便","p_img":["/Public/uploads/2018-09-26/5bab22f209c40.png","/Public/uploads/2018-09-26/5bab22f51bd50.jpg","/Public/uploads/2018-09-26/5bab22f9124f8.jpg"],"addtime":"1538014550","ni_name":"火云邪神","img":"/Public/uploads/headimg/default_img.png"},{"id":"5","uid":"465","oid":null,"star":"4","pcontent":"很满意","gid":"23","aid":"1","hcontent":"满意就好，我们会更加努力","p_img":["/Public/uploads/2018-09-26/5bab22f209c40.png","/Public/uploads/2018-09-26/5bab22f51bd50.jpg","/Public/uploads/2018-09-26/5bab22f9124f8.jpg"],"addtime":"1538014520","ni_name":"领七用户","img":"/Public/uploads/headimg/default_img.png"},{"id":"4","uid":"464","oid":null,"star":"5","pcontent":"很满意","gid":"23","aid":"1","hcontent":"满意就好，我们会更加努力","p_img":["/Public/uploads/2018-09-26/5bab22f209c40.png","/Public/uploads/2018-09-26/5bab22f51bd50.jpg","/Public/uploads/2018-09-26/5bab22f9124f8.jpg"],"addtime":"1538014500","ni_name":"靓帝女神2","img":"/Public/uploads/headimg/default_img.png"},{"id":"2","uid":"463","oid":null,"star":"5","pcontent":"很满意","gid":"23","aid":"1","hcontent":"满意就好，我们会更加努力","p_img":["/Public/uploads/2018-09-26/5bab22f209c40.png","/Public/uploads/2018-09-26/5bab22f51bd50.jpg","/Public/uploads/2018-09-26/5bab22f9124f8.jpg"],"addtime":"1538014495","ni_name":"靓帝女神","img":"/Public/uploads/headimg/default_img.png"},{"id":"1","uid":"461","oid":null,"star":"4","pcontent":"很满意","gid":"23","aid":"1","hcontent":"满意就好，我们会更加努力","p_img":["/Public/uploads/2018-09-26/5bab22f209c40.png","/Public/uploads/2018-09-26/5bab22f51bd50.jpg","/Public/uploads/2018-09-26/5bab22f9124f8.jpg"],"addtime":"1538014480","ni_name":"sakura","img":"/Public/uploads/headimg/default_img.png"}]
     */

    private String status;
    private List<ResBean> res;

    public static List<GoodsPingBean> arrayGoodsPingBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<GoodsPingBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResBean> getRes() {
        return res;
    }

    public void setRes(List<ResBean> res) {
        this.res = res;
    }

    public static class ResBean {
        /**
         * id : 3
         * uid : 462
         * oid : null
         * star : 2
         * pcontent : 最差劲的一次购物
         * gid : 23
         * aid : 1
         * hcontent : 不好意思，给你带来了不便
         * p_img : ["/Public/uploads/2018-09-26/5bab22f209c40.png","/Public/uploads/2018-09-26/5bab22f51bd50.jpg","/Public/uploads/2018-09-26/5bab22f9124f8.jpg"]
         * addtime : 1538014550
         * ni_name : 火云邪神
         * img : /Public/uploads/headimg/default_img.png
         */

        private String id;
        private String uid;
        private Object oid;
        private String star;
        private String pcontent;
        private String gid;
        private String aid;
        private String hcontent;
        private String addtime;
        private String ni_name;
        private String img;
        private List<String> p_img;

        public static List<ResBean> arrayResBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<ResBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public Object getOid() {
            return oid;
        }

        public void setOid(Object oid) {
            this.oid = oid;
        }

        public String getStar() {
            return star;
        }

        public void setStar(String star) {
            this.star = star;
        }

        public String getPcontent() {
            return pcontent;
        }

        public void setPcontent(String pcontent) {
            this.pcontent = pcontent;
        }

        public String getGid() {
            return gid;
        }

        public void setGid(String gid) {
            this.gid = gid;
        }

        public String getAid() {
            return aid;
        }

        public void setAid(String aid) {
            this.aid = aid;
        }

        public String getHcontent() {
            return hcontent;
        }

        public void setHcontent(String hcontent) {
            this.hcontent = hcontent;
        }

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
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

        public List<String> getP_img() {
            return p_img;
        }

        public void setP_img(List<String> p_img) {
            this.p_img = p_img;
        }
    }
}
