package homework;

/**
 * @author Levy Zhao
 * @since 2021-03-19 18:30
 **/
public class DoctorFileVO {

    private String name;
    private String filePath;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "DoctorFileVO{" +
                "name='" + name + '\'' +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
