package com.star.sync.elasticsearch.model;

import java.util.Objects;

/**
 * @author <a href="mailto:wangchao.star@gmail.com">wangchao</a>
 * @version 1.0
 * @since 2017-08-26 22:57:00
 */
public class IndexTypeModel {
    private String index;

    public IndexTypeModel() {
    }

    public IndexTypeModel(String index, String type) {
        this.index = index;

    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IndexTypeModel that = (IndexTypeModel) o;
        return Objects.equals(index, that.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index);
    }
}
