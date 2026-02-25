package aggregation;

public class Book {
    String title;
    int publishYear;

    Book(String title, int publishYear){
        this.title= title;
        this.publishYear= publishYear;
    }
    String displayInfo(){
        return this.title + " ,Publish Year(" + this.publishYear+ ")";
    }
}
