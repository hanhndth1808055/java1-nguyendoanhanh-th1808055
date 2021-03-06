package assignment6;

public class News implements INews {
    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float AverageRate;
    public Integer RateList[] = new Integer[3];

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public News() {
    }

    public News(int ID, String title, String publishDate, String author, String content, int a, int b, int c) {
        this.ID = ID;
        this.Title = title;
        this.PublishDate = publishDate;
        this.Author = author;
        this.Content = content;
        this.RateList[0] = a;
        this.RateList[1] = b;
        this.RateList[2] = c;
    }


    public float Calculate() {
        this.AverageRate = (((float) this.RateList[0] + (float) this.RateList[1] + (float) this.RateList[2]) / 3);
        return (((float) this.RateList[0] + (float) this.RateList[1] + (float) this.RateList[2]) / 3);
    }

    public void Display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Publishing Date: " + getPublishDate());
        System.out.println("Author: " + getAuthor());
        System.out.println("Content: " + getContent());
        System.out.println("Average Rate: " + getAverageRate());
    }

}
