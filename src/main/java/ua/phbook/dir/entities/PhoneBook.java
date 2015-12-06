package ua.phbook.dir.entities;

import javax.persistence.*;

@Entity
public class PhoneBook {
    private int id;
    private int idUser;
    private String suname;
    private String fistName;
    private String middleName;
    private String phoneMobile;
    private String phoneHome;
    private String address;
    private String eMail;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_user")
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "suname")
    public String getSuname() {
        return suname;
    }

    public void setSuname(String suname) {
        this.suname = suname;
    }

    @Basic
    @Column(name = "fist_name")
    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    @Basic
    @Column(name = "middle_name")
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Basic
    @Column(name = "phone_mobile")
    public String getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    @Basic
    @Column(name = "phone_home")
    public String getPhoneHome() {
        return phoneHome;
    }

    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "e_mail")
    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhoneBook phoneBook = (PhoneBook) o;

        if (id != phoneBook.id) return false;
        if (idUser != phoneBook.idUser) return false;
        if (suname != null ? !suname.equals(phoneBook.suname) : phoneBook.suname != null) return false;
        if (fistName != null ? !fistName.equals(phoneBook.fistName) : phoneBook.fistName != null) return false;
        if (middleName != null ? !middleName.equals(phoneBook.middleName) : phoneBook.middleName != null) return false;
        if (phoneMobile != null ? !phoneMobile.equals(phoneBook.phoneMobile) : phoneBook.phoneMobile != null)
            return false;
        if (phoneHome != null ? !phoneHome.equals(phoneBook.phoneHome) : phoneBook.phoneHome != null) return false;
        if (address != null ? !address.equals(phoneBook.address) : phoneBook.address != null) return false;
        if (eMail != null ? !eMail.equals(phoneBook.eMail) : phoneBook.eMail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idUser;
        result = 31 * result + (suname != null ? suname.hashCode() : 0);
        result = 31 * result + (fistName != null ? fistName.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (phoneMobile != null ? phoneMobile.hashCode() : 0);
        result = 31 * result + (phoneHome != null ? phoneHome.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (eMail != null ? eMail.hashCode() : 0);
        return result;
    }
}
