package com.qcadoo.mes.basic.controllers.dataProvider.dto;

public class ColumnDTO {

    private String id;

    private String name;

    private String field;

    private boolean sortable = true;

    private String toolTip;

    public ColumnDTO(String id, String name, String field) {
        this.id = id;
        this.name = name;
        this.field = field;
        this.toolTip = name;
    }

    public ColumnDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public boolean isSortable() {
        return sortable;
    }

    public void setSortable(boolean sortable) {
        this.sortable = sortable;
    }

    public String getToolTip() {
        return toolTip;
    }

    public void setToolTip(String toolTip) {
        this.toolTip = toolTip;
    }
}