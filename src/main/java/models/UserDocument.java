package models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import utils.RoleEnum;

import java.util.Date;
import java.util.List;

@Document(collection = "users")
public class UserDocument {

  @Id String id;

  String name;

  String lastName;

  String businessName;

  @Indexed(unique = true)
  String email;

  String passwordHash;

  List<RoleEnum> roles;

  List<String> products;

  List<String> sales;

  Date createdAt;

  public UserDocument() {}

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

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPasswordHash() {
    return passwordHash;
  }

  public void setPasswordHash(String passwordHash) {
    this.passwordHash = passwordHash;
  }

  public List<RoleEnum> getRoles() {
    return roles;
  }

  public void setRoles(List<RoleEnum> roles) {
    this.roles = roles;
  }

  public List<String> getProducts() {
    return products;
  }

  public void setProducts(List<String> products) {
    this.products = products;
  }

  public List<String> getSales() {
    return sales;
  }

  public void setSales(List<String> sales) {
    this.sales = sales;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }
}
