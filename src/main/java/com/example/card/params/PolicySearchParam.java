package com.example.card.params;

import com.example.card.utils.DateJsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Date;

/**
 * Created by racoon on 2017/4/20.
 */
public class PolicySearchParam {
    private Integer page = 1;
    private Integer pageSize = 10;
    @JsonDeserialize(using = DateJsonDeserializer.class)
    private Date createTimeBegin;
    @JsonDeserialize(using = DateJsonDeserializer.class)
    private Date createTimeEnd;
    private Integer exportStatus;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Date getCreateTimeBegin() {
        return createTimeBegin;
    }

    public void setCreateTimeBegin(Date createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
    }

    public Date getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(Date createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public Integer getExportStatus() {
        return exportStatus;
    }

    public void setExportStatus(Integer exportStatus) {
        this.exportStatus = exportStatus;
    }
}
