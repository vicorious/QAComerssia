package com.example.springboot.dto;

public class CustomResponse
{
    private String ld_domain;
    private String ld_site;

    public CustomResponse(String ld_domain, String ld_site) {
        this.ld_domain = ld_domain;
        this.ld_site = ld_site;
    }

    public String getLd_domain() {
        return ld_domain;
    }

    public void setLd_domain(String ld_domain) {
        this.ld_domain = ld_domain;
    }

    public String getLd_site() {
        return ld_site;
    }

    public void setLd_site(String ld_site) {
        this.ld_site = ld_site;
    }
}