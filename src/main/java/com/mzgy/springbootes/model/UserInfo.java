package com.mzgy.springbootes.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author dongzh
 * @date 2021年03月31日 21:53
 * @function
 */
@Document(indexName = "test_user")
public class UserInfo {
    @Id
    private Long id;
    @Field(type = FieldType.Text)
    private String name;
    @Field(type = FieldType.Integer)
    private Integer age;
    @Field(type = FieldType.Text)
    private String desc;

    public UserInfo() {

    }

    public UserInfo(Long id, String name, Integer age, String desc) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.desc = desc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
