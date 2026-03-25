package practise.Service.impl;

import practise.Service.CatService;
import practise.entity.Cat;

public class CatServiceImpl extends AnimalServiceImpl implements CatService{

    @Override
    public void Write(Cat cat) {
        System.out.println(cat.getMaster()+"给"+cat.getName()+cat.getMove()+cat.getFood());
    }
}
