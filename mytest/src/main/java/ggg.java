import cn.hutool.core.bean.BeanUtil;
import homework.DoctorFileVO;
import homework.DoctorInfoVO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Levy Zhao
 * @since 2021-03-19 18:27
 **/
public class ggg {

    public static void main(String[] args) {
        DoctorInfoVO doctorInfoVO = new DoctorInfoVO();
        doctorInfoVO.setDoctorSealNamePath("1111/11");
        doctorInfoVO.setCompanySealPath("222/22");
        doctorInfoVO.setTitlePath("3333/33");
        assembleParam(doctorInfoVO);
        System.out.println(doctorInfoVO.getDoctorFileVOList());
    }

    // 组装参数
    private static void assembleParam(DoctorInfoVO doctorInfoVO) {

        String separator = "/";
        // 医生签名图路径
        String doctorSealNamePath = Optional.ofNullable(doctorInfoVO.getDoctorSealNamePath()).orElse("");
        String doctorSealName = getName(doctorSealNamePath, separator);
        // 公司签章图路径
        String companySealPath = Optional.ofNullable(doctorInfoVO.getCompanySealPath()).orElse("");
        String companySealName = getName(companySealPath, separator);
        // 抬头图路径
        String titlePath = Optional.ofNullable(doctorInfoVO.getTitlePath()).orElse("");
        String titleName = getName(titlePath, separator);

        List<DoctorFileVO> list = new ArrayList<>();
        DoctorFileVO doctorFileVO = new DoctorFileVO();
        doctorFileVO.setFilePath(doctorSealNamePath);
        doctorFileVO.setName(doctorSealName);
        list.add(doctorFileVO);

        DoctorFileVO doctorFileVO1 = new DoctorFileVO();
        BeanUtil.copyProperties(doctorFileVO, doctorFileVO1);
        doctorFileVO1.setFilePath(companySealPath);
        doctorFileVO1.setName(companySealName);
        list.add(doctorFileVO1);

        DoctorFileVO doctorFileVO2 = new DoctorFileVO();

        BeanUtil.copyProperties(doctorFileVO, doctorFileVO2);
        doctorFileVO2.setFilePath(titlePath);
        doctorFileVO2.setName(titleName);
        list.add(doctorFileVO2);

        doctorInfoVO.setDoctorFileVOList(list);
    }

    private static String getName(String str, String tag) {
        return str.substring(str.lastIndexOf(tag) == -1 ? 0 : str.lastIndexOf(tag) + 1);
    }
}
