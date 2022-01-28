public class place {
    String name;

    int category;
    static int undefined = -1;
    static int neighborhood = 1;
    static int shoppingMall = 2;
    static int hospital = 3;
    static int port = 4;

    public place(){
        this.name = "anonymous place";
        this.category = undefined;
    }

    public place(String name1, int category1) {
        this.name = name1;
        this.category = category1;
    }


}
