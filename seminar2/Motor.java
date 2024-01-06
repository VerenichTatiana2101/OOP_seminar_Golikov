package seminar2;

public abstract class Motor implements IStartEngine {

    public Motor() {
    }

    @Override
    public void StartEngine() {
        System.out.println("is sarted");
        
    }
    
}
