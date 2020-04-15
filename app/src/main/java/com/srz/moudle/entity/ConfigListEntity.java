package com.srz.moudle.entity;

import java.util.List;

/**
 * //                    .::::.
 * //                  .::::::::.
 * //                 :::::::::::  FUCK YOU
 * //             ..:::::::::::'
 * //           '::::::::::::'
 * //             .::::::::::
 * //        '::::::::::::::..
 * //             ..::::::::::::.
 * //           ``::::::::::::::::
 * //            ::::``:::::::::'        .:::.
 * //           ::::'   ':::::'       .::::::::.
 * //         .::::'      ::::     .:::::::'::::.
 * //        .:::'       :::::  .:::::::::' ':::::.
 * //       .::'        :::::.:::::::::'      ':::::.
 * //      .::'         ::::::::::::::'         ``::::.
 * //  ...:::           ::::::::::::'              ``::.
 * // ```` ':.          ':::::::::'                  ::::..
 * //                    '.:::::'                    ':'````..
 * ===========================================================
 * You may think you know what the following code does.
 * But you dont. Trust me.
 * Fiddle with it, and youll spend many a sleepless
 * night cursing the moment you thought youd be clever
 * enough to "optimize" the code below.
 * Now close this file and go play with something else.
 * <p>
 * 2019/11/12 11:10 星期二
 **/
public class ConfigListEntity {


    /**
     * code : 1000
     * msg : 配置信息获取成功!
     * data : [{"id":5,"name":"url 前缀","interfaceKey":"picUrl","interfaceValue":"http://192.168.1.238","groupId":1,"deleted":0,"createTime":"2019-10-09 18:08:11","updateTime":"2019-11-12 16:29:38"},{"id":7,"name":"片单标识","interfaceKey":"filmId","interfaceValue":"123456","groupId":1,"deleted":0,"createTime":"2019-10-09 18:19:54","updateTime":"2019-11-12 16:30:31"}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 5
         * name : url 前缀
         * interfaceKey : picUrl
         * interfaceValue : http://192.168.1.238
         * groupId : 1
         * deleted : 0
         * createTime : 2019-10-09 18:08:11
         * updateTime : 2019-11-12 16:29:38
         */

        private int id;
        private String name;
        private String interfaceKey;
        private String interfaceValue;
        private int groupId;
        private int deleted;
        private String createTime;
        private String updateTime;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getInterfaceKey() {
            return interfaceKey;
        }

        public void setInterfaceKey(String interfaceKey) {
            this.interfaceKey = interfaceKey;
        }

        public String getInterfaceValue() {
            return interfaceValue;
        }

        public void setInterfaceValue(String interfaceValue) {
            this.interfaceValue = interfaceValue;
        }

        public int getGroupId() {
            return groupId;
        }

        public void setGroupId(int groupId) {
            this.groupId = groupId;
        }

        public int getDeleted() {
            return deleted;
        }

        public void setDeleted(int deleted) {
            this.deleted = deleted;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }
    }
}
