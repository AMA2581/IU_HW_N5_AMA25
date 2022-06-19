import java.io.File;

public class Image {
    private String fileName;
    private String fileSize;
    private String fileType;

    // default constructor
    Image(){
        fileName = "a.png";
        
        // file size
        File file = new File(fileName);
        fileSize = String.valueOf(file.length());
        
        // file extension
        int index = fileName.lastIndexOf('.');
        if(index > 0) {
            fileType = fileName.substring(index + 1);
        }
    }

    // parameter constructor
    Image(String fileName) {
        this.fileName = fileName;

        // file size
        File file = new File(fileName);
        this.fileSize = String.valueOf(file.length());
        
        // file extension
        int index = fileName.lastIndexOf('.');
        if(index > 0) {
            this.fileType = fileName.substring(index + 1);
        }
    }

    // copy constructor
    Image(Image t){
        this.fileName = t.fileName;
        this.fileType = t.fileType;
        this.fileSize = t.fileSize;
    }

    // setter method
    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public void setFileSize(String fileSize){
        this.fileSize = fileSize;
    }

    public void setFileType(String fileType){
        this.fileType = fileType;
    }

    // getter method
    public String getFileName(){
        return this.fileName;
    }

    public String getFileSize(){
        return this.fileSize;
    }

    public String getFileType(){
        return this.fileType;
    }

    public boolean equals(Object obj){
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Image other = (Image) obj;
        if(this.fileName != other.fileName) return false;
        if(this.fileSize != other.fileSize) return false;
        if(this.fileType != other.fileType) return false;
        return true;
    }

}
