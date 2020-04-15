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
 * 2019/11/18 09:29 星期一
 **/
public class BeautyEntity {


    /**
     * code : 1000
     * msg : 获取内容列表成功!
     * data : [{"id":199,"columnId":11,"contentNumber":22874235,"contentName":"ggggg","posterHomePath":"http://192.168.1.238/DATA/video/2019-11-11/1573440181590.jpg","contentType":2,"createTime":"2019-11-28T08:20:11.000+0000","updateTime":"2019-11-28T08:20:39.000+0000","sort":null,"status":null,"brief":"www","liveTime":null,"duration":"2","cornerInfo":null},{"id":201,"columnId":11,"contentNumber":23930383,"contentName":"888888","posterHomePath":"http://192.168.1.238/DATA/video/2019-11-07/1573089797044.jpg","contentType":2,"createTime":"2019-11-28T08:20:11.000+0000","updateTime":"2019-11-28T08:20:39.000+0000","sort":null,"status":null,"brief":"","liveTime":null,"duration":"23","cornerInfo":null},{"id":203,"columnId":11,"contentNumber":207,"contentName":"最热 3","posterHomePath":"http://192.168.1.238/DATA/panorama/2019-10-14/1571037593537.jpg","contentType":2,"createTime":"2019-11-28T08:20:11.000+0000","updateTime":"2019-11-28T08:20:40.000+0000","sort":null,"status":null,"brief":"1","liveTime":null,"duration":"23","cornerInfo":null},{"id":205,"columnId":11,"contentNumber":208,"contentName":"最热 4","posterHomePath":"http://192.168.1.238/DATA/panorama/2019-10-14/1571037593537.jpg","contentType":2,"createTime":"2019-11-28T08:20:11.000+0000","updateTime":"2019-11-28T08:20:40.000+0000","sort":null,"status":null,"brief":"1","liveTime":null,"duration":"23","cornerInfo":null},{"id":207,"columnId":11,"contentNumber":206,"contentName":"最热 2","posterHomePath":"http://192.168.1.238/DATA/panorama/2019-10-14/1571037593537.jpg","contentType":2,"createTime":"2019-11-28T08:20:11.000+0000","updateTime":"2019-11-28T08:20:41.000+0000","sort":null,"status":null,"brief":"787","liveTime":null,"duration":"676","cornerInfo":null},{"id":209,"columnId":11,"contentNumber":205,"contentName":"最热 1","posterHomePath":"http://192.168.1.238/DATA/panorama/2019-10-14/1571037593537.jpg","contentType":2,"createTime":"2019-11-28T08:20:11.000+0000","updateTime":"2019-11-28T08:20:43.000+0000","sort":null,"status":null,"brief":"fdgf","liveTime":null,"duration":"32","cornerInfo":null},{"id":211,"columnId":11,"contentNumber":202,"contentName":"超沉浸太空体验","posterHomePath":"http://192.168.1.238/DATA/panorama/2019-10-14/1571037593537.jpg","contentType":2,"createTime":"2019-11-28T08:20:11.000+0000","updateTime":"2019-11-28T08:20:43.000+0000","sort":null,"status":null,"brief":"wer","liveTime":null,"duration":"324","cornerInfo":null},{"id":213,"columnId":11,"contentNumber":201,"contentName":"超沉浸太空体验","posterHomePath":"http://192.168.1.238/DATA/panorama/2019-10-14/1571037593537.jpg","contentType":2,"createTime":"2019-11-28T08:20:11.000+0000","updateTime":"2019-11-28T08:20:44.000+0000","sort":null,"status":null,"brief":"trtrt","liveTime":null,"duration":"45","cornerInfo":null},{"id":215,"columnId":11,"contentNumber":204,"contentName":"激战","posterHomePath":"http://192.168.1.238/DATA/panorama/2019-10-14/1571037593537.jpg","contentType":2,"createTime":"2019-11-28T08:20:11.000+0000","updateTime":"2019-11-28T08:20:44.000+0000","sort":null,"status":null,"brief":"33","liveTime":null,"duration":"56","cornerInfo":null},{"id":217,"columnId":11,"contentNumber":203,"contentName":"超沉浸太空体验","posterHomePath":"http://192.168.1.238/DATA/panorama/2019-10-14/1571037593537.jpg","contentType":2,"createTime":"2019-11-28T08:20:11.000+0000","updateTime":"2019-11-28T08:20:45.000+0000","sort":null,"status":null,"brief":"1","liveTime":null,"duration":"2323","cornerInfo":null}]
     * pageable : {"total":10,"size":10,"pages":1,"current":1}
     */

    private int code;
    private String msg;
    private PageableBean pageable;
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

    public PageableBean getPageable() {
        return pageable;
    }

    public void setPageable(PageableBean pageable) {
        this.pageable = pageable;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class PageableBean {
        /**
         * total : 10
         * size : 10
         * pages : 1
         * current : 1
         */

        private int total;
        private int size;
        private int pages;
        private int current;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public int getCurrent() {
            return current;
        }

        public void setCurrent(int current) {
            this.current = current;
        }
    }

    public static class DataBean {
        /**
         * id : 199
         * columnId : 11
         * contentNumber : 22874235
         * contentName : ggggg
         * posterHomePath : http://192.168.1.238/DATA/video/2019-11-11/1573440181590.jpg
         * contentType : 2
         * createTime : 2019-11-28T08:20:11.000+0000
         * updateTime : 2019-11-28T08:20:39.000+0000
         * sort : null
         * status : null
         * brief : www
         * liveTime : null
         * duration : 2
         * cornerInfo : null
         */

        private int id;
        private int columnId;
        private int contentNumber;
        private String contentName;
        private String posterHomePath;
        private int contentType;
        private String createTime;
        private String updateTime;
        private Object sort;
        private Object status;
        private String brief;
        private Object liveTime;
        private String duration;
        private Object cornerInfo;
        private String posterListPath;
        private String posterDetailPath;

        public String getPosterListPath() {
            return posterListPath;
        }

        public void setPosterListPath(String posterListPath) {
            this.posterListPath = posterListPath;
        }

        public String getPosterDetailPath() {
            return posterDetailPath;
        }

        public void setPosterDetailPath(String posterDetailPath) {
            this.posterDetailPath = posterDetailPath;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getColumnId() {
            return columnId;
        }

        public void setColumnId(int columnId) {
            this.columnId = columnId;
        }

        public int getContentNumber() {
            return contentNumber;
        }

        public void setContentNumber(int contentNumber) {
            this.contentNumber = contentNumber;
        }

        public String getContentName() {
            return contentName;
        }

        public void setContentName(String contentName) {
            this.contentName = contentName;
        }

        public String getPosterHomePath() {
            return posterHomePath;
        }

        public void setPosterHomePath(String posterHomePath) {
            this.posterHomePath = posterHomePath;
        }

        public int getContentType() {
            return contentType;
        }

        public void setContentType(int contentType) {
            this.contentType = contentType;
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

        public Object getSort() {
            return sort;
        }

        public void setSort(Object sort) {
            this.sort = sort;
        }

        public Object getStatus() {
            return status;
        }

        public void setStatus(Object status) {
            this.status = status;
        }

        public String getBrief() {
            return brief;
        }

        public void setBrief(String brief) {
            this.brief = brief;
        }

        public Object getLiveTime() {
            return liveTime;
        }

        public void setLiveTime(Object liveTime) {
            this.liveTime = liveTime;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public Object getCornerInfo() {
            return cornerInfo;
        }

        public void setCornerInfo(Object cornerInfo) {
            this.cornerInfo = cornerInfo;
        }
    }
}
