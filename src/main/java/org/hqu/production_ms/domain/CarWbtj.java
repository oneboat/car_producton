package org.hqu.production_ms.domain;

import java.util.Date;

public class CarWbtj {
    private Integer keepId;

    private Date startdate;

    private Date enddate;

    private String intervalkm;

    private String repairtype;

    private String suppliername;

    private CarRegister carRegister;

    private String carnum;

    private Department department;

    private String beiyong1;

    private String beiyong2;

    public Integer getKeepId() {
        return keepId;
    }

    public void setKeepId(Integer keepId) {
        this.keepId = keepId;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getIntervalkm() {
        return intervalkm;
    }

    public void setIntervalkm(String intervalkm) {
        this.intervalkm = intervalkm == null ? null : intervalkm.trim();
    }

    public String getRepairtype() {
        return repairtype;
    }

    public void setRepairtype(String repairtype) {
        this.repairtype = repairtype == null ? null : repairtype.trim();
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public CarRegister getCarRegister() {
		return carRegister;
	}

	public void setCarRegister(CarRegister carRegister) {
		this.carRegister = carRegister;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

    public String getCarnum() {
        return carnum;
    }

    public void setCarnum(String carnum) {
        this.carnum = carnum == null ? null : carnum.trim();
    }


    public String getBeiyong1() {
        return beiyong1;
    }

    public void setBeiyong1(String beiyong1) {
        this.beiyong1 = beiyong1 == null ? null : beiyong1.trim();
    }

    public String getBeiyong2() {
        return beiyong2;
    }

    public void setBeiyong2(String beiyong2) {
        this.beiyong2 = beiyong2 == null ? null : beiyong2.trim();
    }
}