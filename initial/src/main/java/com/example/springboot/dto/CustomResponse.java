package com.example.springboot.dto;

public class CustomResponse
{
    private String pt_domain;
    private String pt_part;
    private String pt_article;
    private String pt_desc1;
    private String pt_desc2;
    private String pt_status;
    private String e_ld_domain;
    private String e_ld_site;
    private String e_ld_loc;
    private String e_ld_qty_oh;

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