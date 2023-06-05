package com.example.javaproject;

import Modules.Module;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    private Map<String,Integer> storage = new HashMap<String,Integer>();

    public Storage(){
        storage.put("Barrack Module",5);
        storage.put("Engine Module",5);
        storage.put("Gun Module",5);
        storage.put("Mining Module",5);
        storage.put("Shield Module",5);
        storage.put("Storage Module",5);
    }

    public void refillStorage() {
        storage.replace("Barrack Module", 5);
        storage.replace("Engine Module", 5);
        storage.replace("Gun Module", 5);
        storage.replace("Mining Module", 5);
        storage.replace("Shield Module", 5);
        storage.replace("Storage Module",5);
    }

    public void PutBackModule(Module module){
        storage.replace(module.getName(),storage.get(module.getName())+1);
    }

    public boolean TakeModule(Module module){
        if(storage.get(module.getName()) > 0){
            storage.replace(module.getName(),storage.get(module.getName()) - 1);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Moduły w magazynie: ");
        for (Map.Entry<String,Integer> entry: storage.entrySet()) {
            stringBuilder.append("\n");
            stringBuilder.append(String.format("%s = %s",entry.getKey(),entry.getValue()));
        }
        return stringBuilder.toString();
    }
}
