public class EBook extends Book{
private String fileName;


public EBook (String title, String author, String fileName){
    super(title,author);

    get.title = title;
    get.author = author;
    get.fileName = fileName;
    
}

public void setFileName(String fileName){
    this.fileName = fileName;

}
public String getFileName() {
    return this.fileName;
    
}
}