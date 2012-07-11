package org.openblend.fejstbuk.ui;

import org.openblend.fejstbuk.domain.Gender;
import org.openblend.fejstbuk.domain.User;

import javax.enterprise.context.ConversationScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * @author <a href="mailto:tomaz.cerar@redhat.com">Tomaz Cerar</a>
 */
@ConversationScoped
@Named
public class RegisterAction implements Serializable {
    private String name;
    private Gender gender;
    private int age;
    private String country;

    private String lastName;

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void register() {
        User user = new User();
        user.setName(name);
        user.setGender(gender);
        user.setSurname(lastName);

    }
}
