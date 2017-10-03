/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freshproject;

/**
 *
 * @author user
 */
public class Person {
    private String name;
    private String gender;
    private Boolean married;
    private Integer age;

    public Person() {
    }

    public Person(String name, String gender, Boolean married, Integer age) {
        this.name = name;
        this.gender = gender;
        this.married = married;
        this.age = age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the married
     */
    public Boolean getMarried() {
        return married;
    }

    /**
     * @param married the married to set
     */
    public void setMarried(Boolean married) {
        this.married = married;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }
    
    
    
}
