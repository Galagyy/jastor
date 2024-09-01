package com.galagyy.jastor.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TextFile implements Serializable {
    private String content;
    private String author;

    private LocalDateTime created;
    private LocalDateTime modified;

    public TextFile(String content, String author, LocalDateTime created, LocalDateTime modified) {
        this.content = content;
        this.author = author;
        this.created = created;
        this.modified = modified;
    }

    public TextFile(String content, String author) {
        this.content = content;
        this.author = author;

        this.created = LocalDateTime.now();
        this.modified = null;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }
}
