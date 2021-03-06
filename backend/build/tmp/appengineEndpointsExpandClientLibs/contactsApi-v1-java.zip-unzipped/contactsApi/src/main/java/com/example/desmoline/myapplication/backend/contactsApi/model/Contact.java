/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-04-08 17:16:44 UTC)
 * on 2016-04-15 at 23:51:56 UTC 
 * Modify at your own risk.
 */

package com.example.desmoline.myapplication.backend.contactsApi.model;

/**
 * Model definition for Contact.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contactsApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Contact extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dateCreated;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String homeAddress;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("tel_num1")
  private java.lang.String telNum1;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("tel_num2")
  private java.lang.String telNum2;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("tel_num3")
  private java.lang.String telNum3;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDateCreated() {
    return dateCreated;
  }

  /**
   * @param dateCreated dateCreated or {@code null} for none
   */
  public Contact setDateCreated(java.lang.String dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * @param email email or {@code null} for none
   */
  public Contact setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getHomeAddress() {
    return homeAddress;
  }

  /**
   * @param homeAddress homeAddress or {@code null} for none
   */
  public Contact setHomeAddress(java.lang.String homeAddress) {
    this.homeAddress = homeAddress;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public Contact setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public Contact setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTelNum1() {
    return telNum1;
  }

  /**
   * @param telNum1 telNum1 or {@code null} for none
   */
  public Contact setTelNum1(java.lang.String telNum1) {
    this.telNum1 = telNum1;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTelNum2() {
    return telNum2;
  }

  /**
   * @param telNum2 telNum2 or {@code null} for none
   */
  public Contact setTelNum2(java.lang.String telNum2) {
    this.telNum2 = telNum2;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTelNum3() {
    return telNum3;
  }

  /**
   * @param telNum3 telNum3 or {@code null} for none
   */
  public Contact setTelNum3(java.lang.String telNum3) {
    this.telNum3 = telNum3;
    return this;
  }

  @Override
  public Contact set(String fieldName, Object value) {
    return (Contact) super.set(fieldName, value);
  }

  @Override
  public Contact clone() {
    return (Contact) super.clone();
  }

}
