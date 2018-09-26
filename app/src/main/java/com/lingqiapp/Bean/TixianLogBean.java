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
 * @date 2018/9/26
 * 功能描述：
 */
public class TixianLogBean {


    /**
     * status : 1
     * list : [{"id":"61","aid":null,"uid":"461","desc":null,"stu":"0","add_time":"1537926787","bian_num":"2147483647","bank":"asdasdsad","no":"6222600260001072444","money":"50"},{"id":"60","aid":null,"uid":"461","desc":null,"stu":"0","add_time":"1537926489","bian_num":"2147483647","bank":"asdasdsad","no":"6222600260001072444","money":"50"},{"id":"59","aid":null,"uid":"461","desc":null,"stu":"0","add_time":"1537926487","bian_num":"2147483647","bank":"asdasdsad","no":"6222600260001072444","money":"50"},{"id":"58","aid":null,"uid":"461","desc":null,"stu":"0","add_time":"1537926484","bian_num":"2147483647","bank":"asdasdsad","no":"6222600260001072444","money":"50"},{"id":"57","aid":null,"uid":"461","desc":null,"stu":"0","add_time":"1537926404","bian_num":"2147483647","bank":"asdasdsad","no":"6222600260001072444","money":"50"}]
     */

    private int status;
    private List<ListBean> list;

    public static List<TixianLogBean> arrayTixianLogBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<TixianLogBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * id : 61
         * aid : null
         * uid : 461
         * desc : null
         * stu : 0
         * add_time : 1537926787
         * bian_num : 2147483647
         * bank : asdasdsad
         * no : 6222600260001072444
         * money : 50
         */

        private String id;
        private String aid;
        private String uid;
        private String desc;
        private String stu;
        private String add_time;
        private String bian_num;
        private String bank;
        private String no;
        private String money;

        public static List<ListBean> arrayListBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<ListBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAid() {
            return aid;
        }

        public void setAid(String aid) {
            this.aid = aid;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getStu() {
            return stu;
        }

        public void setStu(String stu) {
            this.stu = stu;
        }

        public String getAdd_time() {
            return add_time;
        }

        public void setAdd_time(String add_time) {
            this.add_time = add_time;
        }

        public String getBian_num() {
            return bian_num;
        }

        public void setBian_num(String bian_num) {
            this.bian_num = bian_num;
        }

        public String getBank() {
            return bank;
        }

        public void setBank(String bank) {
            this.bank = bank;
        }

        public String getNo() {
            return no;
        }

        public void setNo(String no) {
            this.no = no;
        }

        public String getMoney() {
            return money;
        }

        public void setMoney(String money) {
            this.money = money;
        }
    }
}
