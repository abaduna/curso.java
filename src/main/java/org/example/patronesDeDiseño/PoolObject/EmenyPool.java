package org.example.patronesDeDiseño.PoolObject;

import java.util.ArrayList;
import java.util.List;

public class EmenyPool {
    List<Enemy> enemyList;

    public EmenyPool() {
        this.enemyList = new ArrayList<>();
    }
    public void createOrcs(int quaantity){
        for (int i = 0; i <quaantity ; i++) {
            Orc orc = new Orc();
            enemyList.add(orc);
        }
    }
    public  Enemy getOrcs(){
       for(Enemy enmy:enemyList){
            if (enmy instanceof  Orc && enmy.getHp() ==0){
                enmy.resar();
                return enmy;
            }
        }
     return null;
    }
}
