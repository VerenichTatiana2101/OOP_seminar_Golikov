package seminar2;
import java.util.List;
import java.util.ArrayList;

public class CherryTigo {

    private List<IStartEngine> motors;

    public CherryTigo() {
        this.motors = new ArrayList<IStartEngine>();
    }

    public List<IStartEngine> getMotors() {
        return motors;
    }

    public void setMotors(List<IStartEngine> motors) {
        this.motors = motors;
    }

    public void StartEngine(IStartEngine motor){

    }



    
    
    
}
