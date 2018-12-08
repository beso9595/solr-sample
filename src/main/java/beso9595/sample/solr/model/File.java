package beso9595.sample.solr.model;

import org.apache.solr.client.solrj.beans.Field;

import java.util.Date;

public class File {

    @Field("file_id")
    private Integer id;

    @Field("name")
    private String name;

    @Field("upload_date")
    private Date uploadDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", uploadDate=" + uploadDate +
                '}';
    }
}
