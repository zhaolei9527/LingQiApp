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
public class NewsListBean {
    /**
     * status : 1
     * res : [{"id":"193","title":"一个女人没了子宫会怎样呢？","add_time":"1536131438","keywords":"子宫","img":"/Public/uploads/News/2018-09-18/5ba0bad26570c.jpg","view":"28","cid":"14","jianjie":null},{"id":"99","title":"常见的妇科疾病及其症状","add_time":"1511081504","keywords":"妇科","img":"/Public/uploads/News/2018-07-21/5b52f4cc51459.jpg","view":"90","cid":"15","jianjie":null},{"id":"192","title":"从即刻开始，开启对真美的认识","add_time":"1535882284","keywords":"细胞美容","img":"/Public/uploads/News/2018-09-02/5b8bb42bdc547.jpg","view":"6","cid":"1","jianjie":null},{"id":"190","title":"首期靓帝女神业务员培训会","add_time":"1533967972","keywords":"业务员","img":"/Public/uploads/News/2018-08-11/5b6e7e64d08ae.jpg","view":"105","cid":"14","jianjie":null},{"id":"191","title":"亳州区细胞美容项目说明会","add_time":"1534583267","keywords":"细胞美容项目说明会","img":"/Public/uploads/News/2018-08-18/5b77efc726bfd.jpg","view":"303","cid":"14","jianjie":null},{"id":"184","title":"十五期《生殖美学原理》训练营火热招生中！","add_time":"1533461761","keywords":"《生殖美学原理》训练营","img":"/Public/uploads/News/2018-08-05/5b66c501516f1.jpg","view":"55","cid":"14","jianjie":null},{"id":"185","title":"女人值得思考的现象","add_time":"1533548411","keywords":"现象","img":"/Public/uploads/News/2018-08-06/5b68179dbba6b.png","view":"47","cid":"15","jianjie":null},{"id":"186","title":"如何建立生殖美的正确观","add_time":"1533635285","keywords":"如何建立生殖美的正确观","img":"/Public/uploads/News/2018-08-07/5b696ad482bd8.jpg","view":"47","cid":"15","jianjie":null},{"id":"187","title":"生殖美疗三部曲","add_time":"1533722684","keywords":"生殖美疗","img":"/Public/uploads/News/2018-08-08/5b6ac03c6dfc5.jpg","view":"43","cid":"17","jianjie":null},{"id":"188","title":"阴道为什么会干涩？","add_time":"1533809032","keywords":"阴道","img":"/Public/uploads/News/2018-08-09/5b6c11884db6d.jpg","view":"49","cid":"17","jianjie":null}]
     * cate : [{"id":"1","cate_name":"细胞美容"},{"id":"10","cate_name":"美白"},{"id":"8","cate_name":"情感"},{"id":"17","cate_name":"美妆"},{"id":"14","cate_name":"时尚"},{"id":"15","cate_name":"护理"}]
     * msg : 查询数据成功，返回数据
     */

    private String status;
    private String msg;
    private List<ResBean> res;
    private List<CateBean> cate;

    public static List<NewsListBean> arrayNewsListBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<NewsListBean>>() {
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

    public List<ResBean> getRes() {
        return res;
    }

    public void setRes(List<ResBean> res) {
        this.res = res;
    }

    public List<CateBean> getCate() {
        return cate;
    }

    public void setCate(List<CateBean> cate) {
        this.cate = cate;
    }

    public static class ResBean {
        /**
         * id : 193
         * title : 一个女人没了子宫会怎样呢？
         * add_time : 1536131438
         * keywords : 子宫
         * img : /Public/uploads/News/2018-09-18/5ba0bad26570c.jpg
         * view : 28
         * cid : 14
         * jianjie : null
         */

        private String id;
        private String title;
        private String add_time;
        private String keywords;
        private String img;
        private String view;
        private String cid;
        private String jianjie;

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

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAdd_time() {
            return add_time;
        }

        public void setAdd_time(String add_time) {
            this.add_time = add_time;
        }

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getView() {
            return view;
        }

        public void setView(String view) {
            this.view = view;
        }

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public String getJianjie() {
            return jianjie;
        }

        public void setJianjie(String jianjie) {
            this.jianjie = jianjie;
        }
    }

    public static class CateBean {
        /**
         * id : 1
         * cate_name : 细胞美容
         */

        private String id;
        private String cate_name;

        public static List<CateBean> arrayCateBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<CateBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCate_name() {
            return cate_name;
        }

        public void setCate_name(String cate_name) {
            this.cate_name = cate_name;
        }
    }
}
