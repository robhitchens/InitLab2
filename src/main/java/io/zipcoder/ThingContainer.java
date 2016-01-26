package io.zipcoder;

/**
 * Created by roberthitchens3 on 1/20/16.
 */
public class ThingContainer {
    private ColorfulThing[] colorArr;
    public ThingContainer(int size){
        colorArr = new ColorfulThing[size];
    }
    public ThingContainer(ColorfulThing[] col){
        colorArr = col;
    }
    public void addThing(ColorfulThing aThing){
        boolean cantAdd = false;
        for(int i = 0; i<colorArr.length;i++){
            if(colorArr[i] == null){
                colorArr[i] = aThing;
                cantAdd = false;
                break;
            }else if(colorArr[i] != null){
                cantAdd = true;
            }
        }
        if(cantAdd){
            System.out.println("ThingContainer is full.");
        }
    }
    public void printThings(){
        for(int i =0; i< colorArr.length; i++){
            if(i == colorArr.length-1) {
                System.out.print(colorArr[i].getColor());
            }else{
                System.out.print(colorArr[i].getColor() + ", ");
            }
        }
    }
    public ColorfulThing pop(){
        ColorfulThing popItem = null;
        for(int i =0; i< colorArr.length; i++){
            if(colorArr[i]== null && i>0){
               popItem = colorArr[i-1];
               colorArr[i-1] = null;
               return popItem;
            }

        }
        return popItem;
    }
    public ColorfulThing remove(ColorfulThing.Color col){
        ColorfulThing rem = null;
        for(int i = 0; i< colorArr.length; i++){
            if(colorArr[i].getColor() == col){
                rem = colorArr[i];
                colorArr = null;
                return rem;
            }
        }
        return rem;
    }
    public ColorfulThing remove(ColorfulThing ct){
        ColorfulThing rem = null;
        for(int i = 0; i<colorArr.length; i++){
            if(colorArr[i].equals(ct)){
                rem = colorArr[i];
                colorArr[i] = null;
                return rem;
            }
        }
        return rem;
    }
    //for testing purposes.
    public boolean isEmpty(){
        boolean empty = true;
        for(int i = 0; i< colorArr.length; i++){
            if(colorArr[i] != null){
                empty = false;
            }
        }
        return empty;
    }

}
