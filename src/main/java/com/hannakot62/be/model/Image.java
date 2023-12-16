package com.hannakot62.be.model;
import jakarta.persistence.*;


@Entity
@Table (name="images")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    private String name;
    private String originalFilename;
    private long size;
    private String contentType;
    @Lob
    private byte[] bytes;

    public Image() {
    }

    public Image(int id, String name, String originalFilename, long size, String contentType, byte[] bytes) {
        this.id = id;
        this.name = name;
        this.originalFilename = originalFilename;
        this.size = size;
        this.contentType = contentType;
        this.bytes = bytes;
    }

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

    public String getOriginalFilename() {
        return originalFilename;
    }

    public void setOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
}
