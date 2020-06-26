package com.igeekspace.catanddog;

import java.util.LinkedList;
import java.util.Queue;

public class CatAndDogQueue {
    private int count;
    private Queue<PetEnterInfo> dogQueue;
    private Queue<PetEnterInfo> catQueue;

    public CatAndDogQueue() {
        count = 0;

        dogQueue = new LinkedList<>();
        catQueue = new LinkedList<>();
    }

    public boolean add(Pet pet) {
        String petType = pet.getPetType();

        PetEnterInfo petEnterInfo = new PetEnterInfo(pet, count);
        if (petType.equals("cat")) {
            catQueue.add(petEnterInfo);
            count++;
        } else if (petType.equals("dog")) {
            dogQueue.add(petEnterInfo);
            count++;
        } else {
            return false;
        }

        return true;
    }

    public Pet pollAll() {
        if (dogQueue.isEmpty() && catQueue.isEmpty()) {
            return null;
        } else if (!dogQueue.isEmpty() && !catQueue.isEmpty()) {
            if (dogQueue.peek().timestamp < catQueue.peek().timestamp) {
                return dogQueue.poll().pet;
            } else {
                return catQueue.poll().pet;
            }
        } else if (!dogQueue.isEmpty()) {
            return dogQueue.poll().pet;
        } else {
            return catQueue.poll().pet;
        }
    }

    public Dog pollDog(){
        if(dogQueue.isEmpty()){
            return null;
        }

        return (Dog) dogQueue.poll().pet;
    }

    public Cat pollCat(){
        if(catQueue.isEmpty()){
            return null;
        }

        return (Cat) catQueue.poll().pet;
    }

    public boolean isEmpty(){
        return dogQueue.isEmpty() && catQueue.isEmpty();
    }

    public boolean isDogEmpty(){
        return dogQueue.isEmpty();
    }

    public boolean isCatEmpty(){
        return catQueue.isEmpty();
    }
}
