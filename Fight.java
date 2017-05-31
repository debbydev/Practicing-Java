package ultraemojicombat;

import java.util.Random;

public class Fight {
private Fighters challenged;
private Fighters challenger;
private int rounds;
private boolean approved;
//Métodos Públicos
public void marcarLuta(Fighters L1, Fighters L2) {
if ((L1.getCategory()==L2.getCategory()) && (L1!=L2)) {
    this.approved = true;
    this.challenged = L1;
    this.challenger = L2;
    } else {
            this.approved = false;
            this.challenged = null;
            this.challenger = null;
            }     
}
public void lutar(){
    if (this.approved=true) {
        System.out.println("Challenged: ");
        challenged.introduce();
        System.out.println("Challenger: ");
        challenger.introduce();
        Random aleatorio = new Random(); 
        int winner = aleatorio.nextInt (3);
        switch (winner){
            case 0: 
                System.out.println("");
                System.out.println(""); 
                System.out.println("Draw!");
                System.out.println("");
                System.out.println("");
                challenged.drawFight();
                challenger.drawFight();
                break;
            case 1:
                System.out.println("");
                System.out.println("");
                System.out.println(challenged.getName()+" won!");
                System.out.println("");
                System.out.println("");
                challenged.winFight();
                challenger.loseFight();
                break;
            case 2:
                System.out.println("");
                System.out.println("");
                System.out.println(challenger.getName()+ " won!");
                System.out.println("");
                System.out.println("");
                challenged.loseFight();
                challenger.winFight();
                break;
            }
        } else {
            System.out.println("This fight cannot happen.");
            }
     }
//Métodos Especiais
    public Fighters getChallenged() {
        return challenged;
    }
    public void setChallenged (Fighters challenged) {
        this.challenged = challenged;
    }
    public Fighters getChallenger() {
        return challenger;
    }
    public void setChallenger(Fighters challenger) {
        this.challenger = challenger;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

}
