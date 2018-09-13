package com.gerber.controllers.validation;

import com.gerber.controllers.validation.validation.BloodCode;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Knight
{

    @InitBinder
    public void sprawdzaczSpacji(WebDataBinder webDataBinder)
    {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    @NotNull(message = "Knight must have First Name")
    @Size(min=1,max = 16,message = "Knight must have First Name, and it's can't be longer than 16 letters")
    public String firstName;
    @NotNull(message = "All knights must have guild")
    @Size(min=1,max = 16,message = "All knights must have guild")
    public String guildName;
    @NotNull(message = "All knights must paste age")
    @Min(value = 16,message = "You can only become knight, when you are 16 years old or higher")
    public Integer age;
    @NotNull(message = "You must chose Class")
    public String ownClass;
    @Pattern(regexp="^[0-9]{2}-[0-9]{3}",message = "All knights must have postal code on her village Format ( xx - xxx)")
    private String postalCode;

    @BloodCode(value="RH",message="must start with RH")
    private String bloodCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGuildName() {
        return guildName;
    }

    public void setGuildName(String guildName) {
        this.guildName = guildName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getOwnClass() {
        return ownClass;
    }

    public void setOwnClass(String ownClass) {
        this.ownClass = ownClass;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getBloodCode() {
        return bloodCode;
    }

    public void setBloodCode(String bloodCode) {
        this.bloodCode = bloodCode;
    }
}
