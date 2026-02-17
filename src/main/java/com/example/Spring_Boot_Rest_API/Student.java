package com.example.Spring_Boot_Rest_API;

import jakarta.persistence.*;

@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String fullname;

    @Column(unique = true)
    private String email;

    @Column
    private String password;

    @Column
    private String address;

    // Construtor padrão
    public Student() {}

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {          // ✅ corrigido
        return address;
    }

    public void setAddress(String address) {  // ✅ corrigido
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [id=" + id +
                ", fullname=" + fullname +
                ", email=" + email +
                ", password=" + password +
                ", address=" + address + "]";
    }
}
