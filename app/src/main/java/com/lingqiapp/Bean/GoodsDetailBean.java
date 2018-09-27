package com.lingqiapp.Bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * sakura.liangdinvshen.Bean
 *
 * @author 赵磊
 * @date 2017/12/8
 * 功能描述：
 */
public class GoodsDetailBean {


    /**
     * goods : {"id":"23","title":"细胞美容","img":["/Public/uploads/2018-09-26/5bab22f209c40.png","/Public/uploads/2018-09-26/5bab22f51bd50.jpg","/Public/uploads/2018-09-26/5bab22f9124f8.jpg"],"addtime":"1511621024","price":"4980","kucun":"128","xiaoliang":"63","type":"1"}
     * is_cang : 0
     * pj : {"0":{"id":"3","uid":"462","oid":null,"star":"2","pcontent":"最差劲的一次购物","gid":"23","aid":"1","hcontent":"不好意思，给你带来了不便","p_img":["/Public/uploads/2018-09-26/5bab22f209c40.png","/Public/uploads/2018-09-26/5bab22f51bd50.jpg","/Public/uploads/2018-09-26/5bab22f9124f8.jpg"],"addtime":"1538014550","ni_name":"火云邪神","img":"/Public/uploads/headimg/default_img.png"},"1":{"id":"5","uid":"465","oid":null,"star":"4","pcontent":"很满意","gid":"23","aid":"1","hcontent":"满意就好，我们会更加努力","p_img":["/Public/uploads/2018-09-26/5bab22f209c40.png","/Public/uploads/2018-09-26/5bab22f51bd50.jpg","/Public/uploads/2018-09-26/5bab22f9124f8.jpg"],"addtime":"1538014520","ni_name":"领七用户","img":"/Public/uploads/headimg/default_img.png"},"count":"5"}
     * status : 1
     */

    private GoodsBean goods;
    private String is_cang;
    private PjBean pj;
    private int status;

    public static List<GoodsDetailBean> arrayGoodsDetailBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<GoodsDetailBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public GoodsBean getGoods() {
        return goods;
    }

    public void setGoods(GoodsBean goods) {
        this.goods = goods;
    }

    public String getIs_cang() {
        return is_cang;
    }

    public void setIs_cang(String is_cang) {
        this.is_cang = is_cang;
    }

    public PjBean getPj() {
        return pj;
    }

    public void setPj(PjBean pj) {
        this.pj = pj;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class GoodsBean {
        /**
         * id : 23
         * title : 细胞美容
         * img : ["/Public/uploads/2018-09-26/5bab22f209c40.png","/Public/uploads/2018-09-26/5bab22f51bd50.jpg","/Public/uploads/2018-09-26/5bab22f9124f8.jpg"]
         * addtime : 1511621024
         * price : 4980
         * kucun : 128
         * xiaoliang : 63
         * type : 1
         */

        private String id;
        private String title;
        private String addtime;
        private String price;
        private String kucun;
        private String xiaoliang;
        private String type;
        private List<String> img;

        public static List<GoodsBean> arrayGoodsBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<GoodsBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getKucun() {
            return kucun;
        }

        public void setKucun(String kucun) {
            this.kucun = kucun;
        }

        public String getXiaoliang() {
            return xiaoliang;
        }

        public void setXiaoliang(String xiaoliang) {
            this.xiaoliang = xiaoliang;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<String> getImg() {
            return img;
        }

        public void setImg(List<String> img) {
            this.img = img;
        }
    }

    public static class PjBean {
        /**
         * 0 : {"id":"3","uid":"462","oid":null,"star":"2","pcontent":"最差劲的一次购物","gid":"23","aid":"1","hcontent":"不好意思，给你带来了不便","p_img":["/Public/uploads/2018-09-26/5bab22f209c40.png","/Public/uploads/2018-09-26/5bab22f51bd50.jpg","/Public/uploads/2018-09-26/5bab22f9124f8.jpg"],"addtime":"1538014550","ni_name":"火云邪神","img":"/Public/uploads/headimg/default_img.png"}
         * 1 : {"id":"5","uid":"465","oid":null,"star":"4","pcontent":"很满意","gid":"23","aid":"1","hcontent":"满意就好，我们会更加努力","p_img":["/Public/uploads/2018-09-26/5bab22f209c40.png","/Public/uploads/2018-09-26/5bab22f51bd50.jpg","/Public/uploads/2018-09-26/5bab22f9124f8.jpg"],"addtime":"1538014520","ni_name":"领七用户","img":"/Public/uploads/headimg/default_img.png"}
         * count : 5
         */

        @SerializedName("0")
        private _$0Bean _$0;
        @SerializedName("1")
        private _$1Bean _$1;
        private String count;

        public static List<PjBean> arrayPjBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<PjBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public _$0Bean get_$0() {
            return _$0;
        }

        public void set_$0(_$0Bean _$0) {
            this._$0 = _$0;
        }

        public _$1Bean get_$1() {
            return _$1;
        }

        public void set_$1(_$1Bean _$1) {
            this._$1 = _$1;
        }

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public static class _$0Bean {
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

            public static List<_$0Bean> array_$0BeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<_$0Bean>>() {
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

        public static class _$1Bean {
            /**
             * id : 5
             * uid : 465
             * oid : null
             * star : 4
             * pcontent : 很满意
             * gid : 23
             * aid : 1
             * hcontent : 满意就好，我们会更加努力
             * p_img : ["/Public/uploads/2018-09-26/5bab22f209c40.png","/Public/uploads/2018-09-26/5bab22f51bd50.jpg","/Public/uploads/2018-09-26/5bab22f9124f8.jpg"]
             * addtime : 1538014520
             * ni_name : 领七用户
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

            public static List<_$1Bean> array_$1BeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<_$1Bean>>() {
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
}
