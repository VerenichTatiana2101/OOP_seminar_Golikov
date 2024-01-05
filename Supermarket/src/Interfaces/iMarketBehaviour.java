package Supermarket.src.Interfaces;

import java.util.List;
import Supermarket.src.Classes.Actor;

public interface iMarketBehaviour {
    void acceptToMarket(iActorBehaviuor actor);
    void releaseFromMarket(List<Actor> actor);
    // void releaseFromMarket(List<iActorBehaviuor> actor); скорее всего так
    void update();
}
