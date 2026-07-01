package com.huawei.digitalpayment.checkout.model.entity;

import android.text.TextUtils;
import com.huawei.digitalpayment.checkout.ui.view.banner.HomeFunctions;
import com.huawei.http.BaseResp;
import java.util.List;
import java.util.Map;

public class HomeDynamicMenu extends BaseResp implements HomeFunctions {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private String backgroundImageUrl;
    private String backgroundRatio;
    private String execute;
    private String imageUrl;
    private List<DynamicItemBean> list;
    private String menuName;
    private String menuType;
    private String order;
    private String startTime;
    private String stopTime;
    private String titleImageUrl;
    private String startTimeUTC = "";
    private String stopTimeUTC = "";

    public String getMenuType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 67;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.menuType;
        int i5 = i2 + 97;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setMenuType(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.menuType = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getMenuName() {
        int i = 2 % 2;
        int i2 = component2 + 25;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.menuName;
        int i5 = i3 + 93;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setMenuName(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.menuName = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 85;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public String getOrder() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 39;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.order;
            int i4 = 42 / 0;
        } else {
            str = this.order;
        }
        int i5 = i2 + 75;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setOrder(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 19;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.order = str;
        int i5 = i2 + 43;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
    }

    @Override
    public String getStartTime() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 87;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.startTime;
        int i5 = i2 + 67;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
        return str;
    }

    public void setStartTime(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 45;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.startTime = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 49;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public String getStopTime() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.stopTime;
        int i5 = i3 + 83;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override
    public String getStartTimeUTC() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.startTimeUTC;
        int i5 = i3 + 7;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setStartTimeUTC(String str) {
        int i = 2 % 2;
        int i2 = component2 + 89;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.startTimeUTC = str;
        int i5 = i3 + 75;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public String getStopTimeUTC() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.stopTimeUTC;
        }
        throw null;
    }

    public void setStopTimeUTC(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.stopTimeUTC = str;
        int i5 = i3 + 31;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setStopTime(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.stopTime = str;
        int i5 = i3 + 99;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public List<DynamicItemBean> getList() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        List<DynamicItemBean> list = this.list;
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
        return list;
    }

    public void setList(List<DynamicItemBean> list) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.list = list;
        int i5 = i3 + 67;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getImageUrl() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.imageUrl;
        int i5 = i3 + 19;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setImageUrl(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.imageUrl = str;
        int i5 = i3 + 81;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getExecute() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 101;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.execute;
        int i4 = i2 + 77;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public void setExecute(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.execute = str;
        if (i4 == 0) {
            int i5 = 78 / 0;
        }
        int i6 = i3 + 7;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getTitleImageUrl() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 125;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.titleImageUrl;
        int i5 = i2 + 51;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTitleImageUrl(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 91;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.titleImageUrl = str;
        int i5 = i2 + 33;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 45 / 0;
        }
    }

    public String getBackgroundImageUrl() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 13;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.backgroundImageUrl;
        int i5 = i2 + 85;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setBackgroundImageUrl(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.backgroundImageUrl = str;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 65;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public String getBackgroundRatio() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 19;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.backgroundRatio;
        int i5 = i2 + 85;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setBackgroundRatio(String str) {
        int i = 2 % 2;
        int i2 = component2 + 25;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.backgroundRatio = str;
        int i5 = i3 + 37;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static class DynamicItemBean extends BaseResp implements HomeFunctions {
        private static int ShareDataUIState = 1;
        private static int component2;
        private String bulletin;
        private String content;
        private String delayTime;
        private String editEnable;
        private String execute;
        private String execute2;
        private String guestGoPage;
        private String imageUrl;
        private String imgUrl;
        private String name;
        private String order;
        private Map<String, String> param;
        private String showSeconds;
        private String startTime;
        private String stopTime;
        private String time;
        private String title;
        private String url;
        private String startTimeUTC = "";
        private String stopTimeUTC = "";
        private String funcId = "";
        private boolean isNeedHide = false;

        @Override
        public String getStartTime() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 21;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.startTime;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void setStartTime(String str) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 29;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            this.startTime = str;
            if (i3 != 0) {
                throw null;
            }
        }

        @Override
        public String getStopTime() {
            int i = 2 % 2;
            int i2 = component2 + 65;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            String str = this.stopTime;
            int i5 = i3 + 125;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void setStopTime(String str) {
            int i = 2 % 2;
            int i2 = component2 + 75;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            this.stopTime = str;
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String getImageUrl() {
            int i = 2 % 2;
            if (TextUtils.isEmpty(this.imageUrl)) {
                int i2 = component2 + 77;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    this.imageUrl = getImgUrl();
                } else {
                    this.imageUrl = getImgUrl();
                    throw null;
                }
            }
            String str = this.imageUrl;
            int i3 = component2 + 89;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }

        public void setImageUrl(String str) {
            int i = 2 % 2;
            int i2 = component2 + 61;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            this.imageUrl = str;
            if (i4 == 0) {
                int i5 = 74 / 0;
            }
            int i6 = i3 + 49;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }

        public String getImgUrl() {
            int i = 2 % 2;
            int i2 = component2 + 123;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return this.imgUrl;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void setImgUrl(String str) {
            int i = 2 % 2;
            int i2 = component2 + 91;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            this.imgUrl = str;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i3 + 41;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }

        public String getDelayTime() {
            int i = 2 % 2;
            int i2 = component2 + 115;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            if (TextUtils.isEmpty(this.delayTime)) {
                int i4 = ShareDataUIState + 41;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                this.delayTime = getShowSeconds();
                int i6 = component2 + 77;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 % 3;
                }
            }
            return this.delayTime;
        }

        public void setDelayTime(String str) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 37;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            this.delayTime = str;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i2 + 125;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 0;
            }
        }

        public String getShowSeconds() {
            int i = 2 % 2;
            int i2 = component2 + 39;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return this.showSeconds;
            }
            throw null;
        }

        public void setShowSeconds(String str) {
            int i = 2 % 2;
            int i2 = component2 + 95;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            this.showSeconds = str;
            if (i3 == 0) {
                throw null;
            }
        }

        @Override
        public String getOrder() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 51;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.order;
            int i5 = i2 + 63;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public void setOrder(String str) {
            int i = 2 % 2;
            int i2 = component2 + 119;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            this.order = str;
            int i5 = i3 + 67;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }

        public String getGuestGoPage() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 33;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.guestGoPage;
            int i4 = i2 + 125;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public void setGuestGoPage(String str) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 21;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            this.guestGoPage = str;
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Map<String, String> getParam() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 65;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            Map<String, String> map = this.param;
            int i5 = i2 + 1;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return map;
            }
            throw null;
        }

        public void setParam(Map<String, String> map) {
            int i = 2 % 2;
            int i2 = component2 + 29;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            this.param = map;
            int i5 = i3 + 37;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 9 / 0;
            }
        }

