package studentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    private int steamNumber;
    private List<StudentGroup> studSteam;

    public StudentSteam(int steamNumber, List<StudentGroup> studSteam) {
        this.steamNumber = steamNumber;
        this.studSteam = studSteam;
    }

    public int getSteamNumber() {
        return steamNumber;
    }

    public void setSteamNumber(int steamNumber) {
        this.steamNumber = steamNumber;
    }

    public List<StudentGroup> getStudSteam() {
        return studSteam;
    }

    public void setStudSteam(List<StudentGroup> studSteam) {
        this.studSteam = studSteam;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < studSteam.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }
                return studSteam.get(index++);
            }
        };
    }

    @Override
    public String toString() {
        return "StudentSteam - " + steamNumber
                + ", countGroup - " + studSteam.size()
                + ", \n" + studSteam + " ";
    }

}
