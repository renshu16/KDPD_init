package com.aiyacloud.dao.domain.entity.ext;

import com.aiyacloud.dao.domain.entity.User;

/**
 * Created by toothbond on 16/12/9.
 */
public class UserExt extends User {
    //盘点id
    Integer mainId;

    public Integer getMainId() {
        return mainId;
    }

    public void setMainId(Integer mainId) {
        this.mainId = mainId;
    }
}