        public String getExecute() {
            int i = 2 % 2;
            int i2 = component2 + 47;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return this.execute;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void setExecute(String str) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 61;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            this.execute = str;
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String getExecute2() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 19;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.execute2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void setExecute2(String str) {
            int i = 2 % 2;
            int i2 = component2 + 13;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            this.execute2 = str;
            int i5 = i3 + 103;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 98 / 0;
            }
        }

        public String getContent() {
            int i = 2 % 2;
            if (TextUtils.isEmpty(this.content)) {
                int i2 = ShareDataUIState + 21;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                this.content = getBulletin();
                int i4 = component2 + 53;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
            }
            return this.content;
        }

        public void setContent(String str) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 101;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            this.content = str;
            if (i4 != 0) {
                int i5 = 30 / 0;
            }
            int i6 = i3 + 3;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 83 / 0;
            }
        }

        public String getBulletin() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 101;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.bulletin;
            int i5 = i2 + 29;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public void setBulletin(String str) {
            int i = 2 % 2;
            int i2 = component2 + 21;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            this.bulletin = str;
            if (i3 == 0) {
                int i4 = 27 / 0;
            }
        }

        @Override
        public String getStartTimeUTC() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 47;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.startTimeUTC;
            int i5 = i2 + 43;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public void setStartTimeUTC(String str) {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 115;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            this.startTimeUTC = str;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i2 + 69;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        @Override
        public String getStopTimeUTC() {
            int i = 2 % 2;
            int i2 = component2 + 89;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            String str = this.stopTimeUTC;
            if (i3 == 0) {
                int i4 = 65 / 0;
            }
            return str;
        }

        public void setStopTimeUTC(String str) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 47;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            this.stopTimeUTC = str;
            int i5 = i3 + 71;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }

        public String getFuncId() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 97;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.funcId;
            int i5 = i2 + 35;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public void setFuncId(String str) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 29;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            this.funcId = str;
            int i5 = i2 + 25;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }

        public String getEditEnable() {
            int i = 2 % 2;
            int i2 = component2 + 51;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.editEnable;
            int i4 = i3 + 79;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public void setEditEnable(String str) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 101;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            this.editEnable = str;
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean isNeedHide() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 109;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.isNeedHide;
            int i5 = i2 + 81;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public void setNeedHide(boolean z) {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 41;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            this.isNeedHide = z;
            int i5 = i2 + 81;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }

        public String getName() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 47;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.name;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void setName(String str) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 117;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            this.name = str;
            int i5 = i3 + 21;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }

        public String getTime() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 11;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.time;
            int i5 = i2 + 75;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 53 / 0;
            }
            return str;
        }

        public void setTime(String str) {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 29;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            this.time = str;
            int i5 = i2 + 95;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }

        public String getTitle() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 17;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.title;
            int i5 = i2 + 29;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public void setTitle(String str) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 63;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            this.title = str;
            int i5 = i2 + 121;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String getUrl() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 17;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.url;
            int i5 = i2 + 43;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public void setUrl(String str) {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 89;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            this.url = str;
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i2 + 91;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 53 / 0;
            }
        }
    }
}
