
package ultraemojicombat;
public class Fighters {
//Atributos
private String name;
private String nationality;
private int age;
private float height;
private float weight;
private String category;
private int victories, defeats, draw;
//Métodos Público
public void introduce(){
    System.out.println("-----------");
    System.out.print("It's time! Introducing the fighter "+this.getName());
    System.out.print(", from "+ getNationality());
    System.out.print(", " + getAge()+" years old");
    System.out.println(", weighting "+ getWeight()+"kg.");
    System.out.print("He already won "+getVictories()+ " fights,");
    System.out.print(" lost "+getDefeats());
    System.out.println(" and drew "+getDraw()+".");
    System.out.println("--------------------------");
    System.out.println("--------------------------");
    }
public void status(){
    System.out.println(this.getName()+ " is a "+ this.getCategory()+"weight.");
    System.out.println("------------------------------------");
    System.out.println("Won: "+this.getVictories()+" time(s).");
    System.out.println("Lost: "+this.getDefeats()+" time(s).");
    System.out.println("Drew: "+this.getDraw()+" time(s).");
    System.out.println("-------------------------------------");
}
public void winFight(){
    this.setVictories(this.getVictories()+1);
}
public void loseFight(){
    this.setDefeats(this.getDefeats()+1);
}
public void drawFight(){
    this.setDraw(this.getDraw()+1);
}
//Métodos Especiais
    public Fighters(String name, String na, int ag, float he, float we, int vi, int de, int dr) {
        this.name = name;
        this.nationality = na;
        this.age = ag;
        this.height = he;
        this.setWeight (we);
        this.victories = vi;
        this.defeats = de;
        this.draw = dr;
    }
    public String getName() {
        return name;
    }
    public String getNationality() {
        return nationality;
    }
    public int getAge() {
        return age;
    }
    public float getHeight() {
        return height;
    }
    public float getWeight() {
        return weight;
    }
    public String getCategory() {
        return category;
    }
    public int getVictories() {
        return victories;
    }
    public int getDefeats() {
        return defeats;
    }
    public int getDraw() {
        return draw;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public void setWeight(float weight) {
        this.weight = weight;
        this.setCategory();
    }
    private void setCategory() {
        if (this.weight<52.2) {
            this.category="Invalid";
            } else if (this.weight<=70.3){
                this.category= "Light";
            } else if (this.weight<=83.9){
                this.category="Medium";
            } else if (this.weight<=120.2){
                this.category="Heavy";
            } else {
                this.category="Invalid";
        }
    }
    public void setVictories(int victories) {
        this.victories = victories;
    }
    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }
    public void setDraw(int draw) {
        this.draw = draw;
    }

}
