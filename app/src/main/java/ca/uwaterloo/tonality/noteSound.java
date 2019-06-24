package ca.uwaterloo.tonality;

public class noteSound {

    private String pathName;
    private String fileName;
    private Integer id;

    public noteSound(String pathName){
        this.pathName = pathName;
        String[] splitPath = pathName.split("/");
        this.fileName = splitPath[splitPath.length - 1];
    }

    public String getPathName() {
        return pathName;
    }

    public String getFileName() {
        return fileName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
