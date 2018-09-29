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
 * @date 2017/12/18
 * 功能描述：
 */
public class OrderListsBean {

    /**
     * status : 1
     * list : [{"id":"298","orderid":"20180928160442449392","sfmoney":"0.00","totalprice":"100","uid":"461","status":"2","paytime":null,"addressid":"183","addtime":"1538121882","number":"1","yemoney":null,"paytype":null,"payment":null,"fhtime":null,"exp":null,"expnum":null,"fhbeizhu":null,"paybeizhu":null,"shtime":null,"sheng":"河南省","shi":"郑州市","xian":"中原区","address":"asdadasfdasdasfasfasf","tel":"17629345001","name":"asdasdasasd","is_ziti":"1","gid":null,"cid":"145","cart":[{"id":"145","uid":"461","gid":"26","addtime":"1538121874","number":"2","type":"2","title":"靓帝CY细胞美容生殖美学_专用胸牌10件组合_2018新春特价","img_feng":"/Public/uploads/goods/2018-09-26/5bab251f3ff70.jpg","price":"100"}]},{"id":"297","orderid":"20180928155948502154","sfmoney":"0.00","totalprice":"39","uid":"461","status":"2","paytime":null,"addressid":"183","addtime":"1538121588","number":"1","yemoney":null,"paytype":null,"payment":null,"fhtime":null,"exp":null,"expnum":null,"fhbeizhu":null,"paybeizhu":null,"shtime":null,"sheng":"河南省","shi":"郑州市","xian":"中原区","address":"asdadasfdasdasfasfasf","tel":"17629345001","name":"asdasdasasd","is_ziti":"1","gid":null,"cid":"144","cart":[{"id":"144","uid":"461","gid":"25","addtime":"1538121565","number":"2","type":"2","title":"细胞美容学","img_feng":"/Public/uploads/goods/2018-09-26/5bab24b8ddec8.png","price":"39"}]}]
     */

    private int status;
    private List<ListBean> list;

    public static List<OrderListsBean> arrayOrderListsBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<OrderListsBean>>() {
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
         * id : 298
         * orderid : 20180928160442449392
         * sfmoney : 0.00
         * totalprice : 100
         * uid : 461
         * status : 2
         * paytime : null
         * addressid : 183
         * addtime : 1538121882
         * number : 1
         * yemoney : null
         * paytype : null
         * payment : null
         * fhtime : null
         * exp : null
         * expnum : null
         * fhbeizhu : null
         * paybeizhu : null
         * shtime : null
         * sheng : 河南省
         * shi : 郑州市
         * xian : 中原区
         * address : asdadasfdasdasfasfasf
         * tel : 17629345001
         * name : asdasdasasd
         * is_ziti : 1
         * gid : null
         * cid : 145
         * cart : [{"id":"145","uid":"461","gid":"26","addtime":"1538121874","number":"2","type":"2","title":"靓帝CY细胞美容生殖美学_专用胸牌10件组合_2018新春特价","img_feng":"/Public/uploads/goods/2018-09-26/5bab251f3ff70.jpg","price":"100"}]
         */

        private String id;
        private String orderid;
        private String sfmoney;
        private String totalprice;
        private String uid;
        private String status;
        private String paytime;
        private String addressid;
        private String addtime;
        private String number;
        private String yemoney;
        private String paytype;
        private String payment;
        private String fhtime;
        private String exp;
        private String expnum;
        private String fhbeizhu;
        private String paybeizhu;
        private String shtime;
        private String sheng;
        private String shi;
        private String xian;
        private String address;
        private String tel;
        private String name;
        private String is_ziti;
        private String gid;
        private String cid;
        private List<CartBean> cart;

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

        public String getOrderid() {
            return orderid;
        }

        public void setOrderid(String orderid) {
            this.orderid = orderid;
        }

        public String getSfmoney() {
            return sfmoney;
        }

        public void setSfmoney(String sfmoney) {
            this.sfmoney = sfmoney;
        }

        public String getTotalprice() {
            return totalprice;
        }

        public void setTotalprice(String totalprice) {
            this.totalprice = totalprice;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getPaytime() {
            return paytime;
        }

        public void setPaytime(String paytime) {
            this.paytime = paytime;
        }

        public String getAddressid() {
            return addressid;
        }

        public void setAddressid(String addressid) {
            this.addressid = addressid;
        }

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getYemoney() {
            return yemoney;
        }

        public void setYemoney(String yemoney) {
            this.yemoney = yemoney;
        }

        public String getPaytype() {
            return paytype;
        }

        public void setPaytype(String paytype) {
            this.paytype = paytype;
        }

        public String getPayment() {
            return payment;
        }

        public void setPayment(String payment) {
            this.payment = payment;
        }

        public String getFhtime() {
            return fhtime;
        }

        public void setFhtime(String fhtime) {
            this.fhtime = fhtime;
        }

        public String getExp() {
            return exp;
        }

        public void setExp(String exp) {
            this.exp = exp;
        }

        public String getExpnum() {
            return expnum;
        }

        public void setExpnum(String expnum) {
            this.expnum = expnum;
        }

        public String getFhbeizhu() {
            return fhbeizhu;
        }

        public void setFhbeizhu(String fhbeizhu) {
            this.fhbeizhu = fhbeizhu;
        }

        public String getPaybeizhu() {
            return paybeizhu;
        }

        public void setPaybeizhu(String paybeizhu) {
            this.paybeizhu = paybeizhu;
        }

        public String getShtime() {
            return shtime;
        }

        public void setShtime(String shtime) {
            this.shtime = shtime;
        }

        public String getSheng() {
            return sheng;
        }

        public void setSheng(String sheng) {
            this.sheng = sheng;
        }

        public String getShi() {
            return shi;
        }

        public void setShi(String shi) {
            this.shi = shi;
        }

        public String getXian() {
            return xian;
        }

        public void setXian(String xian) {
            this.xian = xian;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIs_ziti() {
            return is_ziti;
        }

        public void setIs_ziti(String is_ziti) {
            this.is_ziti = is_ziti;
        }

        public String getGid() {
            return gid;
        }

        public void setGid(String gid) {
            this.gid = gid;
        }

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public List<CartBean> getCart() {
            return cart;
        }

        public void setCart(List<CartBean> cart) {
            this.cart = cart;
        }

        public static class CartBean {
            /**
             * id : 145
             * uid : 461
             * gid : 26
             * addtime : 1538121874
             * number : 2
             * type : 2
             * title : 靓帝CY细胞美容生殖美学_专用胸牌10件组合_2018新春特价
             * img_feng : /Public/uploads/goods/2018-09-26/5bab251f3ff70.jpg
             * price : 100
             */

            private String id;
            private String uid;
            private String gid;
            private String addtime;
            private String number;
            private String type;
            private String title;
            private String img_feng;
            private String price;

            public static List<CartBean> arrayCartBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<CartBean>>() {
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

            public String getGid() {
                return gid;
            }

            public void setGid(String gid) {
                this.gid = gid;
            }

            public String getAddtime() {
                return addtime;
            }

            public void setAddtime(String addtime) {
                this.addtime = addtime;
            }

            public String getNumber() {
                return number;
            }

            public void setNumber(String number) {
                this.number = number;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImg_feng() {
                return img_feng;
            }

            public void setImg_feng(String img_feng) {
                this.img_feng = img_feng;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }
        }
    }
}
