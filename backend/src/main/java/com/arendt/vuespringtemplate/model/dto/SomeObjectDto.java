package com.arendt.vuespringtemplate.model.dto;

public class SomeObjectDto {
    private Long id;
    private String text;

    public SomeObjectDto(final Long id, final String text) {
        this.id = id;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }
}
