package movies;

public class Movie {
    private String name;
    private String category;

    Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String movieName() {
        return this.name;
    }

    public void movieName(String name) {
        this.name = name;
    }

    public String movieCategory() {
        return this.category;
    }

    public void movieCategory(String category) {
        this.category = category;
    }
}
