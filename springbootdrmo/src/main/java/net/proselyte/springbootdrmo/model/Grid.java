package net.proselyte.springbootdrmo.model;


import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name ="zak")
public class Grid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;

    @Column(name = "bell")
    private String bell;

    public String getBell() {
        return bell;
    }

    public void setBell(String bell) {
        this.bell = bell;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Column(name = "code")
    private String code;

    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    public String getDendStr() {
        return dendStr;
    }

    public void setDendStr(String dendStr) {
        this.dendStr = dendStr;
    }

    @Column(name = "date_string")
    private String dateStr;

    @Column(name = "dend_string")
    private String dendStr;

    @Column(name = "name")
    private String name;

    @Column(name="date_end")
    private Date dend;

    @Column(name = "object")
    private String object;

    @Column(name = "status")
    private String status;

    @Column(name="valute")
    private char valute;

    @Column(name="ei")
    private String ei;

    @Column(name="name_org")
    private String name_org;

    @Column(name="inn")
    private String inn;

    @Column(name="email")
    private String email;

    @Column(name="adres")
    private String adres;

    @Column(name = "price")
    private Integer price;

    @Column(name = "sunject")
    private String subject;

    @Column(name = "definition")
    private String definition;

    @Column(name = "phone")
    private String phone;

    @Column(name = "name_thing")
    private String namething;

    @Column(name = "trademark")
    private String trademark;

    @Column(name = "volume")
    private String volume;

    @Column(name = "date")
    private Date date;

    @Column(name="section")
    private String section;

    @Column(name="sd")
    private String phere;

    public int getId() {
        return userid;
    }

    public void setId(int user_id) {
        this.userid = userid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDend() {
        return dend;
    }

    public void setDend(Date dend) {
        this.dend = dend;
    }

    public String getName_org() {
        return name_org;
    }

    public void setName_org(String name_org) {
        this.name_org = name_org;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getEi() {
        return ei;
    }

    public void setEi(String ei) {
        this.ei = ei;
    }

    public char getValute() {
        return valute;
    }

    public void setValute(char valute) {
        this.valute = valute;
    }


    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }


    public String getPhere() {
        return phere;
    }

    public void setPhere(String phere) {
        this.phere = phere;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNamething() {
        return namething;
    }

    public void setNamething(String namething) {
        this.namething = namething;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

}
