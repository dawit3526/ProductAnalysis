package com.eri.productAnalysis.portal.model;
import java.io.Serializable;

public class ProductImage  implements Serializable {

    private int size;
    private byte[] data;
    private String type;

    public int getSize() {
        return data != null ? data.length : 0;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
