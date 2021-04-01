package com.mzgy.springbootes.model;

/**
 * @author dongzh
 * @date 2021年03月31日 21:53
 * @function
 */
public class UserInfo {
    private Long id;
    private String name;
    private Integer age;
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
