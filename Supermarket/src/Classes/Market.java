package Supermarket.src.Classes;

import Supermarket.src.Interfaces.iMarketBehaviour;
import Supermarket.src.Interfaces.iActorBehaviuor;
import Supermarket.src.Interfaces.iQueueBehaviour;

import java.util.List;
import java.util.ArrayList;

/** класс магазин. Имплементирует интерфейсы */
public class Market implements iMarketBehaviour, iQueueBehaviour {

    /** список покупателей в магазине. Приватный(инкапсуляция) */
    //private List<Actor> queue;
    private List<iActorBehaviuor> queue;

    /** конструктор класса */
    public Market() {
        //this.queue = new ArrayList<Actor>();
        this.queue = new ArrayList<iActorBehaviuor>();
    }

    /** переопределение метода: Покупатель зашел в магазин */
    @Override
    //public void acceptToMarket(Actor actor) {
    public void acceptToMarket(iActorBehaviuor actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /** переопределение метода: Покупатель занял очередь */
    @Override
    //public void takeInQueue(Actor actor) {
    public void takeInQueue(iActorBehaviuor actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    /** переопределение метода: покупатель покинул магазин */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    //скорее всего так
    // @Override
    // public void releaseFromMarket(List<iActorBehaviuor> actors) {
    //     for (iActorBehaviuor actor : actors) {
    //         System.out.println(actor.getActor().getName() + " клиент ушел из магазина ");
    //         queue.remove(actor);
    //     }
    // }

    /** переопределение метода: обновление данных. */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    /** переопределение метода: заказ получен */
    @Override
    public void giveOrder() {
        //for (Actor actor : queue) {
        for (iActorBehaviuor actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    /** переопределение метода: покупатель покинул очередь */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        //for (Actor actor : queue) {
        for (iActorBehaviuor actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    //скорее всего так
    // @Override
    // public void releaseFromQueue() {
    //     List<iActorBehaviuor> releaseActors = new ArrayList<>();
    //     //for (Actor actor : queue) {
    //     for (iActorBehaviuor actor : queue) {
    //         if (actor.isTakeOrder()) {
    //             releaseActors.add(actor.getActor());
    //             System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
    //         }
    //     }
    //     releaseFromMarket(releaseActors);
    // }

    /** переопределение метода: покупатель сделaл заказ */
    @Override
    public void takeOrder() {
        //for (Actor actor : queue) {
        for (iActorBehaviuor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");
            }
        }
    }




}
