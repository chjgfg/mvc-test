package org.lyf.bean;

import java.io.Serializable;

public class User implements Serializable {


  private String id;
  private String name;
  private String pass;
  private String email;
  private String addr;

/*  public User() {
  }

  public User(String id, String name, String pass, String email, String addr) {
    this.id = id;
    this.name = name;
    this.pass = pass;
    this.email = email;
    this.addr = addr;
  }*/

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

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", pass='" + pass + '\'' +
        ", email='" + email + '\'' +
        ", addr='" + addr + '\'' +
        '}';
  }
}
