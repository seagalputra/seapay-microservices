package com.bravo.seapayusermanagement.domain;

import javax.persistence.*;
import java.io.Serializable;

@Table
@Entity
public class Merchant implements Serializable {
    @Id
    @GeneratedValue
    @Column(updatable = false)
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column
    private String name;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String storeName;

    @Column
    private String description;


    public Merchant() {

    }

    public Merchant(String name, String username, String password, String storeName, String description) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.storeName = storeName;
        this.description = description;
    }
}
