package org.hqu.production_ms.domain;

import java.math.BigDecimal;
import java.util.Date;

public class CarSpecial {
	private Integer carId;

    private String dengjizsid;

    private String shebeiid;

    private String username;

    private String jigan;

    private Date dengjitiem;

    private String dengjiid;

    private String carcjh;

    private String color;

    private String usenature;

    private String carway;

    private Date manufacturedate;

    private String issueorgan;

    private Date issuedate;

    private String buycarapproval;

    private String newsource;

    private BigDecimal carprice;

    private BigDecimal oldcarprice;

    private String supplier;

    private String phone;

    private String image;

    private CarType carType;
    
    private Department department;

    private String carnumber;

    public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getDengjizsid() {
        return dengjizsid;
    }

    public void setDengjizsid(String dengjizsid) {
        this.dengjizsid = dengjizsid == null ? null : dengjizsid.trim();
    }

    public String getShebeiid() {
        return shebeiid;
    }

    public void setShebeiid(String shebeiid) {
        this.shebeiid = shebeiid == null ? null : shebeiid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getJigan() {
        return jigan;
    }

    public void setJigan(String jigan) {
        this.jigan = jigan == null ? null : jigan.trim();
    }

    public Date getDengjitiem() {
        return dengjitiem;
    }

    public void setDengjitiem(Date dengjitiem) {
        this.dengjitiem = dengjitiem;
    }

    public String getDengjiid() {
        return dengjiid;
    }

    public void setDengjiid(String dengjiid) {
        this.dengjiid = dengjiid == null ? null : dengjiid.trim();
    }

    public String getCarcjh() {
        return carcjh;
    }

    public void setCarcjh(String carcjh) {
        this.carcjh = carcjh == null ? null : carcjh.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getUsenature() {
        return usenature;
    }

    public void setUsenature(String usenature) {
        this.usenature = usenature == null ? null : usenature.trim();
    }

    public String getCarway() {
        return carway;
    }

    public void setCarway(String carway) {
        this.carway = carway == null ? null : carway.trim();
    }

    public Date getManufacturedate() {
        return manufacturedate;
    }

    public void setManufacturedate(Date manufacturedate) {
        this.manufacturedate = manufacturedate;
    }

    public String getIssueorgan() {
        return issueorgan;
    }

    public void setIssueorgan(String issueorgan) {
        this.issueorgan = issueorgan == null ? null : issueorgan.trim();
    }

    public Date getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

    public String getBuycarapproval() {
        return buycarapproval;
    }

    public void setBuycarapproval(String buycarapproval) {
        this.buycarapproval = buycarapproval == null ? null : buycarapproval.trim();
    }

    public String getNewsource() {
        return newsource;
    }

    public void setNewsource(String newsource) {
        this.newsource = newsource == null ? null : newsource.trim();
    }

    public BigDecimal getCarprice() {
        return carprice;
    }

    public void setCarprice(BigDecimal carprice) {
        this.carprice = carprice;
    }

    public BigDecimal getOldcarprice() {
        return oldcarprice;
    }

    public void setOldcarprice(BigDecimal oldcarprice) {
        this.oldcarprice = oldcarprice;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber == null ? null : carnumber.trim();
    }
}
