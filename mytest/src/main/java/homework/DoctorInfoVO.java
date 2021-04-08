package homework;

import java.util.List;

/**
 * @author Levy Zhao
 * @since 2021-03-19 18:30
 **/
public class DoctorInfoVO {


    // 抬头图地址
    private String titlePath;
    // 公司签章图
    private String companySealPath;
    // 医生个人签名图
    private String doctorSealNamePath;

    private List<DoctorFileVO> doctorFileVOList;

    public String getTitlePath() {
        return titlePath;
    }

    public void setTitlePath(String titlePath) {
        this.titlePath = titlePath;
    }

    public String getCompanySealPath() {
        return companySealPath;
    }

    public void setCompanySealPath(String companySealPath) {
        this.companySealPath = companySealPath;
    }

    public String getDoctorSealNamePath() {
        return doctorSealNamePath;
    }

    public void setDoctorSealNamePath(String doctorSealNamePath) {
        this.doctorSealNamePath = doctorSealNamePath;
    }

    public List<DoctorFileVO> getDoctorFileVOList() {
        return doctorFileVOList;
    }

    public void setDoctorFileVOList(List<DoctorFileVO> doctorFileVOList) {
        this.doctorFileVOList = doctorFileVOList;
    }
}
