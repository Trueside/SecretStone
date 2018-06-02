import java.util.ArrayList;

public class Tournament {
    private String tournamentName = "";
    private int quantityOfTeam = 0;
    private int quantityOfGroup = 0;

//    Team[][] teamList = new Team[][];
    private ArrayList<Team> tourniment = new ArrayList<Team>();

    public Tournament (String tournamentName, int quantityOfGroup, int quantityOfTeam) {
        this(tournamentName);
        this.quantityOfGroup = quantityOfGroup;
        this.quantityOfTeam = quantityOfTeam;

        for (int i = quantityOfGroup; i < quantityOfGroup; i++) {
            this.tourniment.add(group);
        }
    }

    public Tournament (String tournamentName) {
        this.tournamentName = tournamentName;
        this.quantityOfGroup = 2;
        this.quantityOfTeam = 16;
    }
}
