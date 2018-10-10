package com.example.slave.entity;

import java.io.Serializable;

public class Caerecogmode implements Serializable {
    private String recogmodeid;

    private String qrseperatechar;

    private Integer rowcount;

    private Integer columuncount;

    private static final long serialVersionUID = 1L;

    public String getRecogmodeid() {
        return recogmodeid;
    }

    public void setRecogmodeid(String recogmodeid) {
        this.recogmodeid = recogmodeid == null ? null : recogmodeid.trim();
    }

    public String getQrseperatechar() {
        return qrseperatechar;
    }

    public void setQrseperatechar(String qrseperatechar) {
        this.qrseperatechar = qrseperatechar == null ? null : qrseperatechar.trim();
    }

    public Integer getRowcount() {
        return rowcount;
    }

    public void setRowcount(Integer rowcount) {
        this.rowcount = rowcount;
    }

    public Integer getColumuncount() {
        return columuncount;
    }

    public void setColumuncount(Integer columuncount) {
        this.columuncount = columuncount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", recogmodeid=").append(recogmodeid);
        sb.append(", qrseperatechar=").append(qrseperatechar);
        sb.append(", rowcount=").append(rowcount);
        sb.append(", columuncount=").append(columuncount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}