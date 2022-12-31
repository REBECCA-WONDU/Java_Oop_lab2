public class Jimmy {

    String name;
    int id;

    Jimmy(String name,int id) {
        this.name=name;
        this.id=id;
    }

   public static void main(String[] args) {
        Jimmy table = new Jimmy("name",21);
       String name= table.name;
       System.out.println("name");

    }
}
